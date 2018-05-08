<%--
  Created by IntelliJ IDEA.
  User: wwwWangwg
  Date: 2018/5/7
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
<form action="/doUpdate" method="post">
    用户序号<input type="text" name="id" /><br/>
    用户名：<input type="text" name="username" /><br/>
    工  作：<input type="text" name="jobs" /><br/>
    电  话：<input type="text" name="phone" /><br/>
    <input type="submit" value="修改">
</form>
<a href="/index.jsp">返回首页</a>
</body>
</html>
