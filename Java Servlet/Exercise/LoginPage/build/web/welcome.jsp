<%-- 
    Document   : welcome
    Created on : Jun 3, 2020, 4:24:19 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Welcome user: <h1><%=request.getAttribute("email")%></h1></h1>
    </body>
</html>
