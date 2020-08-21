<%-- 
    Document   : register
    Created on : Jun 4, 2020, 6:35:33 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form action="RegisterServlet" method="POST">
            <label>Name</label>
            <input type="text" name="name"/><br/>
            <input type="submit" name="submit" value="Submit"/>
        </form>
    </body>
</html>
