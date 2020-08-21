<%-- 
    Document   : add
    Created on : Jun 18, 2020, 6:52:09 PM
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
        <form action="AddEmployeeServlet" method="POST">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" value="${employee.id}" /></td>
                </tr>
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
