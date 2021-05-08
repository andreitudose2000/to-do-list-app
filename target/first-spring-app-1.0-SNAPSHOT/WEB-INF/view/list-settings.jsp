<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add List Item</title>

</head>
<body>
    <form:form action="settingsSaved" modelAttribute="simpleToDoList">
        <form:select path="color">
            <form:options items="${simpleToDoList.themes}"/>
        </form:select>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
