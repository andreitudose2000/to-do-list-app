<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: AndreiTudose
  Date: 03-May-21
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add List Item</title>
</head>
<body>
    <h3>List settings saved!</h3>
    Color: ${simpleToDoList.color}
    <hr/>
    <a href="${pageContext.request.contextPath}/">Inapoi</a>

</body>
</html>
