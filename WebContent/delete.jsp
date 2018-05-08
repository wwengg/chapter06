<%--
  Created by IntelliJ IDEA.
  User: wwwWangwg
  Date: 2018/5/6
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户</title>
</head>
<body>
    <form action="/doDel" method="post">
        删除用户ID：<input type="text" name="id"><br/>
        <input type="submit" value="删除" />
    </form>
    返回首页

</body>
</html>
