<%-- 
    Document   : search
    Created on : Nov 6, 2022, 11:37:16 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>title</th>
                    <th>Published Date</th>
                    <th>is Open Acess</th>
                </tr>
            </thead>
            <tbody>

                <c:forEach items="${requestScope.data}" var="p">
                    <tr>
                        <td>${p.pid}</td>
                        <td>${p.title}</td>
                        <td>${p.published_date}</td>
                        <c:if test="${p.open_access}">
                            <td><img src="img/open.png"/></td>
                            </c:if>
                            <c:if test="${!p.open_access}">
                            <td></td>
                        </c:if>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
