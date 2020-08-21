<%-- 
    Document   : index
    Created on : Jun 16, 2020, 12:28:03 PM
    Author     : Hoang Duy Nhat
--%>

<%@page import="java.util.List"%>
<%@page import="com.sun.xml.internal.ws.api.ha.StickyFeature"%>
<%@page import="beans.Student"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DisplayStudentServlet" method="POST">
            <label>Search by name</label>
            <input type="text" name="nameCondition" />
            <input type="submit" value="Search"/>
        </form>
        <br>
        <br>
        <a href="register.jsp">Add new Student</a>
        <br>
        <br>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Avg Mark</th>
                <th>Rank</th>
                <th>Result</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="student" items="${studentList}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.avgMark}</td>
                    <td>${student.rank}</td>
                    <td>
                        <c:choose>
                            <c:when test="${student.avgMark >= 5}">
                                PASS
                            </c:when>
                            <c:otherwise>
                                FAIL
                            </c:otherwise>    
                        </c:choose>
                    </td>
                    <td>
                        <a href="DeleteStudentServlet?id=${student.id}">Delete</a>
                    </td>
                    <td>
                        <a href="UpdateStudentServlet?id=${student.id}">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
