<%-- 
    Document   : index
    Created on : Jun 16, 2020, 8:09:09 PM
    Author     : Hoang Duy Nhat
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All products of Company</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            form {
                margin: 10px;
                float: right;
            }
            #add {
                border: 1px solid black;
                padding: 5px;
                margin: 10px;
                border-radius: 5px;
                float: left;
            }
        </style>
    </head>
    <body>
        <form id="left" action="ViewProductServlet" method="POST">
            <label>Search by name</label>
            <input type="text" name="nameCondition" />
            <input type="submit" value="Search"/>
        </form>

        <a class="btn btn-primary" id="add" href="add.jsp" role="button">Add New Product</a>
        <table class="table table-hover">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Amount</th>
                <th>Price</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="product" items="${products}">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.amount}</td>
                    <td>${product.price} $</td>
                    <td><a onclick="myFunction()" href="DeleteProductServlet?id=${product.id}">Delete</a></td>
                    <td><a href="EditProductServlet?id=${product.id}">Edit</a></td>
                </tr>
            </c:forEach>
        </table>
        <script>
            function myFunction() {
                confirm("Do you want to delete this data?");
            }
        </script>
    </body>
</html>
