<%-- 
    Document   : index
    Created on : Dec 8, 2019, 1:54:40 PM
    Author     : XV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="<c:url value="/book/list" />">List of customer</a>
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
            <c:forEach var="tempBook" items="${pagedListHolder.pageList}">

                <!-- construct an "update" link with customer id -->
                <c:url var="updateLink" value="/book/updateForm">
                    <c:param name="bookId" value="${tempBook.id}" />
                </c:url>

                <!-- construct an "delete" link with customer id -->
                <c:url var="deleteLink" value="/book/delete">
                    <c:param name="bookId" value="${tempBook.id}" />
                </c:url>

                <tr>
                    <td>${tempBook.name}</td>
                    <td>${tempBook.author}</td>
                    <td>${tempBook.price}</td>

                    <td>
                        <!-- display the update link --> 
                        <a href="${updateLink}">Update</a>| 
                           <a href="${deleteLink}"	onclick="if (!(confirm('Are you sure you want to delete this customer?')))
                                                    return false">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tr>
    </table>
</body>
</html>
