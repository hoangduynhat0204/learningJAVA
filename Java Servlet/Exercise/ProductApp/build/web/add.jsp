<%-- 
    Document   : add
    Created on : Jun 17, 2020, 8:59:24 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Product Information</title>
    </head>
    <body>
        <form action="AddProductServlet" method="POST">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" value="${product.id}" /></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${product.name}" /></td>
                </tr>
                <tr>
                    <td>Amount</td>
                    <td><input type="text" name="amount" value="${product.amount}"/></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type="text" name="price" value="${product.price}"/></td>
                </tr>
                <tr>
                    <td><input type="submit"/></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
