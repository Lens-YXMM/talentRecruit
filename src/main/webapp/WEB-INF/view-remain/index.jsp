<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/5/14
  Time: 8:42
  Function: main page.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="styles/main.css" type="text/css">
    <link rel="stylesheet" href="styles/index.css" type="text/css">

    <title>XX企业招聘</title>
</head>
<body>
<!-- Nav bar -->
<nav class="navbar navbar-expand-lg narbar-light bg-light border-bottom mb-5" role="navigation">
    <a class="navbar-brand" href="#">企业人才招聘系统</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#"><i class="fas fa-home"></i> 首页 <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">关于我们</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">社会招聘</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    校园招聘
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <button class="dropdown-item" type="button">应届生</button>
                    <button class="dropdown-item" type="button">实习生</button>
                    <button class="dropdown-item disabled" type="button">留学生</button>
                </div>
            </li>
        </ul>
        <ul class="navbar-nav mr-5">
            <%--<c:set var="userName" value="丁家欣"></c:set>--%>
            <c:set var="user" value="${sessionScope.user}"></c:set>
            <c:if test="${empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="<%=request.getContextPath()%>/login/login.jsp">登录</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link bl" href="#">注册</a>
                </li>
            </c:if>
            <c:if test="${not empty user}"><li class="nav-item">
                <a class="nav-link" href="#">消息<span class="badge badge-primary ml-1">7</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link bl" href="#">我的简历</a>
            </li>
            <li class="nav-item">
                <a class="nav-link bl" href="#">投递箱<span class="badge badge-primary ml-1">5</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link bl" href="#">收藏夹</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle bl" href="javascript:return false;"  id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <c:out value="${user.uiName}"></c:out>
                </a>
                <div class="dropdown-menu" aria-labelledby="userDropdown">
                    <button class="dropdown-item" type="button">账号设置</button>
                    <button class="dropdown-item disabled" type="button">去企业版</button>
                    <button class="dropdown-item" id="exit" type="button">退出</button>
                </div>
            </li></c:if>
        </ul>
    </div>
</nav>

<!--Content-->
<div class="container mt-3">
    <div id="demo" class="carousel slide" data-ride="carousel">

        <!-- 指示符 -->
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
        </ul>

        <!-- 轮播图片 -->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="../../img/join-us.jpg" class="w-100" alt="加入我们">
            </div>
            <div class="carousel-item">
                <img src="../../img/talent-recruit.jpg" class="w-100" alt="人才招聘">
                <div class="carousel-caption d-none d-md-block">
                    <h2>人才招聘</h2>
                    <p>在这里，你可以找到属于你的职位</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="../../img/about-us.jpg" class="w-100" alt="关于我们">
                <div class="carousel-caption d-none d-md-block">
                    <h2>关于我们</h2>
                    <p>这里有一切你想了解的</p>
                </div>
            </div>
        </div>

        <!-- 左右切换按钮 -->
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>

    </div>
    <div class="row clear-fix bg-light">
        <div class="col-2"></div>
        <div class="col-8 m-3">
            <form>
                <div class="form-group mt-1">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="请输入搜索的内容" aria-label="搜索的内容" aria-describedby="basic-addon2">
                        <div class="input-group-append">
                            <button class="btn btn-outline-primary" type="button"><i class="fas fa-search"></i></button>
                        </div>
                    </div>
                </div>
                <div class="form-check form-check-inline ml-3">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="employTypeRadios1" value="option1" checked>
                    <label class="form-check-label" for="employTypeRadios1">
                        社会招聘
                    </label>
                </div>
                <div class="form-check form-check-inline ml-3">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="employTypeRadios2" value="option1">
                    <label class="form-check-label" for="employTypeRadios2">
                        校园招聘
                    </label>
                </div>
            </form>
        </div>
        <div class="col-2"></div>
    </div>
</div>

<div class="container mt-4">
    <div class="row mb-3">
        <div class="col mx-3">
            <div class="card text-center border-0">
                <img src="../../img/join-us-1.jpg" class="card-img-top" alt="社会招聘">
                <div class="card-body">
                    <a href="#" class="btn btn-primary mb-3">社会招聘</a>
                    <p class="card-text">把数字世界带入每个人、每个家庭、每个组织，构建万物互联的智能世界</p>
                </div>
            </div>
        </div>
        <div class="col mx-3">
            <div class="card text-center border-0">
                <img src="../../img/join-us-2.jpg" class="card-img-top" alt="校园招聘">
                <div class="card-body">
                    <a href="#" class="btn btn-primary mb-3">校园招聘</a>
                    <p class="card-text">欢迎胸怀世界、坚韧平实、洞见新知的你，我们一起走进“勇敢新世界”</p>
                </div>
            </div>
        </div>
    </div>
    <div class="row mb-3">
        <div class="col mx-3">
            <div class="card text-center border-0">
                <img src="../../img/join-us-3.jpg" class="card-img-top" alt="社会招聘">
                <div class="card-body">
                    <a href="#" class="btn btn-primary mb-3">查看详情</a>
                    <p class="card-text">把数字世界带入每个人、每个家庭、每个组织，构建万物互联的智能世界</p>
                </div>
            </div>
        </div>
        <div class="col mx-3">
            <div class="card text-center border-0">
                <img src="../../img/join-us-4.jpg" class="card-img-top" alt="校园招聘">
                <div class="card-body">
                    <a href="#" class="btn btn-primary mb-3">查看详情</a>
                    <p class="card-text">欢迎胸怀世界、坚韧平实、洞见新知的你，我们一起走进“勇敢新世界”</p>
                </div>
            </div>
        </div>
    </div>
</div>
<footer class="container-fluid" style="background-color: #363636;">
    <div class="container p-4">
        <div class="row">
            <div class="col-2">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item font-weight-bold text-white bgn">关于我们</li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">公司简介</a></li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">公司治理</a></li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">公司年报</a></li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">可持续发展</a></li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">出版物</a></li>
                </ul>
            </div>
            <div class="col-2">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item font-weight-bold text-white bgn">新闻 & 展会</li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">新闻</a></li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">安全通告</a></li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">展会|活动</a></li>
                </ul>
            </div>
            <div class="col-2">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item font-weight-bold text-white bgn">友情链接</li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">企业社区</a></li>
                    <li class="list-group-item bgn"><a href="#" class="text-muted">职业测评</a></li>
                </ul>
            </div>
            <div class="col-3"></div>
            <div class="col-3 pl-3" style="border-left: 2px solid #5d5d5d">
                <h4 class="text-white p-3">关注我们</h4>
                <ul class="list-inline p-2">
                    <li class="list-inline-item"><a href="#" class="text-white h4"><i class="fab fa-weibo"></i></a></li>
                    <li class="list-inline-item"><a href="#" class="text-white h4"><i class="fab fa-weixin"></i></a></li>
                    <li class="list-inline-item"><a href="#" class="text-white h4"><i class="fab fa-facebook-square"></i></a></li>
                    <li class="list-inline-item"><a href="#" class="text-white h4"><i class="fab fa-twitter"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="row" style="background-color: #272727">
        <div class="col">
            <p class="text-muted text-center my-2">版权所有 © XX技术有限公司 1996-2018。 保留一切权利。</p>
        </div>
    </div>
</footer>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<script src="scripts/index.js" type="text/javascript" rel="script"></script>
</body>
</html>
