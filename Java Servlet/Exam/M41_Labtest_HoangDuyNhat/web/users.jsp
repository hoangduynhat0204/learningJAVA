<%-- 
    Document   : users
    Created on : Jun 25, 2020, 7:18:28 PM
    Author     : Hoang Duy Nhat
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Users</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            form {
                margin: 10px;
                float: right;
            }
            #add {
                border: 1px solid black;
                padding: 5px;
                margin: 10px;
                border-radius: 5px;
                float: left;
            }
        </style>
    </head>
    <body>
        <table class="table table-hover">
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th></th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.address}</td>
                    <td><a href="DeleteUserServlet?id=${user.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
