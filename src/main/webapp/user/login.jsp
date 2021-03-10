<%--
  Created by IntelliJ IDEA.
  User: minhle
  Date: 3/10/21
  Time: 08:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container" style="margin-top: 150px; box-shadow: 3px 3px 10px 10px red; height: 50%">
    <form action="/users?ac=login" method="post" style="padding-top: 100px">
        <div class="form-group">
            <label for="exampleInputEmail1">Username</label>
            <input type="text" name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                   placeholder="Enter username">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" name="password" class="form-control" id="exampleInputPassword1"
                   placeholder="Password">
        </div>
        <div class="col-md-3 offset-5">
            <button type="submit" class="btn btn-primary">Submit</button>
            <a href="/users?ac=register"><button type="button" class="btn btn-success">Register</button></a>
        </div>
    </form>
</div>

</body>
</html>
