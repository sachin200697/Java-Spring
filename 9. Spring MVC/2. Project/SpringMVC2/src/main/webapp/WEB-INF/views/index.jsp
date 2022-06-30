<%-- 
    Document   : index
    Created on : May 13, 2022, 4:48:18 PM
    Author     : sachink1
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        
    </body>
</html>
