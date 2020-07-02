<%-- 
    Document   : AddDanhMuc
    Created on : Jul 2, 2020, 3:20:56 PM
    Author     : IT NEVA PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Danh Muc</title>
    </head>
    <body>
        <h1>Thêm danh mục</h1>
        
        <form method="POST" action="InsertDanhMuc">
            <input name="id" type="text" placeholder="ID">
            <input name="ten_danh_muc" type="text" placeholder="Tên danh mục">
            <button type="submit">Thêm</button>
        </form>
    </body>
</html>
