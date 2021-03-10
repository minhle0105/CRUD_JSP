<%--
  Created by IntelliJ IDEA.
  User: minhle
  Date: 3/10/21
  Time: 08:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container" style="margin-top: 20px; box-shadow: 3px 3px 10px 10px green; height: 50%"">
    <form action="/guests?ac=create" method="post" style="padding-top: 50px">
        <div class="form-row">
            <div class="form-group col-md-12">
                <label for="inputEmail4">ID</label>
                <input type="text" name="id" class="form-control" id="inputEmail4" placeholder="ID">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-12">
                <label for="inputPassword4">Name</label>
                <input type="text" name="name" class="form-control" id="inputPassword4" placeholder="Name">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-12">
                <label for="inputAddress2">Age</label>
                <input type="text" name="age" class="form-control" id="inputAddress2" placeholder="Age">
            </div>
        </div>
        <button type="submit" class="btn btn-success">ADD</button>
    </form>
</div>
</body>
</html>
