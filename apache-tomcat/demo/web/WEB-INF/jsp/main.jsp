<%--
  Created by IntelliJ IDEA.
  User: Spass
  Date: 07.12.2023
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Main page</title>
</head>
<body>

<%--    <p>Размер списка : ${requestScope.flights.size()}</p>--%>
<%--    <p>id:${requestScope.flights.get(0).id}</p>--%>
<%--    <p>Перелет: ${requestScope.flights.get(0).description}</p>--%>

<%--    <p>Размер Мар - ${sessionScope.flightsMap.size()}</p>--%>

<%--    <p>JSESSION id ${cookie["JSESSIONID"].value}</p>--%>
<%--    <p>Header ${header["Cookie"]}</p>--%>
<%--    <p>Переданные параметры test: ${param.test}</p>--%>
    <ul>
        <c:forEach var="flight" items="${requestScope.flights}">
            <li>${fn:toLowerCase(flight)}</li>
        </c:forEach>
    </ul>
    <p>${requestScope.flights.size()}</p>

    <%@include file="temp/header.jsp"%>
    Hello world, from Main page!
    <%@include file="temp/footer.jsp"%>
</body>
</html>
