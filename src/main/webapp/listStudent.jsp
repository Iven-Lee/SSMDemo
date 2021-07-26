<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>查询学生ajax</title>
    <base href="<%=basePath%>" />
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            //在当前页面dom对象加载后，执行loadStudentData（）
            loadStudentData();
            // 单击事件
            $("#btnLoader").click(function(){
                loadStudentData();
            })
        })

        function loadStudentData(){
            $.ajax({
                url:"student/queryStudent",
                type:"get",
                dataType:"json",
                success:function(data){
                    //清除旧的数据
                    $("#info").html("");
                    //增加新的数据
                    $.each(data,function(i,n){
                        $("#info").append("<tr>")
                            .append("<td>"+n.userId+"</td>")
                            .append("<td>"+n.userName+"</td>")
                            .append("<td>"+n.pword+"</td>")
                            .append("<td>"+n.sex+"</td>")
                            .append("<td>"+n.email+"</td>")
                            .append("</tr>")

                    })
                }
            })
        }
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
             <tr>
                 <td>用户编号</td>
                 <td>用户名称</td>
                 <td>用户密码</td>
                 <td>用户性别</td>
                 <td>用户邮箱</td>
             </tr>
            </thead>
            <tbody id="info">
            </tbody>
        </table>
        <input type="button" id="btnLoader" value="查询数据">
    </div>
</body>
</html>
