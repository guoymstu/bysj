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
    <title>添加评教项目</title>
</head>
<style>

    .layui-form-label {
        width: 105px;
    }
</style>
<body>
<div class="pd-20 pingjiao-add">
    <form class="layui-form" action="" method="post">

        <%--题目编号--%>
        <div class="layui-form-item">
            <label class="layui-form-label">题目编号</label>
            <div class="layui-input-inline">
                <input type="text" name="id" lay-filter="id" lay-verify="id" autocomplete="off"
                       placeholder="请输入题目编号" class="layui-input">
            </div>
        </div>
        <%--课程类型--%>
        <div class="layui-form-item">
            <label class="layui-form-label">课程类型</label>
            <div class="layui-input-inline">
                <select name="coursetype">
                    <c:if test="${not empty coursetypes}">
                        <option value="">请选择</option>
                        <c:forEach var="item" items="${coursetypes}">
                            <option value="${item.coursetype}">${item.coursetype}</option>
                        </c:forEach>
                    </c:if>
                </select>
            </div>
        </div>
        <%--评教类型--%>
        <div class="layui-form-item">
            <label class="layui-form-label">评教类型</label>
            <div class="layui-input-inline">
                <select name="pingjiaotype">
                    <option value="教学态度">教学态度</option>
                    <option value="教学方法">教学方法</option>
                    <option value="教学效果">教学效果</option>
                    <option value="教学内容">教学内容</option>
                </select>
            </div>
        </div>
        <%--分值--%>
        <div class="layui-form-item">
            <label class="layui-form-label">分值</label>
            <div class="layui-input-inline">
                <input type="text" name="maxscore" lay-filter="maxscore" lay-verify="maxscore" autocomplete="off"
                       placeholder="请输入分值" class="layui-input">
            </div>
        </div>
        <%--排序--%>
        <div class="layui-form-item">
            <label class="layui-form-label">排序</label>
            <div class="layui-input-inline">
                <input type="text" name="sort" lay-filter="sort" lay-verify="sort" autocomplete="off"
                       placeholder="请输入排序" class="layui-input">
            </div>
        </div>
        <%--内容--%>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">评教内容</label>
            <div class="layui-input-block">
                <textarea name="pingjiaocontent" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>
        <%--按钮--%>
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-inline">
                <button class="layui-btn" lay-submit="" id="add" lay-filter="add">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>

    </form>
</div>
<script src="/js/lib/layui/layui.js"></script>
<script src="/js/define/common.js"></script>
<script src="/js/lib/selectCity.js"></script>
</body>
<script>
    layui.use(['form', 'jquery'], function () {
        var form = layui.form(),
            $ = layui.jquery;
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
        // $('input[name="username"]').on('blur', function () {
        //     var value = $(this).val();
        //     if (!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)) {
        //         layer.msg('用户名不能有特殊字符');
        //     }
        //     if (/(^\_)|(\__)|(\_+$)/.test(value)) {
        //         layer.msg('用户名首尾不能出现下划线\'_\'');
        //     }
        //     if (/^\d+\d+\d$/.test(value)) {
        //         layer.msg('用户名不能全为数字');
        //     }
        // });

        //监听提交
        form.on('submit(add)', function (data) {

            var flag = '0';
            $.ajax({
                async: false,
                url: '/admin/pingjiao/pingjiaoadd.shtm',
                data: data.field,
                type: 'post',
                dataType: "json",
                success: function (data) {
                    if (data.status == 'success') {
                        layer.alert(data.msg, function () {
                            parent.location.reload();
                            layer_close()
                        });
                        if (data.status == 'fail') {
                            layer.alert(data.msg, function () {
                                parent.location.reload();
                                layer_close()
                            });
                        }
                        flag = '1';
                    }
                }
                ,
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