<%-- 
    Document   : index
    Created on : Jun 6, 2020, 6:26:44 PM
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
        <%
            List<Student> students = (List<Student>) session.getAttribute("students");
        %>
        <a href="addStudent.jsp">Add</a>
        <table  class="table table-striped"">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Mark</th>
                <th>Rank</th>
                <th>Result</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.studentId} </td>
                    <td>${student.name}</td>
                    <td>${student.mark}</td>
                    <td>${student.rank}</td>
                    <td>
                        <c:choose>
                            <c:when test="${student.mark > 5}">
                                Pass
                            </c:when>
                            <c:otherwise>
                                Fail
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td><a href="DeleteStudentServlet?idDelete=${student.studentId}">Delete</a></td>
                    <td><a href="DetailStudentServlet?idDetail=${student.studentId}">Detail</a></td>
                </tr>
            </c:forEach>

        </table>

    </body>
</html>
