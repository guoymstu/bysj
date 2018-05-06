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
<div class="pd-20 pingjiao-add">

    <form class="layui-form" action="">

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>教学态度</legend>
        </fieldset>

        <c:forEach items="${pingjiaoitems}" var="item" >
            <c:if test='${item.pjtype eq "教学态度"}'>
                <hr/>
                <div>
                    <h1>（${item.sort}）${item.contentstr}</h1>

                    <div class="layui-input-block" style="margin-top: 20px;">
                        <input type="radio" name="${item.id}" value="${item.maxscore}" title="优秀" checked="checked">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.8}" title="良好">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.6}" title="合格">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.5}" title="不合格">
                    </div>
                </div>


            </c:if>
        </c:forEach>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>教学内容</legend>
        </fieldset>
        <c:forEach items="${pingjiaoitems}" var="item" >
            <c:if test="${item.pjtype eq '教学内容'}">
                <hr/>
                <div>
                    <h1>（${item.sort}）${item.contentstr}</h1>

                    <div class="layui-input-block" style="margin-top: 20px;">
                        <input type="radio" name="${item.id}" value="${item.maxscore}" title="优秀" checked="checked">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.8}" title="良好">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.6}" title="合格">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.5}" title="不合格">
                    </div>
                </div>


            </c:if>
        </c:forEach>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>教学方法</legend>
        </fieldset>

        <c:forEach items="${pingjiaoitems}" var="item" >
            <c:if test="${item.pjtype=='教学方法'}">
                <hr/>
                <div>
                    <h1>（${item.sort}）${item.contentstr}</h1>

                    <div class="layui-input-block" style="margin-top: 20px;">
                        <input type="radio" name="${item.id}" value="${item.maxscore}" title="优秀" checked="checked">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.8}" title="良好">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.6}" title="合格">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.5}" title="不合格">
                    </div>
                </div>


            </c:if>
        </c:forEach>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>教学效果</legend>
        </fieldset>
        <c:forEach items="${pingjiaoitems}" var="item" >
            <c:if test="${item.pjtype=='教学效果'}">
                <hr/>
                <div>
                    <h1>（${item.sort}）${item.contentstr}</h1>

                    <div class="layui-input-block" style="margin-top: 20px;">
                        <input type="radio" name="${item.id}" value="${item.maxscore}" title="优秀" checked="checked">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.8}" title="良好">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.6}" title="合格">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.5}" title="不合格">
                    </div>
                </div>


            </c:if>
        </c:forEach>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>教学管理</legend>
        </fieldset>
        <c:forEach items="${pingjiaoitems}" var="item" >
            <c:if test="${item.pjtype=='教学管理'}">
                <hr/>
                <div>
                    <h1>（${item.sort}）${item.contentstr}</h1>

                    <div class="layui-input-block" style="margin-top: 20px;">
                        <input type="radio" name="${item.id}" value="${item.maxscore}" title="优秀" checked="checked">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.8}" title="良好">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.6}" title="合格">
                        <input type="radio" name="${item.id}" value="${item.maxscore*0.5}" title="不合格">
                    </div>
                </div>
            </c:if>
        </c:forEach>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>主观建议</legend>
        </fieldset>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">建议</label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
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

      $('fieldset+hr').remove()

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
                url: '/admin/user/adduser.shtm',
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