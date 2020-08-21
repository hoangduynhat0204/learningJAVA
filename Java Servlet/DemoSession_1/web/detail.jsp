<%-- 
    Document   : detail
    Created on : Jun 4, 2020, 7:02:05 PM
    Author     : iViettech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
        //String name = (String)session.getAttribute("full_name");
        String fullName = (String)request.getAttribute("full_name");
    %>
    <body>
        <h1>This is detail page!</h1>
        <h2>Welcome, <%=fullName%></h2>
    </body>
</html>
