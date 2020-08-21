<%-- 
    Document   : edit
    Created on : Jun 18, 2020, 6:50:18 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="EditEmployeeServlet" method="POST">
            <input type="hidden" name="id" value="${employee.id}" />
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${employee.name}" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="${employee.email}"/></td>
                </tr>
                <tr>
                    <td>Role</td>
                    <td><input type="text" name="role" value="${employee.role}"/></td>
                </tr>
                <tr>
                    <td><input type="submit"/></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
