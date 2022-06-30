<%-- 
    Document   : add_product_form
    Created on : May 24, 2022, 1:27:13 PM
    Author     : sachink1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><c:out value="${title}">Product Crud Application</c:out></title>
    </head>
    <body>
        <h1>Enter details below to add a product</h1>
        
        <form action="handle-add-product" method="post">
            <table>
                <tr>
                    <td><label for="name">Name of product: </label></td>
                    <td><input type="text" name="name" id="name" placeholder="enter name"/></td>
                </tr>
                <tr>
                    <td><label for="description">Description of product: </label></td>
                    <td><textarea cols="40" rows="5" name="description" id="description" placeholder="enter description"></textarea></td>
                </tr>
                <tr>
                    <td><label for="name">Price of product: </label></td>
                    <td><input type="text" name="price" id="price" placeholder="enter price"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button><a href="${pageContext.request.contextPath}/">Back</a></button>&nbsp;&nbsp;<input type="submit" value="Add"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
