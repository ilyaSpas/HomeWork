<%@ page import="com.ilsy.http.service.TicketService" %>
<%@ page import="com.ilsy.http.dto.TicketDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Spass
  Date: 06.12.2023
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello world from first JSP</h1>
<h2>Купленные билеты</h2>
<ul>
    <%
        Long flightId = Long.valueOf(request.getParameter("flightId"));
        List<TicketDto> tickets = TicketService.getInstance().findAllByFlightId(flightId);
        for (TicketDto ticket : tickets){
            out.write(String.format("<li>%s</li>", ticket.getSeatNo()));
        }
    %>
</ul>
</body>
</html>
