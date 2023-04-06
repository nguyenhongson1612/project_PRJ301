<%-- 
    Document   : assign
    Created on : Nov 6, 2022, 12:22:59 PM
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
        <c:if test="${sessionScope.account == null}">
            <h1>access denied</h1>
        </c:if>
    </body>
</html>
