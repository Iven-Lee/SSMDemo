<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <title>注册学生</title>
    <base href="<%=basePath%>" />
</head>
<body>
    <div align="center">
        <%--使用base标签省略/--%>
        <form action="student/addStudent" method="post">
            <table>
                <tr>
                    <td>用户编号：</td>
                    <td><input type="text" name="userId"></td>
                </tr>
                <tr>
                    <td>用户名称：</td>
                    <td><input type="text" name="userName"></td>
                </tr>
                <tr>
                    <td>用户密码：</td>
                    <td><input type="text" name="pword"></td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td><input type="text" name="sex"></td>
                </tr>
                <tr>
                    <td>邮箱：</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <%--空格：&nbsp--%>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="submit" value="注册"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
