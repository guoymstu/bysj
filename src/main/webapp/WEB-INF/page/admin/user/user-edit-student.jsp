<%@ include file="../../include.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <link rel="stylesheet" href="../../css/index.css">
    <link rel="stylesheet" href="../../js/lib/layui/css/layui.css">
    <title>用户添加</title>
</head>

<body>
<div class="pd-20 user-add">
    <form class="layui-form" action="" method="post">

        <%--角色--%>
        <input name="role" value="student" hidden="hidden"/>
        <%--学号--%>
        <div class="layui-form-item">
            <label class="layui-form-label">学号/工号</label>
            <div class="layui-input-inline">
                <input type="text" name="uid" lay-filter="uid" lay-verify="uid" autocomplete="off"
                       placeholder="请输入学号/工号" class="layui-input" value="${student.id}">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="username" lay-filter="username" lay-verify="username" autocomplete="off"
                       placeholder="请输入用户名" class="layui-input" value="${student.name}">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="男" title="男" <c:if test="${student.sex eq '男'}"> checked="checked"</c:if>>
                <input type="radio" name="sex" value="女" title="女" <c:if test="${student.sex eq '女'}"> checked="checked"</c:if>>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-inline">
                <input type="tel" name="telnum" lay-verify="mobile" autocomplete="off" placeholder="请输入手机号"
                       maxlength="11" class="layui-input" value="${student.telnum}">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">邮箱</label>
            <div class="layui-input-inline">
                <input type="text" name="email" lay-verify="emails" autocomplete="off" placeholder="请输入邮箱"
                       class="layui-input" value="${student.mail}">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">身份证号码</label>
            <div class="layui-input-inline">
                <input type="text" name="idcardnum" lay-verify="idcard" autocomplete="off" placeholder="请输入身份证号码"
                       maxlength="18" class="layui-input" value="${student.idcardnum}">
            </div>
        </div>

        <div class="layui-form-item" lay-verify="">
            <label class="layui-form-label">专业</label>
            <div class="layui-input-inline">
                <select name="nianji" id="select_nianji" lay-filter="nianji">
                    <option value="">请选择年级</option>
                </select>

            </div>
            <div class="layui-input-inline">
                <select name="yuanxi" id="select_yuanxi" lay-filter="yuanxi">
                    <option value="">请选择院系</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="zhuanye" id="select_zhuanye" lay-filter="zhuanye">
                    <option value="">请选择专业</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item" lay-verify="">
            <label class="layui-form-label">班级</label>
            <div class="layui-input-inline">
                <select name="banji" id="select_banji" lay-filter="banji">
                    <option value="">请选择班级</option>
                </select>
            </div>
        </div>




        <div class="layui-form-item">
            <label class="layui-form-label">详细地址</label>
            <div class="layui-input-inline sw-times2">
                <input type="text" name="address" lay-verify="address" autocomplete="off" placeholder="请输入街道、楼牌号等"
                       class="layui-input" value="${student.address}">
            </div>
        </div>


        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-inline">
                <button class="layui-btn" lay-submit="" id="add" lay-filter="useradd">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>

    </form>
</div>

<input id="nianjis" value='${nianjis}' hidden="hidden"/>
<input id="yuanxis" value='${yuanxis}' hidden="hidden"/>
<input id="zhuanyes" value='${zhuanyes}' hidden="hidden"/>
<input id="banjis" value='${banjis}' hidden="hidden"/>

<script src="/js/lib/layui/layui.js"></script>
<script src="/js/define/common.js"></script>
<script src="/js/lib/selectCity.js"></script>
</body>
<script>
    layui.use(['form', 'jquery'], function () {
        var form = layui.form(),
            $ = layui.jquery;

        var nianjis = $.parseJSON($('#nianjis').val());
        var yuanxis = $.parseJSON($('#yuanxis').val());
        var zhuanyes = $.parseJSON($('#zhuanyes').val());
        var banjis = $.parseJSON($('#banjis').val());

        /**班级四级联动*/
        $(function () {
            select_nianji();
        });

        function select_nianji() {
            var select = $("#select_nianji")
            var len = nianjis.length;
            for (var i = 0; i < len; i++) {
                var option = '<option value="' + nianjis[i].nianji + '">' + nianjis[i].nianji + '</option>'
                select.append(option);
            }
            form.render('select');
        }

        form.on('select(nianji)', function (data) {
            select_yuanxi(data.value);
            form.render('select');
        });


        function select_yuanxi(nianji) {
            var select = $("#select_yuanxi")
            var option = '<option value="">请选择院系</option>'
            select.html(option);
            var len = yuanxis.length;
            for (var i = 0; i < len; i++) {
                if (yuanxis[i].nianji == nianji) {
                    var option = '<option value="' + yuanxis[i].yuanxi + '">' + yuanxis[i].yuanxi + '</option>'
                    select.append(option);
                }
            }
            form.render('select');
        }

        form.on('select(yuanxi)', function (data) {
            select_zhuanye(data.value);
        });

        function select_zhuanye(yuanxi) {
            var select = $('#select_zhuanye')
            var option = '<option value="">请选择专业</option>'
            select.html(option);
            var len = zhuanyes.length;
            select.append(option);
            for (var i = 0; i < len; i++) {
                if (zhuanyes[i].yuanxi == yuanxi) {
                    var option = '<option value="' + zhuanyes[i].zhuanye + '">' + zhuanyes[i].zhuanye + '</option>'
                    select.append(option);
                }
            }
            form.render('select');
        }

        form.on('select(zhuanye)', function (data) {
            select_banji(data.value);
        });

        function select_banji(zhuanye) {
            var select = $('#select_banji')
            var option = '<option value="">请选择班级</option>'
            select.html(option);
            var len = banjis.length;
            for (var i = 0; i < len; i++) {
                if (banjis[i].zhuanye == zhuanye) {
                    var option = '<option value="' + banjis[i].id + '">' + banjis[i].banji + '</option>'
                    select.append(option);
                }
            }
            form.render('select');
        }

        /*表单验证*/
        /*  form.verify({
              //验证可以有两种方法，一种if，一种直接判断
              username: function (value) {
                  if (!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)) {
                      return '用户名不能有特殊字符';
                  }
                  if (/(^\_)|(\__)|(\_+$)/.test(value)) {
                      return '用户名首尾不能出现下划线\'_\'';
                  }
                  if (/^\d+\d+\d$/.test(value)) {
                      return '用户名不能全为数字';
                  }
              },
              pass: [
                  /(?!^\[0-9]+$)(?!^[a-zA-Z]+$)(?!^[_#@]+$).{6,20}/, '密码必须6到20位，且不能出现空格'
              ],
              mobile: function (value) {
                  if (!new RegExp(/^0?(13|14|15|18|17)[0-9]{9}$/).test(value)) {
                      return "手机号格式不正确"
                  }
              },
              idcard: function (value) {
                  if (!new RegExp(/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/).test(value)) {
                      return "身份证号码格式不正确"
                  }
              },
              address: function (value) {
                  if (value == "") {
                      return "请输入正确的详细地址";
                  }
              }
          });*/
        //blur监听
        $('input[name="username"]').on('blur', function () {
            var value = $(this).val();
            if (!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)) {
                layer.msg('用户名不能有特殊字符');
            }
            if (/(^\_)|(\__)|(\_+$)/.test(value)) {
                layer.msg('用户名首尾不能出现下划线\'_\'');
            }
            if (/^\d+\d+\d$/.test(value)) {
                layer.msg('用户名不能全为数字');
            }
        });

        //监听提交
        form.on('submit(useradd)', function (data) {

            var flag = '0';
            $.ajax({
                async: false,
                url: '/admin/user/saveuser.shtm',
                data: data.field,
                type: 'post',
                dataType: "json",
                success: function (data) {

                    if (data.status == 'success') {
                        layer.alert(data.msg, function () {
                            parent.location.reload();
                            layer_close()
                        });
                        flag = '1';
                    }
                },
                error: function (jqXHR, textstatus, errorThrown) {
                    layer.alert(jqXHR.responseText);
                }
            });//ajax

            if (flag == 0) {
                return true;
            } else {
                return false;
            }
        });


    })


</script>


</html>