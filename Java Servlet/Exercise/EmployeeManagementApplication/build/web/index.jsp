<%-- 
    Document   : index
    Created on : Jun 18, 2020, 6:25:07 PM
    Author     : Hoang Duy Nhat
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Employees of Company</title>
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
        <form id="left" action="DisplayEmployeeServlet" method="POST">
            <label>Search by name</label>
            <input type="text" name="nameCondition" />
            <label>Role</label>
            <select name="roleCondition">
                <option value="">No Role</option>
                <option value="manager">Manager</option>
                <option value="leader">Leader</option>
                <option value="dev">Dev</option>
                <option value="qc">QC</option>
            </select>
            <input type="submit" value="Search"/>

        </form>

        <a class="btn btn-primary" id="add" href="add.jsp" role="button">Add New Employee</a>
        <table class="table table-hover">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Role</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.email}</td>
                    <td>${employee.role}</td>
                    <td><a onclick="myFunction()" href="DeleteEmployeeServlet?id=${employee.id}">Delete</a></td>
                    <td><a href="EditEmployeeServlet?id=${employee.id}">Edit</a></td>
                </tr>
            </c:forEach>
            <script>
                function myFunction() {
                    confirm("Do you want to delete this data?");
                }
            </script>
        </table>
    </body>
</html>
