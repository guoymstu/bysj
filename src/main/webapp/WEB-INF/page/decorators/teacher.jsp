<%--
  Created by IntelliJ IDEA.
  User: guoym
  Date: 2018/4/12
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="../include.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/js/lib/layui/css/layui.css">
</head>

<style>


</style>


<body>
<div class="layui-layout-admin fly-body">


    <div class="layui-header">
        <div class="admin-title dp-ib"><h1 class="fs-24 dp-ib c-fff mgl-20 mgt-10">学生评教系统</h1></div>


        <div href="#!" class="layui-right user"><a href="#!" class="user-avatar">
            <i class="layui-icon" style="font-size: 30px; color:white;">&#xe612;</i><span
                class="c-fff mgl-20"><shiro:principal></shiro:principal></span></a>
            <ul class="user-nav">
                <li class="user-nav-item"><a href="#!"><i class="layui-icon">&#xe612;</i> 个人设置</a></li>
                <li class="user-nav-item"><a href="<%=basePath%>loginout.shtm" id="btn-exit"><i class="layui-icon">&#xe623;</i> 退出</a>
                </li>
            </ul>

        </div>

    </div>


    <%--左侧菜单--%>
    <div class="layui-side">
        <ul class="layui-nav layui-nav-tree" id="sideNav" lay-filter="sideNav">

            <li class="layui-nav-item layui-nav-itemed"><a>课程管理</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" data-url="<%=basePath%>teacher/course/selectCourse.shtm"><label>教师选课</label></a>
                    </dd>
                    <dd><a href="javascript:;" data-url="<%=basePath%>teacher/course/mycourse.shtm"><label>我的课程</label></a></dd>
                </dl>
            </li>


            <li class="layui-nav-item"><a>学生管理</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" data-url="<%=basePath%>teacher/student/studentListView.shtm"><label>我的学生</label></a></dd>
                </dl>

            </li>


            <li class="layui-nav-item"><a>信息维护</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" data-url="<%=basePath%>teacher/infoEdit.shtm"><label>个人信息设置</label></a></dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" data-url="<%=basePath%>teacher/resetpwd.shtm"><label>修改密码</label></a></dd>
                </dl>
            </li>

            <li class="layui-nav-item"><a>我的评价</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" data-url="<%=basePath%>teacher/pingjiao/myPingjiaoView.shtm"><label>我的评价</label></a></dd>
                </dl>
            </li>
        </ul>

    </div>


    <div class="layui-body">
        <div class="layui-tab fly-tab layui-tab-card" lay-filter="page-tab" lay-allowclose="true">
            <ul class="layui-tab-title" id="tabTitle">
                <li class="layui-this" lay-id="0"><label>首页</label></li>
            </ul>
            <div class="layui-tab-content" id="tabContainers">
                <div class="layui-tab-item layui-show">
                    <div class="fly-echart echart-map sw-100" id="user-form-map">地图</div>
                    <div class="fly-echart echart-pie sw-50 fl" id="user-form-pie">饼状图</div>
                    <div class="fly-echart echart-line sw-50 fl" id="user-form-line">折线图</div>
                    <div class="fly-echart echart-bar sw-100 fl" id="user-form-bar">柱状和折线</div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/js/lib/layui/layui.js"></script>
<script src="/js/define/index.js"></script>
<script src="/js/define/common.js"></script>
<script src="/js/echarts.min.js"></script>
<script src="/js/lib/echarts/macarons.js"></script>
<script src="/js/lib/echarts/china.js"></script>
<script src="/js/define/user-collect.js"></script>

<script>
</script>
</body>
</html>