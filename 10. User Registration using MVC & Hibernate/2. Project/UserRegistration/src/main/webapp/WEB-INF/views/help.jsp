<%-- 
    Document   : help
    Created on : May 17, 2022, 10:07:22 AM
    Author     : sachink1
--%>

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
        <h1>Help Page</h1>
       ${name}
       
       <c:forEach var="item" items="${arr}">
           <h3>${item}</h3>
       </c:forEach>
    </body>
</html>
