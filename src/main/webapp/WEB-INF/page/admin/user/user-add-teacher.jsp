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

            <input name="role" value="teacher" hidden="hidden"/>

            <div class="layui-form-item">
                <label class="layui-form-label">学号/工号</label>
                <div class="layui-input-inline">
                    <input type="text" name="uid" lay-filter="uid" lay-verify="uid" autocomplete="off"
                           placeholder="请输入学号/工号" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-inline">
                    <input type="text" name="username" lay-filter="username" lay-verify="username" autocomplete="off"
                           placeholder="请输入用户名" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">选择院系</label>
                <div class="layui-input-inline">
                    <select name="yuanxi">
                        <c:if test="${not empty yuanxis}">
                            <option value=""></option>
                            <c:forEach var="item" items="${yuanxis}">
                                <option value="${item.yuanxi}">${item.yuanxi}</option>
                            </c:forEach>
                        </c:if>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">职称</label>
                <div class="layui-input-inline">
                    <select name="tealevel">
                        <option value="讲师">讲师</option>
                        <option value="高级讲师">高级讲师</option>
                        <option value="教授">教授</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">性别</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="男" title="男" checked>
                    <input type="radio" name="sex" value="女" title="女">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">手机号</label>
                <div class="layui-input-inline">
                    <input type="tel" name="telnum" lay-verify="mobile" autocomplete="off" placeholder="请输入手机号"
                           maxlength="11" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">邮箱</label>
                <div class="layui-input-inline">
                    <input type="text" name="email" lay-verify="emails" autocomplete="off" placeholder="请输入邮箱"
                           class="layui-input">
                </div>
            </div>

            <div class="layui-form-item" lay-verify="">
                <label class="layui-form-label">所在地区</label>
                <div class="layui-input-inline">
                    <select name="province" id="province" lay-filter="province"></select>
                </div>
                <div class="layui-input-inline">
                    <select name="city" id="city" lay-filter="city"></select>
                </div>
                <div class="layui-input-inline">
                    <select name="county" id="county" lay-filter="county"></select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">详细地址</label>
                <div class="layui-input-inline sw-times2">
                    <input type="text" name="address" lay-verify="address" autocomplete="off" placeholder="请输入街道、楼牌号等"
                           class="layui-input">
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


    var mypcas = new PCAS('province,请选择省份', 'city,请选择城市', 'county,请选择县区');
    layui.use(['form', 'jquery'], function () {
        var form = layui.form(),
            $ = layui.jquery;
        /*城市选择*/
        var province, city;
        form.on('select(province)', function (data) {
            console.log(data.elem); //得到select原始DOM对象
            console.log(data.value); //得到被选中的值
            province = data.value;
            mypcas.SetValue(data.value, "", "");
            form.render('select');
        });
        form.on('select(city)', function (data) {
            console.log(data.elem); //得到select原始DOM对象
            console.log(data.value); //得到被选中的值
            city = data.value;
            mypcas.SetValue(province, data.value, "");
            form.render('select');
        });
        form.on('select(county)', function (data) {
            console.log(data.elem); //得到select原始DOM对象
            console.log(data.value); //得到被选中的值
            mypcas.SetValue(province, city, data.value);
            form.render('select');
        });
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