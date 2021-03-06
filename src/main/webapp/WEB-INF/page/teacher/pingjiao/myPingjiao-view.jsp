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
<style>
    .content-left {
        text-align: center;
        width: 20%;
        font-size: 60px;
        color: red;
        font-style: italic;
    }

    .content-right {
        width: 80%;
    }
</style>

<body>

<div class="layui-collapse" lay-filter="test">
    <c:forEach var="item1" items="${marks}">
        <div class="layui-colla-item">
            <h1 class="layui-colla-title">${item1.coursename}</h1>
            <div class="layui-colla-content">
                <table width="100%">
                    <tr height="200px">
                        <td class="content-left">${item1.mark}分</td>
                        <td class="content-right">
                            <marquee direction="up" behavior="alternate" scrollamount="5" height="200px">
                                <c:forEach var="item2" items="${remarks}">
                                    <c:if test="${item1.courseid==item2.courseid}">
                                        <p>${item2.remark}</p>
                                        <hr>
                                    </c:if>

                                </c:forEach>

                            </marquee>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </c:forEach>
</div>


<script src="/js/lib/layui/layui.js"></script>
<script src="/js/define/common.js"></script>
</body>
<script>


    layui.use(['form', 'jquery'], function () {
        var form = layui.form(),
            $ = layui.jquery;

        $('fieldset+hr').remove()//

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
        //监听提交
        form.on('submit(add)', function (data) {
            var keyvalue = $("#pingjiaoForm").serializeArray();
            var courseid = $("#courseid").val();
            var issue = $("#issue").val();
            var flag = '0';
            $.ajax({
                async: false,
                url: '/student/course/addpingjiao.shtm',
                data: {record: JSON.stringify(keyvalue), courseid: courseid, issue: issue},
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