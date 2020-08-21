<%-- 
    Document   : welcome
    Created on : Jun 4, 2020, 6:40:20 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>WELCOME <%=(String)session.getAttribute("name")%></h1>
        <a href="detail.jsp">Detail</a>
        
    </body>
</html>
