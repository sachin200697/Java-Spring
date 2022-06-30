<%-- 
    Document   : upload_file_form
    Created on : May 19, 2022, 2:27:32 PM
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
        <h1>Upload File</h1>
        
        <form action="uploadimage" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Name: </td>
                    <td> <input type="file" name="file"/>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Upload File" />
                </tr>
            </table>
        </form>
    </body>
</html>
