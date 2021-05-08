<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDoList</title>
</head>
<body>
    Avem: ${item.text} !
    <hr/>
    <a href="${pageContext.request.contextPath}/">Inapoi</a>
</body>
</html>
