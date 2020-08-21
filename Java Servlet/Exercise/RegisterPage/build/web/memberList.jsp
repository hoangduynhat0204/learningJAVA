<%-- 
    Document   : memberList
    Created on : Jun 8, 2020, 1:32:18 PM
    Author     : Hoang Duy Nhat
--%>

<%@page import="model.Member"%>
<%@page import="java.util.List"%>
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
            List<Member> members = (List<Member>) session.getAttribute("members");
        %>
        <h1>Members List</h1>
        <table class="table">
            <tr>
                <th>Name</th>
                <th>Gender</th>
                <th>Number</th>
                <th>Email</th>
            </tr>
            <%for (Member member : members) {%>
            <tr>
                <td><%=member.getFullName()%></td>
                <td><%=member.getGender()%></td>
                <td><%=member.getNumber()%></td>
                <td><%=member.getEmail()%></td>
            </tr>
            <%}%>
        </table>

    </body>
</html>
