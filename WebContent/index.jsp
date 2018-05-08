<%--
  Created by IntelliJ IDEA.
  User: wwwWangwg
  Date: 2018/5/6
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/doAdd" method="post">
        用户名：<input type="text" name="username" /><br/>
        工  作：<input type="text" name="jobs" /><br/>
        电  话：<input type="text" name="phone" /><br/>
        <input type="submit" value="提交">
    </form>
    <a href="/update.jsp">修改用户</a>
    <a href="find.jsp">查询用户</a>
    <a href="delete.jsp">删除用户</a>
</body>
</html>
