<%-- 
    Document   : registerSuccess
    Created on : Jun 3, 2020, 5:02:02 PM
    Author     : Hoang Duy Nhat
--%>

<%@page import="model.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Member member = (Member)request.getAttribute("MemberInfor");
            String fullName = member.getFullName();
            String gender = member.getGender();
            String number = member.getNumber();
            String email = member.getEmail();
        %>
        
        <table>
            <th></th>\
            <tr>
                <td></td>
            </tr>
        </table>
        <h1>Register Success</h1>
        Full Name: <h2><%=fullName%></h2>
        Gender: <h2><%=gender%></h2>
        Mobile Number: <h2><%=number%></h2>
        Email: <h2><%=email%></h2>
    </body>
</html>
