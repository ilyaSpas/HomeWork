<%--
  Created by IntelliJ IDEA.
  User: Spass
  Date: 07.12.2023
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
Hello world, from WEB_INF/jsp/registration.jsp
<h2>Регистрация</h2>
<form action="/registration" method="post">

    <label>Name:
        <input type="text" name="name">
    </label><br>

    <label>Birthday:
        <input type="date" name="birthday">
    </label><br>

    <label>Email:
        <input type="text" name="email">
    </label><br>

    <label>Password:
        <input type="password" name="password">
    </label><br>

    <label>ROLE:
        <select name="role">
            <c:forEach var="role" items="${requestScope.roles}">
            <option value="${role}">${role}</option>
            </c:forEach>
        </select><br>
    </label>

    <label>Male:
        <select name="male">
            <c:forEach var="male" items="${requestScope.males}">
            <option value="${male}">${male}</option>
            </c:forEach>
        </select><br>
    </label>

    <button type="submit">Регистрация</button>
</form>

</body>
</html>
