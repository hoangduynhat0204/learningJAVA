<%-- 
    Document   : studentList
    Created on : Jun 12, 2020, 2:38:09 PM
    Author     : Hoang Duy Nhat
--%>

<%@page import="java.util.List"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="Model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Welcome To Student Management System</h1>
        <form action="SearchStudentServlet" method="POST">
            <label>Search: </label>
            <input type="text" name="searching"/>
            <input type="submit" value="search"/>
        </form>
        <form action="ShowStudentServlet" method="GET">
            <label>Show all students </label>
            <input type="submit" name="show" value="Show"/>
        </form>
        <a href="registerStudent.jsp">Add new Student</a>
        <br>
        <table class="table">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Average Mark</th>
                <th>Level</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id} </td>
                    <td>${student.name}</td>
                    <td>${student.tel_number}</td>
                    <td>${student.avg_mark}</td>
                    <td>${student.level}</td>
                    <td><a href="EditStudentServlet">Edit</a></td>
                    <td><a>Delete</a></td>

                </c:forEach>
        </table>
    </body>
</html>
