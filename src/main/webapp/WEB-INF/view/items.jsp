<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your list items</title>
</head>
<body>

    <c:forEach items="${items}" var="item">
        Item: ${item.text} <br />
    </c:forEach>

    <hr/>
    <a href="${pageContext.request.contextPath}/">Inapoi</a>

</body>
</html>
