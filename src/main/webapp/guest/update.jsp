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
<div class="container" style="margin-top: 20px; box-shadow: 3px 3px 10px 10px yellow; height: 70%"">
<form action="/guests?ac=update" method="post" style="padding-top: 50px">
    <div class="form-row">
        <div class="form-group col-md-12">
            <label for="inputEmail4">Current ID</label>
            <input type="text" name="current_id" class="form-control" id="inputEmail5" placeholder="Current ID">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label for="inputEmail4">New ID</label>
            <input type="text" name="new_id" class="form-control" id="inputEmail4" placeholder="New ID">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label for="inputPassword4">New Name</label>
            <input type="text" name="new_name" class="form-control" id="inputPassword4" placeholder="New Name">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label for="inputAddress2">New Age</label>
            <input type="text" name="new_age" class="form-control" id="inputAddress2" placeholder="New Age">
        </div>
    </div>
    <button type="submit" class="btn btn-success">UPDATE</button>
</form>
</div>
</body>
</html>
