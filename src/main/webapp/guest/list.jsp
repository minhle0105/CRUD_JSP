<%--
  Created by IntelliJ IDEA.
  User: minhle
  Date: 3/9/21
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bai tap CRUD JSP</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
  <div class="container" style="margin-top: 20px; box-shadow: 3px 3px 10px 10px red">
      <div class="row">
          <div class="col-md-6 offset-3">
              <h1>DANH SACH KHACH MOI</h1>
          </div>
      </div>
      <div class="row">
          <table class="table table-striped">
              <thead>
              <tr>
                  <th scope="col">id</th>
                  <th scope="col">name</th>
                  <th scope="col">age</th>
                  <th scope="col" colspan="2" style="padding-left: 120px">action</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach items="${guests}" var="guest">
                  <tr>
                      <td>${guest.id}</td>
                      <td>${guest.name}</td>
                      <td>${guest.age}</td>
                      <td><a href="guest/update.jsp" class="btn btn-primary">Edit</a></td>
                      <td><a href="/guests?ac=delete&idDel=${guest.id}" style="color: white" class="btn btn-danger">Delete</a></td>
                  </tr>
              </c:forEach>
              </tbody>
          </table>
      </div>
      <div class="row">
          <div class="col-md-4" style="justify-content: center">
              <a href="guest/create.jsp" class="btn btn-success" style="width: 200px; margin-left: 100px">Add</a>
          </div>
          <div class="col-md-8">
              <nav class="navbar justify-content-between" style="justify-content: center; background-color: white">
                  <form method="post" action="/guests?ac=search" class="form-inline" style="background-color: white; margin-left: 150px">
                      <input class="form-control mr-sm-2" name="searchName" type="search" placeholder="Search" aria-label="Search" style="width: 300px">
                      <button class="btn btn-outline-success my-2 my-sm-0">Search</button>
                  </form>
              </nav>
          </div>
      </div>
  </div>
</body>
</html>
