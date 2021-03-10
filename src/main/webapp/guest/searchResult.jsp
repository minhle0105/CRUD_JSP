<%--
  Created by IntelliJ IDEA.
  User: minhle
  Date: 3/10/21
  Time: 08:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container" style="margin-top: 20px; box-shadow: 3px 3px 10px 10px blue">
    <div class="row">
        <div class="col-md-6 offset-3">
            <h1>DANH SACH KHACH CAN TIM</h1>
        </div>
    </div>
    <div class="row">
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">id</th>
                <th scope="col">name</th>
                <th scope="col">age</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${guests}" var="guest">
                <tr>
                    <td>${guest.id}</td>
                    <td>${guest.name}</td>
                    <td>${guest.age}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
