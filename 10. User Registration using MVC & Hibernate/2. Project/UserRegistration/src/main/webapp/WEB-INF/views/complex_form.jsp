<%-- 
    Document   : enjoy
    Created on : May 18, 2022, 3:14:36 PM
    Author     : sachink1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="handlecomplexform" method="post">
            <div>
                Error: <form:errors path="student.*" /> 
            </div>
            <table>
                <tr>
                    <td>Name:</td>
                    <td>
                        <input type="text" name="name"/> 
                    </td>
                </tr>
                <tr>
                    <td>Id:</td>
                    <td>
                        <input type="text" name="id" />
                    </td>
                </tr>
                <tr>
                    <td>Dob:</td>
                    <td>
                        <input type="text" name="dob" placeholder="dd/mm/yyyy"/>
                    </td>
                </tr>
                <tr>
                    <td>Multiple Select:</td>
                    <td>
                        <select name="multipleselect" multiple="true">
                            <option value="1">One</option>
                            <option value="2">two</option>
                            <option value="3">three</option>
                            <option value="4">four</option>                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td>
                        <input type="radio" name="gender" value="female"> Female<br> 
                        <input type="radio" name="gender" value="male"> Male<br> 
                    </td>
                </tr>
                <tr>
                    <td>Single Select:</td>
                    <td>
                        <select name="singleselect">
                            <option value="10">Java</option>
                            <option value="20">Python</option>
                            <option value="30">React</option>
                            <option value="40">Node</option>                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td>
                        <input type="text" name="address.city" placeholder="city"><br>
                        <input type="text" name="address.state" placeholder="state">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
