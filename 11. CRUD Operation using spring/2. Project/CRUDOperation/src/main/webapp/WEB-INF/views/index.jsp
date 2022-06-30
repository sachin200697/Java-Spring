<%-- 
    Document   : index
    Created on : May 23, 2022, 4:58:42 PM
    Author     : sachink1
--%>

<%@page import="com.sachin.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        
        <table>
            <tr style="border-bottom: 1px solid black;">
                <th>Sr.</th>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
        <c:forEach var="item" items="${products}">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.description}</td>
                <td>${item.price}</td>                
                <td><a href="delete/${item.id}">Delete</a>&nbsp;&nbsp;<a href="edit?productId=${item.id}">Edit</a></td>
            </tr>
        </c:forEach>
            </table>   
        <br><br>
        <button><a href="add-product">Add Product</a></button>
    </body>
</html>
