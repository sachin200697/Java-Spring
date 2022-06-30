<%-- 
    Document   : contact_form
    Created on : May 17, 2022, 12:15:14 PM
    Author     : sachink1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Fill the form</h1>
        
        <form action="processform" method="post">
            <table>
                <tr>
                    <td>Name: </td>
                    <td> <input type="text" name="name" placeholder="Enter Name" />
                </tr>
                <tr>
                    <td>Email: </td>
                    <td> <input type="email" name="email" placeholder="Enter Email" />
                </tr>
                <tr>
                    <td>Password: </td>
                    <td> <input type="password" name="password" />
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Submit" />
                </tr>
            </table>
        </form>
    </body>
</html>
