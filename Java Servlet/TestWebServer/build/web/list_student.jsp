<%-- 
    Document   : index
    Created on : May 26, 2020, 8:14:36 PM
    Author     : iViettech
--%>

<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List data</title>
    </head>
    <%
        List<Student> students = (List<Student>)request.getAttribute("students");
    %>
    <body>
        <h2>Logined by <%=(String)session.getAttribute("user_logined")%></h2>
        <a href="addStudent">Click to add new data...</a>
        <br><br>
        <table border="1" width="80%">
            <tr>
                <th>Name</th>
                <th>Gender</th>
                <th>Class Name</th>
                <th>Description</th>
                <th></th>
            </tr>
            <%
                for(Student s : students) {
                    String name = s.getName();
                    String gender = s.getGender();
                    String className = s.getClassName();
                    String description = s.getDescription();
                
            %>
            <tr>
                <td><%=name%></td>
                <td><%=gender%></td>
                <td><%=className%></td>
                <td><%=description%></td>
                <td>
                    <a href="">Edit</a>
                    <a href="">Delete</a>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
