<%-- 
    Document   : welcome
    Created on : Jun 4, 2020, 6:51:40 PM
    Author     : iViettech
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%

        List<String> names = (List<String>)session.getAttribute("names");
    %>
    <body>
        <a href="detail.jsp"> Detail... </a>
        <h1>List member!</h1>
        <%for (String name : names) {%>
            <h2><%=name%></h2>
        <%}%>
    </body>
</html>
