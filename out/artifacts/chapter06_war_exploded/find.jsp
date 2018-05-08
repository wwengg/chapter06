<%--
  Created by IntelliJ IDEA.
  User: wwwWangwg
  Date: 2018/5/7
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
<script type="text/javascript"src="js/jquery-1.5.1.min.js">
</script>
<script type="text/javascript">
    function search() {
        var id = $("#id").val();
        $.ajax({
            url:
            type: "GET",
            dataType:"json"
        })

    }
</script>--%>
<html>
<head>
    <title>查询用户</title>
</head>
<body>
<form action="/doFindId" method="post">
    查询的用户ID：<input type="text" name="id"><br/>
    <input type="submit" value="查询" />
</form>

<form action="/doFindName" method="post">
    查询的用户名：<input type="text" name="username"><br/>
    <input type="submit" value="查询" />
</form>
<a href="/index.jsp">返回首页</a>
</body>
</html>
