<%-- 
    Document   : detail
    Created on : Jun 4, 2020, 7:01:53 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail</title>
    </head>
    <body>
        <%
            Cookie[] cookies = request.getCookies();
            String cName = "userName";
            String cValue = "";
            for (Cookie c : cookies){
                if (c.getName().equals(cName)){
                    cValue = c.getValue();
                    break;
                }
            }
        %>
        
    </body>
</html>
