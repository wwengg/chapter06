<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2018/3/29
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>查询结果</title>
</head>
<body>
    <tbody>
    <table border="1px">
        <tr>
            <td>序号</td>
            <td>用户名</td>
            <td>工作</td>
            <td>电话</td>
        </tr>
        <c:forEach items="${cs}" var="c">
            <tr>
                <td>${c.id}</td>
                <td>${c.username}</td>
                <td>${c.jobs}</td>
                <td>${c.phone}</td>
            </tr>

        </c:forEach>
    </table>



    </tbody>
    <a href="/index.jsp">返回首页</a>
</body>
</html>
