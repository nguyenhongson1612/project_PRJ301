<%-- 
    Document   : login
    Created on : Nov 6, 2022, 12:05:25 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="post">
            Username:<input type="text" name="user"/>
            password:<input type="password" name="pass"/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
