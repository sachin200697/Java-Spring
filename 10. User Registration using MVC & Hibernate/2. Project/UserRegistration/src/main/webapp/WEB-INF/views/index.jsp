<%-- 
    Document   : index
    Created on : May 13, 2022, 4:48:18 PM
    Author     : sachink1
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="<c:url value="resources/css/style.css" />"/>
        <script src="<c:url value="resources/js/myscript.js" />"></script>
    </head>
    <body>
        <h1>Home Page!</h1>
        
        <%
            String name =(String) request.getAttribute("name");
            int id =(int) request.getAttribute("id");
            List<String> friends =(LinkedList<String>) request.getAttribute("friends");
            %>
            
            <h2> My name is <%= name %> </h2>
            <h4> and id is <%= id %></h4>
            
            <h6> My friends list is here </h6>
            
            <ul>
                <%
                    for(String friend: friends){
                    %>
                    <li><%= friend %></li>
                    <% } %>
            </ul>
            
            <ul>
                <li><a href="help">Go to Help</a></li>
                <li><a href="complexform">Go to Complex Form</a></li>
                <li><a href="contact">Go to Contact</a></li>
                <li><a href="one">Redirect Example</a></li>
                <li><a href="uploadfileform">Upload file Example</a></li>
                
            </ul>
            
                    <img src="<c:url value="resources/img/photo.png"/>" alt="alt"/>
        
    </body>
</html>
