<%-- 
    Document   : detail
    Created on : Jun 9, 2020, 7:17:38 PM
    Author     : Hoang Duy Nhat
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Student"%>
<%@page import="Model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>${student.studentId} </td>
                <td>${student.name}</td>
                <td>${student.mark}</td>
                <td>${student.rank}</td>
            </tr>
        </table>

    </body>
</html>
