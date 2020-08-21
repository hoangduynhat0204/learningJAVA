<%-- 
    Document   : index
    Created on : Jun 25, 2020, 6:30:48 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            form {
                border: 1px solid black;
                width: 20%;
                text-align: right;
                padding: 20px
            }
            input {
                margin: 5px;
            }
        </style>
    </head>
    <body>
        <form action="LoginServlet" method="POST">
            <h2>Login to the system</h2>
            <label>Email: </label>
            <input type="text" name="username"/><br/>
            <label>Password: </label>
            <input type="password" name="password"/>
            <br/>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
