<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>员工管理</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font-Awesome -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- Main CSS -->
    <link rel="stylesheet" href="../../styles/main.css" type="text/css">
    <link rel="stylesheet" href="../../styles/admin.css" type="text/css">
</head>
<body>
<div class="clearfix">
    <!-- Nav bar -->
    <div class="side-bar">
        <a class="logo" href="#"><i class="fa fa-suitcase fa-3x" aria-hidden="true"></i><br/>XX企业</a>
        <ul class="side-nav">
            <li><a href="../admin/index.jsp"><i class="fa fa-home" aria-hidden="true"></i>首页</a></li>
            <li><a href="#"><i class="fa fa-bullhorn" aria-hidden="true"></i>公告管理</a></li>
            <li>
                <a href="#recruit-info-dropdown" data-toggle="collapse">
                    <i class="fa fa-bullhorn" aria-hidden="true"></i>招聘信息管理<i class="fa fa-toggle-down" aria-hidden="true"></i>
                </a>
                <ul id="recruit-info-dropdown" class="collapse dropdown">
                    <li><a href="#">职位管理</a></li>
                    <li><a href="#">招聘会管理</a></li>
                </ul>
            </li>
            <li>
                <a class="active" href="#human-resource-dropdown" data-toggle="collapse">
                    <i class="fa fa-bullhorn" aria-hidden="true"></i>人力资源管理<i class="fa fa-toggle-down" aria-hidden="true"></i>
                </a>
                <ul id="human-resource-dropdown" class="collapse show dropdown">
                    <li><a class="active" href="#">员工管理</a></li>
                    <li><a href="#">笔试面试管理</a></li>
                    <li><a href="#">人才库管理</a></li>
                </ul>
            </li>
            <li>
                <a href="#admin-dropdown" data-toggle="collapse">
                    <i class="fa fa-bullhorn" aria-hidden="true"></i>系统管理<i class="fa fa-toggle-down" aria-hidden="true"></i>
                </a>
                <ul id="admin-dropdown" class="collapse dropdown">
                    <li><a href="#">账号管理</a></li>
                    <li><a href="#">黑名单管理</a></li>
                    <li><a href="#">操作记录</a></li>
                </ul>
            </li>
        </ul>
    </div>

    <!--Content-->
    <div class="content">
        <div class="content-wrap header">
            <ul class="header-r">
                <li><span><i class="fa fa-clock-o" aria-hidden="true"></i>2018/11/30</span></li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle username" href="#"><i class="fa fa-user" aria-hidden="true"></i>hr_yfb001</a>
                    <ul class="dropdown-menu">
                        <li class="dropdown-item"><a href="#">账号设置</a></li>
                        <li class="dropdown-item"><a href="#">退出</a></li>
                    </ul>
                </li>
            </ul>
            <!--面包屑导航-->
            <ul class="breadcrumb">
                <li class="breadcrumb-item"><a href="#">首页</a></li>
                <li class="breadcrumb-item"><a href="#">人力资源管理</a></li>
                <li class="breadcrumb-item"><a href="#">员工管理</a></li>
                <li class="breadcrumb-item active" aria-current="page">张三</li>
            </ul>
        </div>
        <div class="content-wrap">
            <form>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">姓名</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control-plaintext" value="张三" disabled>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">所属地区</label>
                    <div class="col-sm-5">
                        <select class="form-control" name="deptName">
                            <option selected>市</option>
                            <option>杭州</option>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">所属部门</label>
                    <div class="col-sm-5">
                        <select class="form-control" name="deptName">
                            <option selected>部门名称</option>
                            <option>研发部</option>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">职位</label>
                    <div class="col-sm-5">
                        <select class="form-control" name="jobName">
                            <option selected>职位名称</option>
                            <option>初级web前端工程师</option>
                        </select>
                    </div>
                </div>
                <fieldset class="form-group">
                    <div class="row">
                        <legend class="col-sm-2 col-form-label pt-0">入职状态</legend>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="employStatus" id="trainee">
                                <label class="form-check-label" for="trainee">实习期</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="employStatus" id="probation">
                                <label class="form-check-label" for="probation">试用期</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="employStatus" id="regular">
                                <label class="form-check-label" for="regular">正式员工</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="employStatus" id="dimission">
                                <label class="form-check-label" for="dimission">离职</label>
                            </div>
                        </div>
                    </div>
                </fieldset>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">试用期</label>
                    <div class="col-sm-5">
                        <input type="date" class="form-control" id="startDate" placeholder="起始时间">
                    </div>
                    <div class="col-sm-5">
                        <input type="date" class="form-control" id="endDate" placeholder="截止时间">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label" for="beRegularDate">转正日期</label>
                    <div class="col-sm-5">
                        <input type="date" class="form-control" id="beRegularDate" placeholder="转正日期">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label" for="dimissionDate">离职日期</label>
                    <div class="col-sm-5">
                        <input type="date" class="form-control" id="dimissionDate" placeholder="离职日期">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">保存</button>
                        <button type="submit" class="btn btn-secondary">取消</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<!--Footer-->
<footer class="container-fluid">

    <div class="row">
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
</body>
</html>