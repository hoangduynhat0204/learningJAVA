<%-- 
    Document   : registerMember
    Created on : Jun 3, 2020, 4:42:14 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        form {
            border: 1px solid black;
            text-align: right;
            width: 20%;
            padding: 5px;
        }
        input {
            margin: 5px;
        }
    </style>
    <body>
        <form action="RegisterServlet" method="POST">
            <h2>Register New Member</h2>
            <label>Full Name: </label>
            <input type="text" name="fullName"/><br/>
            <label>Gender: </label>
            <input type="text" name="gender"/><br/>
            <label>Mobile Number: </label>
            <input type="text" name="number"/><br/>
            <label>Email: </label>
            <input type="text" name="email"/><br/>
            <input type="submit" name="register" value="Register"/>
        </form>
    </body>
</html>
