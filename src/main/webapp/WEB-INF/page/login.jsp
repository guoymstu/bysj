<%@ include file="include.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>


<!DOCTYPE html >
<html lang="UTF-8">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link rel="stylesheet" href="plugins/layui-master/dist/css/layui.css">
    <script src="js/jquery.min.js"></script>
    <style>

        table {
            border-collapse: inherit;
            border-spacing: 8px;
        }

        /*登录模块div居中*/
        #loginDiv {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }
    </style>


</head>

<body background="img/loginbg.jpg" onload="document.forms[0].elements[0].focus();">

<div class="layui-row">

    <div id="loginDiv" class="layui-col-md3" style="padding: 20px;background-color: white;">

        <form id="loginForm" class="layui-row layui-form">
            <table width="100%">

                <tr>
                    <td colspan="2"><img height="40px" src="img/xcu.png" alt="" >学生评教系统</td>
                </tr>

                <tr>
                    <td colspan="2"><input id="username" name="username" class="layui-input" width="100%"
                                           placeholder="用户名"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input id="password" name="password" type="password" class="layui-input"
                                           width="100%"
                                           placeholder="密码"></td>
                </tr>
                <tr>
                    <td width="50%"><input id="validateCode" name="validateCode" class="layui-input" width="100%"
                                           placeholder="验证码"></td>
                    <td><img id="randomImg" title="点击更换" style="vertical-align:middle;height:34px;width:100%"
                             onclick="refresh(this);" src="randomValidateCode.chtm"></td>
                </tr>

                <tr>
                    <td colspan="2">  <p id="errmsg"><span style="color: red; display:none"> </span></p><!--错误信息--></td>
                </tr>

                <tr>
                    <td colspan="2">
                        <button type="button" id="submitAjax" style="width: 100%;" class="layui-btn layui-btn-small">
                            登录
                        </button>
                    </td>
                </tr>

            </table>

        </form>


    </div>
</div>

</body>


<script type="text/javascript">

    //刷新验证码
    function refresh(obj) {
        debugger
        obj.src = "randomValidateCode.chtm?" + Math.random();
    }

    $(function () {
        //绑定回车按键
        $(document).keyup(function (event) {
            if (event.keyCode == 13) {
                $("#submitAjax").trigger("click");
            }
        });
        //ajax提交登录信息
        $("#submitAjax").click(function () {
            debugger
            var validateCode = $("#validateCode").val().trim();
            var username = $('#username').val().trim();

            var password = $('#password').val().trim();
            if (validateCode.length == 0) {
                $("#errmsg span").html("请输入验证码").show();
                $("#randomImg").attr('src', "randomValidateCode.chtm?" + Math.random());
                return false;
            }

            if (username.length == 0) {
                $("#username").siblings().find("span").html("请输入账户");
                $("#username").siblings().find("span").show();
                $("#randomImg").attr('src', "randomValidateCode.chtm?" + Math.random());
                return false;
            }
            if (password.length == 0) {
                $("#password").siblings().find("span").html("请输入密码");
                $("#password").siblings().find("span").show();
                $("#randomImg").attr('src', "randomValidateCode.chtm?" + Math.random());
                return false;
            }

            $.ajax({
                type: "post",
                dataType: "json",
                data: {validateCode: validateCode, username: username, password: password},
                url: "authLogin.chtm",
                success: function (data) {
                    console.log(data)
                    if (data.success == false) {
                        if (data.status == "username") {
                            $("#errmsg").find("span").html(data.msg);
                            $("#errmsg").find("span").show();
                            $("#randomImg").attr('src', "randomValidateCode.chtm?" + Math.random());
                        }
                        if (data.status == "password") {
                            $("#errmsg").find("span").html(data.msg);
                            $("#errmsg").find("span").show();
                            $("#randomImg").attr('src', "randomValidateCode.chtm?" + Math.random());
                        }
                        if (data.status == "validateCode") {
                            $("#errmsg").find("span").html(data.msg);
                            $("#errmsg").find("span").show();
                            $("#randomImg").attr('src', "randomValidateCode.chtm?" + Math.random());
                        }
                    } else if (data.success == true) {
                        window.location.href = "index.shtm";
                    }
                }
            });
        });
        //防止页面后退
        history.pushState(null, null, document.URL);
        window.addEventListener('popstate', function () {
            history.pushState(null, null, document.URL);
        });
    });


</script>


</html>