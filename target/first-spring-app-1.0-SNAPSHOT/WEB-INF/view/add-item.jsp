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
    <style>
        .error { color:red }
    </style>
</head>
<body>
    <form:form action="processItem" modelAttribute="simpleItem">
        Text: <form:input path="text"/>
        <input type="submit" value="Submit" />
        <form:errors path="text" cssClass="error" />
    </form:form>
</body>
</html>
