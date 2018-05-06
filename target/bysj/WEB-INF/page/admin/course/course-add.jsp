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
    <script src="/js/jquery.min.js"></script>
    <script src="/plugins/My97DatePicker/WdatePicker.js"></script>

    <title>添加课程</title>
</head>

<body>
<div class="pd-20 user-add">
    <form class="layui-form" action="" method="post">
        <%--课程编号--%>
        <div class="layui-form-item">
            <label class="layui-form-label">课程编号</label>
            <div class="layui-input-inline">
                <input type="text" name="courseid" lay-filter="courseid" lay-verify="courseid" autocomplete="off"
                       placeholder="请输入课程编号" class="layui-input">
            </div>
        </div>
        <%--课程名--%>
        <div class="layui-form-item">
            <label class="layui-form-label">课程名</label>
            <div class="layui-input-inline">
                <input type="text" name="coursename" lay-filter="coursename" lay-verify="coursename" autocomplete="off"
                       placeholder="请输入课程名" class="layui-input">
            </div>
        </div>
        <%--课时--%>
        <div class="layui-form-item">
            <label class="layui-form-label">课时</label>
            <div class="layui-input-inline">
                <input type="text" name="coursehours" lay-filter="coursehours" lay-verify="coursehours"
                       autocomplete="off"
                       placeholder="请输入课时" class="layui-input">
            </div>
        </div>
        <%--上课地址--%>
        <div class="layui-form-item">
            <label class="layui-form-label">上课地址</label>
            <div class="layui-input-inline">
                <input type="text" name="address" lay-filter="address" lay-verify="address"
                       autocomplete="off"
                       placeholder="请输入上课地址" class="layui-input">
            </div>
        </div>
        <%--学分--%>
        <div class="layui-form-item">
            <label class="layui-form-label">学分</label>
            <div class="layui-input-inline">
                <input type="text" name="coursescore" lay-filter="coursescore" lay-verify="coursescore"
                       autocomplete="off"
                       placeholder="请输入学分" class="layui-input">
            </div>
        </div>
        <%--开设时间--%>
        <div class="layui-form-item" lay-verify="">
            <label class="layui-form-label">开设时间</label>
            <div class="layui-input-inline">
                <input name="year" id="year" lay-filter="" placeholder="选择年份" class="layui-input"
                       onClick="WdatePicker({dateFmt:'yyyy',maxDate:new Date().getFullYear()+1})"/>
            </div>

            <div class="layui-input-inline">
                <select name="term" id="term" lay-filter="term">
                    <option value="上学期">上学期</option>
                    <option value="下学期">下学期</option>
                </select>
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
        <%--课程时间安排--%>
        <div class="layui-form-item">
            <label class="layui-form-label">时间安排</label>
            <div class="layui-input-inline">
                <input type="text" name="timeplan" lay-filter="timeplan" lay-verify="timeplan"
                       autocomplete="off"
                       placeholder="具体时间安排" class="layui-input">
            </div>
        </div>
        <%--上课人数--%>
        <div class="layui-form-item">
            <label class="layui-form-label">上课人数</label>
            <div class="layui-input-inline">
                <input type="tel" name="countstu" lay-verify="countstu" autocomplete="off" placeholder="请输入上课人数"
                       maxlength="11" class="layui-input">
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
</body>
<script>


    layui.use(['form', 'jquery'], function () {
        var form = layui.form(),
            $ = layui.jquery;

        //课程类型
        form.on('select(coursetype)', function () {
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
        form.on('submit(add)', function (data) {
            var flag = '0';
            $.ajax({
                async: false,
                url: '/admin/course/saveCourse.shtm',
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