<%-- 
    Document   : registerStudent
    Created on : Jun 13, 2020, 6:46:59 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register New Student</title>
        <style>
            form {
                width: 25%;
                text-align: right;
                border: 1px solid black;
                padding: 5px;
            }
            input {
                margin: 2px;
            }
            h2 {
                text-align: center;
            }
        </style>
    </head>
    <body>

        <form action="AddNewStudentServlet" method="GET">
            <h2>Register New Student</h2>
<label>Student ID:</label>
            <input type="text" name="id"/><br/>
            <label>Student Name:</label>
            <input type="text" name="name"/><br/>
            <label>Student Telephone Number:</label>
            <input type="text" name="tel_number"/><br/>
            <label>Student Average Mark:</label>
            <input type="text" name="avg_mark"/><br/>
            <label>Student Level:</label>
            <input type="text" name="level"/><br/>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
