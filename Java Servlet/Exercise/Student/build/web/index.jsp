<%-- 
    Document   : index
    Created on : Jun 8, 2020, 2:18:42 PM
    Author     : Hoang Duy Nhat
--%>

<%@page import="java.util.List"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
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
        <%
            Student studentData = (Student) request.getAttribute("student");
            List<Student> studentList = (List<Student>) request.getAttribute("studentList");
        %>
        <table  class="table table-striped"">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Class</th>
            </tr>
            <c:forEach var="student" items="${studentList}">
                <tr>
                    <td>${student.id} </td>
                    <td>${student.name}</td>
                    <td>${student.email}</td>
                    <td>
                <c:choose>
                    <c:when test="${student.classId == 1}">
                        JV35
                    </c:when>
                    <c:when test="${student.classId == 2}">
                        JV36
                    </c:when>
                    <c:when test="${student.classId == 3}">
                        JV37
                    </c:when>
                    <c:otherwise>
                        Other
                    </c:otherwise>
                </c:choose>
                </td>
                <td><button>Edit</button></td>
                <td><button>Delete</button></td>
                </tr>
            </c:forEach>
    </body>
</html>
