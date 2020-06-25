<%-- 
    Document   : listDanhMuc
    Created on : Jun 25, 2020, 3:43:15 PM
    Author     : IT NEVA PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách danh mục</title>
    </head>
    <body>
        <h1>List</h1>
            <ul>
                <c:forEach items="${listDanhMuc}" var="item">
                    <li>${item.tenDanhMuc}</li> 
                </c:forEach>                               
            </ul>

    </body>
</html>
