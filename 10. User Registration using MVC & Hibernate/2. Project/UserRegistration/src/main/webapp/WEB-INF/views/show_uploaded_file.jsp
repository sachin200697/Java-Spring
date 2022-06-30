<%-- 
    Document   : show_uploaded_file
    Created on : May 19, 2022, 3:54:10 PM
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
        <h1>Hello World!</h1>
        
        <img src="<c:url value="resources/img/${file}" />" alt="alt"/>
        
        ${file}
    </body>
</html>
