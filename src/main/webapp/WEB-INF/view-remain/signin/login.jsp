<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/6/14
  Time: 7:46
  Function: Provide users a way to enter the system.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎登录XX站点</title>
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.11/css/all.css" integrity="sha384-p2jx59pefphTFIpeqCcISO9MdVfIm4pNnsL08A6v5vaQc4owkQqxMV8kg4Yvhaw/" crossorigin="anonymous">
    <link rel="stylesheet" href="styles/login.css" type="text/css">



</head>
<body class="text-center">
<form class="form-signin" action="login" method="post">
    <i class="fas fa-trademark fa-5x mb-4"></i>
    <h1 class="h3 font-weight-normal mb-3">请登录</h1>
    <label for="inputUsername" class="sr-only">用户名</label>
    <input type="text" id="inputUsername" name="account" class="form-control" placeholder="手机号/邮箱" required autofocus>
    <label for="inputPassword" class="sr-only">密码</label>
    <input type="password" id="inputPassword" name="password" class="form-control" placeholder="密码" required>
    <div class="row check-box mb-3">
        <div class="col-6 text-left">
            <input type="checkbox" value="remember-me">
            记住我
        </div>
        <div class="col-6 text-right">
            <a href="#">忘记密码？</a>
        </div>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit"onclick="webInfo()">登录</button>
    <p class="mt-5 mb-3 text-muted">© XX技术有限公司 1996-2018</p>
</form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<script src="scripts/login.js" type="text/javascript" async></script>
</body>
</html>
