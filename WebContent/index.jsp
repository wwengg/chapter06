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
        用户名：<input type="text" name="username" />
        工  作：<input type="text" name="jobs" />
        电  话：<input type="text" name="phone" />
        <button type="submit" value="提交"></button>
    </form>
</body>
</html>
