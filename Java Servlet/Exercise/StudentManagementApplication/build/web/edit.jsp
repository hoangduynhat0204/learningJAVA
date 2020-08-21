<%-- 
    Document   : edit
    Created on : Jun 16, 2020, 12:33:32 PM
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
        <form action="UpdateStudentServlet" method="POST">
            <input type="hidden" name="id" value="${student.id}" />
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${student.name}" /></td>
                </tr>
                <tr>
                    <td>Avg Mark</td>
                    <td><input type="text" name="avg_mark" value="${student.avgMark}"/></td>
                </tr>
                <tr>
                    <td>Level</td>
                    <td>
                        <select name="level">
                           <option value="Good">Good</option>
                           <option value="Normal">Normal</option>
                           <option value="Bad">Bad</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit"/></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
