<%@ include file="../../include.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <link rel="stylesheet" href="../../css/index.css">
    <link rel="stylesheet" href="../../js/lib/layui/css/layui.css">
</head>
<body>
<div class="tab-body"><p class="page-tab"><span class="layui-breadcrumb" lay-separator=">"><a href="">首页</a><a><cite>课程列表</cite></a></span>
</p>
    <div class="handle-box">
        <ul>
            <li class="handle-item"><span class="layui-form-label">输入课程名或编号：</span>
                <div class="layui-input-inline"><input id="keyword" name="keyword" type="text" autocomplete="off"
                                                       placeholder="请输入搜索条件"
                                                       class="layui-input"></div>


                <button class="layui-btn mgl-20" id="search">查询</button>
                <button class="layui-btn mgl-20" id="refresh">刷新</button>

                <div class="fr">
                    <%--<a class="layui-btn layui-btn-danger radius btn-delect" id="btn-delect-all"><i--%>
                            <%--class="linyer icon-delect"></i> 批量删除</a>--%>
                    <a class="layui-btn btn-add btn-default" id="btn-addcourse"><i class="linyer icon-add"></i> 添加课程</a>
                </div>
            </li>
        </ul>
    </div>
    <div class="layui-clear">
        <div class="tableTools fr"></div>
    </div>
    <table class="table-box table-sort" id="courseTable">
        <thead>
        <tr>
            <th><input type="checkbox" class="btn-checkall fly-checkbox"></th>
            <th>课程编号</th>
            <th>课程名</th>
            <th>课时</th>
            <th>上课地址</th>
            <th>学分</th>
            <th>开设时间</th>
            <th>课程类型</th>
            <th>课程安排</th>
            <th>上课人数</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody></tbody>
        <tfoot>
        <tr>
            <th><input type="checkbox" class="btn-checkall fly-checkbox"></th>
            <th>课程编号</th>
            <th>课程名</th>
            <th>课时</th>
            <th>上课地址</th>
            <th>学分</th>
            <th>开设时间</th>
            <th>课程类型</th>
            <th>课程安排</th>
            <th>上课人数</th>
            <th>操作</th>
        </tr>
        </tfoot>
    </table>
</div>
<script src="../../js/lib/layui/layui.js"></script>
<script src="../../js/define/common.js"></script>


</body>
<script>

    //初始化
    layui.use(['layer', 'datatable', 'datatableButton', 'datatableFlash', 'datatableHtml5', 'datatablePrint', 'datatableColVis', 'datatableSelect'], function () {
        var $ = layui.jquery, layer = layui.layer;
        // oSort是排序类型数组, 'chinese-asc'是自己定义的类型的排序(*-asc || *-desc)名称
        // 插件应该会根据表格中的内容的类型(string, number, chinese)进行比较排序，
        // 如果以chinese类型来排序则用oSort['chinese-asc']和oSort['chinese-desc']的方法
        // oSort对应的function里面自定义比较方法
        $.fn.dataTableExt.oSort['chinese-asc'] = function (x, y) {
            //javascript自带的中文比较函数，具体用法可自行查阅了解
            return x.localeCompare(y);
        };

        $.fn.dataTableExt.oSort['chinese-desc'] = function (x, y) {
            return y.localeCompare(x);
        };
        // aTypes是插件存放表格内容类型的数组
        // reg赋值的正则表达式，用来判断是否是中文字符
        // 返回值push到aTypes数组，排序时扫描该数组，'chinese'则调用上面两个方法。返回null默认是'string'
        $.fn.dataTableExt.aTypes.push(
            function (sData) {
                var reg = /^[\u4e00-\u9fa5]{0,}$/;
                if (reg.test(sData)) {
                    return 'chinese';
                }
                return null;
            }
        );
        $(document).ready(function () {
            var myTable = $('#courseTable').DataTable({
                "processing": true, //DataTables载入数据时，是否显示‘进度’提示
                "stateSave": true, //是否打开客户端状态记录功能,此功能在ajax刷新纪录的时候不会将个性化设定回复为初始化状态
                "scrollCollapse": true, //是否开启DataTables的高度自适应，当数据条数不够分页数据条数的时候，插件高度是否随数据条数而改变
                "paginationType": "full_numbers", //详细分页组，可以支持直接跳转到某页
                "language": lang, //提示信息
                "autoWidth": false, //自适应宽度，
                "lengthMenu": [15, 30, 50],
                "stripeClasses": ["odd", "even"], //为奇偶行加上样式，兼容不支持CSS伪类的场合
                "searching": true, //是否允许Datatables开启本地搜索
                "paging": true, //是否开启本地分页
                "lengthChange": true, //是否允许产品改变表格每页显示的记录数
                "info": true, //控制是否显示表格左下角的信息
                //跟数组下标一样，第一列从0开始，这里表格初始化时，第四列默认降序
                "order": [1, 'desc'], //asc升序   desc降序
                "aoColumnDefs": [{
                    "orderable": false,
                    "aTargets": [0, 10] // 指定列不参与排序
                }],
                "deferRender": true, //延迟渲染
                "ajax": {
                    url: 'getCourse.shtm?keyword=' + $("#keyword").val(),
                    dataSrc: 'courses'
                },

                "columns": [
                    { //定义列
                        "data": function (obj) {
                            return '<input type="checkbox" class="fly-checkbox" name="sublist" data-id=' + obj.id + '>';
                        },
                        "sTitle": "<input type='checkbox' class='btn-checkall fly-checkbox'>", //标题
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    }, {
                        "data": "id",
                        "sTitle": "课程编号", //标题
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    }, {
                        "data": function (obj) {
                            return '<u class="btn-showuser">' + obj.coursename + '</u>';
                        },
                        "sTitle": "课程名", //标题
                        "sType": 'chinese',
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    },
                    {
                        "data": "coursehours",
                        "sTitle": "课时", //标题
                        "sType": 'chinese',
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    }, {
                        "data": "address",
                        "sTitle": "上课地址", //标题
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    },
                    {
                        "data": "coursescore",
                        "sTitle": "学分", //标题
                        "sType": 'chinese',
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    },
                    {
                        "data": "year",
                        "sTitle": "开设时间", //标题
                        "sType": 'chinese',
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    },
                    {
                        "data": "coursetype",
                        "sTitle": "课程类型", //标题
                        "sType": 'chinese',
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    },
                    {
                        "data": "timeplan",
                        "sTitle": "课程安排", //标题
                        "sType": 'chinese',
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    },
                    {
                        "data": "countstu",
                        "sTitle": "上课人数", //标题
                        "sType": 'chinese',
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    },

                    {
                        "data": function (obj) {

                            return '<span title="编辑" class="handle-btn handle-btn-edit"><i class="linyer icon-edit"></i></span>' +
                                '<span title="删除" class="handle-btn handle-btn-delect"><i class="linyer icon-delect"></i></span>';

                        },
                        "className": "td-handle",
                        "sTitle": "操作", //标题
                        "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                    }]
            });

            /**
             *  查询刷新
             */
            $('#search').on('click', function () {
                reloadTable();
            });

            function reloadTable() {
                console.log($("#keyword").val());
                myTable.ajax.url('getCourse.shtm?keyword=' + $("#keyword").val()).load();
            }


            /**
             * 添加falsh
             */
            $.fn.dataTable.Buttons.swfPath = "../../js/lib/dataTables/extensions/Buttons/swf/flashExport.swf";
            $.fn.dataTable.Buttons.defaults.dom.container.className = 'tableTools-box';
            /**
             * 操作栏
             */
            new $.fn.dataTable.Buttons(myTable, {
                buttons: [{
                    "extend": "colvis",
                    "text": "<i class='linyer icon-search'></i> <span class='hidden'>显示/隐藏列</span>",
                    "className": "layui-btn table-tool",
                    columns: ':not(:first):not(:last)'
                }, {
                    "extend": "copy",
                    "text": "<i class='linyer icon-copy'></i> <span class='hidden'>复制到剪贴板</span>",
                    "className": "layui-btn table-tool"
                }, {
                    "extend": "csv",
                    "text": "<i class='linyer icon-exports'></i> <span class='hidden'>导出csv</span>",
                    "className": "layui-btn table-tool"
                }, {
                    "extend": "excel",
                    "text": "<i class='linyer icon-excel'></i> <span class='hidden'>导出excel</span>",
                    "className": "layui-btn table-tool"
                }, {
                    "extend": "pdf",
                    "text": "<i class='linyer icon-pdf'></i> <span class=''>导出pdf</span>",
                    "className": "layui-btn table-tool"
                }, {
                    "extend": "print",
                    "text": "<i class='linyer icon-print'></i> <span class='hidden'>打印</span>",
                    "className": "layui-btn table-tool",
                    autoPrint: false,
                    message: '此打印是使用DataTable的打印按钮生成的!'
                }]
            });
            myTable.buttons().container().appendTo($('.tableTools'));
            /**
             * 显示隐藏列
             */
            var defaultColvisAction = myTable.button(0).action();
            myTable.button(0).action(function (e, dt, button, config) {
                defaultColvisAction(e, dt, button, config);
                if ($('.dt-button-collection > .dropdown-menu').length == 0) {
                    $('.dt-button-collection')
                        .wrapInner('<ul class="dropdown-menu" />')
                        .find('a').attr('href', 'javascript:;').wrap("<li />")
                }
                $('.dt-button-collection').appendTo('.tableTools-box')
            });
            /**
             * 复制到剪贴板
             */
            var defaultCopyAction = myTable.button(1).action();
            myTable.button(1).action(function (e, dt, button, config) {
                defaultCopyAction(e, dt, button, config);
            });
            /**
             * 选择
             */
            var ss = 0;
            myTable.on('select', function (e, dt, type, index) {
                if (type === 'row') {
                    $(myTable.row(index).node()).find('input:checkbox').prop('checked', true);
                    ss = $(myTable.row(index).node()).find('input.fly-checkbox:checkbox').data('id'); //获取该行data-id
                    console.log(ss);
                }
            });
            $('#ssss').on('click', function () {
                var selectRow1 = myTable;
                var selectRow = $($(myTable).context[0].nTBody).find('tr.selected');
                console.log(selectRow1);
            })
            /**
             * 取消选择
             */
            myTable.on('deselect', function (e, dt, type, index) {
                if (type === 'row') {
                    $(myTable.row(index).node()).find('input:checkbox').prop('checked', false);
                }
            });
            /**
             * 根据表头复选框 选择/取消选择所有行
             */
            $(document).on('click', '#userTable > thead > tr > th input[type=checkbox],#userTable > tfoot > tr > th input[type=checkbox]', function () {
                var th_checked = this.checked;
                $('#userTable').find('tbody > tr').each(function () {
                    var row = this;
                    if (th_checked) myTable.row(row).select();
                    else myTable.row(row).deselect();
                });
            });
            /**
             * 选中/取消选中复选框时 选中/取消选中一行
             */
            $(document).on('click', '#userTable tbody td input[type=checkbox]', function () {
                var row = $(this).closest('tr').get(0);
                if (!this.checked) myTable.row(row).deselect();
                else myTable.row(row).select();
            });
            $(document).on('click', '#userTable tbody td', function () {
                var row = $(this).closest('tr').get(0);
            })
        });
        //用户--查看
        $("#userTable").on('click', '.btn-showuser', function () {
            var username = $(this).html();
            var href = 'user-show.html';
            layer_show(username, href, '', '400', '500');
        });

        /*课程-添加*/
        $("#btn-addcourse").on('click', function () {
            var title = $(this).html();
            var href = 'course-add.shtm';
            layer_show(title, href, '', '800', '500');
        });

        /*课程-编辑*/
        $('.table-sort').on('click', '.handle-btn-edit', function () {
            var obj = $(this);
            var courseid = $(obj).parents("tr").find("td:nth-child(2)").html();
            layer_show('编辑', 'course-edit.shtm?courseid='+courseid, '', '800', '500');
        });

        /*课程-删除*/
        $('.table-sort').on('click', '.handle-btn-delect', function () {
            var obj = $(this);
            var courseid = $(obj).parents("tr").find("td:nth-child(2)").html();
            console.log(courseid);
            layer.confirm('确认要删除吗？', {
                icon: 0,
                title: '警告',
                shade: false
            }, function (index) {

                $.ajax({
                    async: false,
                    url: '/admin/course/delcourse.shtm',
                    data: {courseid: courseid},
                    type: 'post',
                    dataType: "json",
                    success: function (data) {
                        if (data.status == 'success') {
                            $(obj).parents("tr").remove(); //删除方法
                            layer.msg('课程已删除!', {
                                icon: 6,
                                time: 1000
                            });
                        }
                    },
                    error: function (jqXHR, textstatus, errorThrown) {
                        layer.alert(jqXHR.responseText);
                    }
                });//ajax
            });
        });

        //批量删除
        $('#btn-delect-all').on('click', function () {
            //这是相对应的那一行数据移出
            console.log($(".table-sort tbody :checkbox:checked").length);
            if ($(".table-sort tbody :checkbox:checked").length == 0) {
                layer.msg('请选择需要删除的数据！', {
                    icon: 0
                });
            } else {
                layer.confirm('确认要删除吗？', {
                    icon: 0,
                    title: '警告',
                    shade: false
                }, function (index) {
                    $(".table-sort tbody :checkbox:checked").parents('tr').remove(); //删除方法
                    layer.msg('已删除!', {
                        icon: 1,
                        time: 1000
                    });
                });
            }
        });
    });


</script>

</html>