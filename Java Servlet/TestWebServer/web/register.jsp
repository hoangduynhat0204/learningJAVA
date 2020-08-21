<%-- 
    Document   : index
    Created on : May 26, 2020, 8:14:36 PM
    Author     : iViettech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Regiter student</title>
        <style>
            .form-field {
                width: 60%
            }
        </style>
    </head>
    <body>
        <h2>Logined by <%=(String)session.getAttribute("user_logined")%></h2>        
        <form action="addStudent" method="POST">
            <table width="80%">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" class="form-field" name="last_name" /></td>
                </tr>
                <tr></tr>
                <tr>
                    <td>Gender:</td>
                    <td>
                        <input type="radio" name="gender" value="male" />Male
                        <input type="radio" name="gender" value="female" />Female
                        <input type="radio" name="gender" value="other" />Other
                    </td>
                </tr>
                <tr></tr>
                <tr>
                    <td>Class:</td>
                    <td>
                        <select name="class" class="form-field">
                            <option value="">---Chose class---</option>
                            <option value="12A1">12A1</option>
                            <option value="12A2">12A2</option>
                            <option value="12B1">12B1</option>
                            <option value="12C1">12C1</option>
                        </select>
                    </td>
                </tr>
                <tr></tr>
                <tr>
                    <td>Description:</td>
                    <td>
                        <textarea rows="5" name="description" class="form-field"></textarea>
                    </td>
                </tr>
                <tr></tr>
                <tr>
                    <td>Interests:</td>
                    <td>
                        <input type="checkbox" name="interests" value="swim" />Swimming
                        <input type="checkbox" name="interests" value="music" />Listen Music
                        <input type="checkbox" name="interests" value="game" />Play game
                    </td>
                </tr>
            </table>
            <input type="submit"/>
            
        </form>
            
    </body>
</html>
