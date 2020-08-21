<%-- 
    Document   : addStudent
    Created on : Jun 9, 2020, 8:35:44 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            form {
                border: 1px solid black;
                width: 15%;
                padding:  5px;
                text-align: right;
            }
            input {
                margin: 3px;
            }
        </style>
    </head>
    <body>
        <form action="AddStudentServlet" method="GET">
            <label>Id: </label>
            <input type="text" name="studentId"/><br>
            <label>Name: </label>
            <input type="text" name="name"/><br>
            <label>Mark: </label>
            <input type="text" name="mark"/><br>
            <label>Rank: </label>
            <input type="text" name="rank"/><br>
            <input type="submit" name="add" value="Add"/>
        </form>

    </body>
</html>
