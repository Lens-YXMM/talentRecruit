<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>欢迎登录XX站点</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font-Awesome -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- Sign in & Sign up CSS -->
    <link rel="stylesheet" href="../../../styles/sign.css" type="text/css">

</head>
<body class="text-center">
    <div class="container">
        <form id="signin" class="form-signin">
            <i class="fa fa-trademark fa-5x mb-4"></i>
            <h1 class="h3 font-weight-normal mb-3">请登录</h1>
            <div class="input-wrap">
                <label for="inputUsername" class="sr-only">用户名</label>
                <input data-rule=""
                       type="text"
                       id="inputUsername"
                       name="username"
                       class="form-control"
                       placeholder="用户名"
                       autocomplete="off"
                       autofocus>
                <div id="username-input-error" class="invalid-tooltip">
                    <div class="arrow"></div>
                    请填写用户名
                </div>
            </div>
            <div class="input-wrap">
                <label for="inputPassword" class="sr-only">密码</label>
                <input data-rule=""
                       type="password"
                       id="inputPassword"
                       name="password"
                       class="form-control"
                       placeholder="密码"
                       autocomplete="off">
                <div id="password-input-error" class="invalid-tooltip">
                    <div class="arrow"></div>
                    请填写密码
                </div>
            </div>
            <div class="row check-box mb-3 px-2">
                <div class="col-6 text-left">
                    <input type="checkbox" id="rememberAccount" value="remember">
                    <label for="rememberAccount">记住我</label>
                </div>
                <div class="col-6 text-right">
                    <a href="#" class="link">忘记密码？</a>
                </div>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
            <p class="mt-3 mb-3 text-muted">© XX技术有限公司 1996-2018</p>
        </form>
        <div class="divider"></div>
        <div class="signup-right">
            <h5>没有账号:</h5>
            <a href="signup.jsp" class="link">立即注册 <i class="fa fa-arrow-circle-o-right"></i></a>
            <h5>使用以下帐号直接登录:</h5>
            <a href="https://weibo.com" class="h4 weibo px-3" target="_blank"><i class="fa fa-weibo"></i></a>
            <a href="https://weixin.com" class="h4 wechat px-3"><i class="fa fa-weixin"></i></a>
            <a href="https://qq.com" class="h4 qq px-3" target="_blank"><i class="fa fa-qq"></i></a>
        </div>
    </div>

    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script src="../../../scripts/common.js"></script>
    <script src="../../../scripts/validator.js"></script>
    <script src="../../../scripts/input.js"></script>
    <script src="../../../scripts/signin.js"></script>
</body>
</html>