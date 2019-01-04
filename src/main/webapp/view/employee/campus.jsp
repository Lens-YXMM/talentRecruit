<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>校园招聘</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font-Awesome -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <!--Main CSS-->
    <link rel="stylesheet" href="../../styles/main.css" type="text/css">
    <link rel="stylesheet" href="../../styles/jobList.css" type="text/css">

</head>
<body>
<!-- Nav bar -->
<div class="navbar navbar-expand-md narbar-light bg-light border-bottom mb-5" role="navigation">
    <div class="container">
        <a class="navbar-brand" href="#"><i class="fa fa-black-tie logo" aria-hidden="true"></i>企业人才招聘系统</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">首页</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">关于我们</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">社会招聘</a>
                </li>
                <li class="nav-item active dropdown">
                    <a class="nav-link link-active dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                <li class="nav-item">
                    <a class="nav-link" href="#">登录</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">注册</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link dn" href="#">消息<span class="badge badge-primary ml-1">7</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link dn" href="#">我的简历</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link dn" href="#">投递箱<span class="badge badge-primary ml-1">5</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link dn" href="#">收藏夹</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle dn" href="#" id="userDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">用户名</a>
                    <div class="dropdown-menu" aria-labelledby="userDropdown">
                        <button class="dropdown-item" type="button">账号设置</button>
                        <button class="dropdown-item disabled" type="button">去企业版</button>
                        <button class="dropdown-item" type="button">退出</button>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>

<!-- Content -->

<div class="container">
    <div class="job-list">
        <div class="filtering">
            <!--筛选条件-->
            <dl class="filter-result clearfix">
                <dt>筛选条件</dt>
                <dd>
                    <!--<a href="javascript:;">全国</a>-->
                    <!--<a href="javascript:;">所有职位</a>-->
                    <span><i class="fa fa-trash-o" aria-hidden="true"></i>清空</span>
                </dd>
            </dl>
            <div class="filter-wrap">
                <dl class="clearfix">
                    <dt>工作地点</dt>
                    <dd class="filter-children">
                        <a class="filter-child" href="javascript:;">全国</a>
                        <a class="filter-child" href="javascript:;">北京</a>
                        <a class="filter-child" href="javascript:;">杭州</a>
                        <a class="filter-child" href="javascript:;">上海</a>
                    </dd>
                    <!--TODO：筛选条件超过一行时显示更多按钮-->
                    <!--<dt class="more">-->
                        <!--更多-->
                        <!--<span class="triangle-right"></span>-->
                    <!--</dt>-->
                </dl>
                <!--职位类别-->
                <dl class="clearfix">
                    <dt>职位类别</dt>
                    <dd class="filter-children">
                        <a class="filter-child" href="javascript:;">所有职位</a>
                        <a class="filter-child" href="javascript:;">研发类</a>
                        <a class="filter-child" href="javascript:;">销售类</a>
                        <a class="filter-child" href="javascript:;">财经类</a>
                        <a class="filter-child" href="javascript:;">运营类</a>
                        <a class="filter-child" href="javascript:;">设计类</a>
                        <a class="filter-child" href="javascript:;">产品类</a>
                        <a class="filter-child" href="javascript:;">供应链类</a>
                    </dd>
                    <!--TODO：筛选条件超过一行时显示更多按钮-->
                    <!--<dt class="more">-->
                    <!--更多-->
                    <!--<span class="triangle-right"></span>-->
                    <!--</dt>-->
                </dl>
                <!--关键词搜索-->
                <dl class="keyword clearfix">
                    <dt>关键词</dt>
                    <dd>
                        <input type="text" class="form-control" placeholder="请输入搜索的内容" aria-label="搜索的内容" aria-describedby="basic-addon2">
                        <button class="btn btn-outline-primary input-append-btn" type="button"><i class="fa fa-search"></i></button>
                </dl>
                    </dd>
            </div>
        </div>
        <div class="result-list">
            <div class="list-wrap">
                <ul class="title clearfix">
                    <li class="job-name">职位名称</li>
                    <li class="recruit-type">招聘类型</li>
                    <li class="job-location">工作地点</li>
                    <li class="job-type">职位类别</li>
                    <!--<li class="dept-name">部门名称</li>-->
                </ul>
                <ul class="content">
                    <li class="clearfix">
                        <div class="content-t clearfix">
                            <p class="job-name">信息管理工程师</p>
                            <p class="recruit-type">博士生</p>
                            <p class="job-location">北京</p>
                            <p class="job-type">产品类</p>
                        </div>
                        <div class="content-b">
                            <p class="job-description">从事无线（含WiFi等短距无线）通信系统的架构及通信信号处理算法/MAC协议及上层算法的研究和设计，系统仿真、通信实验和原型平台的搭建，及相关国际标准跟踪研究。</p>
                        </div>
                    </li>
                    <li class="clearfix">
                        <div class="content-t clearfix">
                            <p class="job-name">通信协议算法工程师</p>
                            <p class="recruit-type">博士生</p>
                            <p class="job-location">杭州</p>
                            <p class="job-type">产品类</p>
                        </div>
                        <div class="content-b">
                            <p class="job-description">1、负责物联网、Wifi等协议算法研究，包括组网路由算法、带宽动态管理等；
                                2、承担算法、代码开发交付，确保业界领先；
                                3、参与标准制定工作和对外技术合作。</p>
                        </div>
                    </li>
                    <li class="clearfix">
                        <div class="content-t clearfix">
                            <p class="job-name">硬件技术工程师</p>
                            <p class="recruit-type">博士生</p>
                            <p class="job-location">上海</p>
                            <p class="job-type">研发类</p>
                        </div>
                        <div class="content-b">
                            <p class="job-description">岗位职责：
                                1、手机拍照Camera摄像头领域前沿技术&amp;创新应用研究规划
                                2、手机拍照Camera摄像头模组架构设计
                                3、手机拍照Camera摄像头模组光学仿真</p>
                        </div>
                    </li>
                    <li class="clearfix">
                        <div class="content-t clearfix">
                            <p class="job-name">IT应用软件开发工程师</p>
                            <p class="recruit-type">应届生</p>
                            <p class="job-location">上海</p>
                            <p class="job-type">产品类</p>
                        </div>
                        <div class="content-b">
                            <p class="job-description">在这里，你将从事IT应用层软件、分布式云化软件、互联网软件等的设计开发，可以采用敏捷、Devops、开源等先进的软件设计开发模式，接触最前沿的产品和软件技术，成为一个软件大牛；你将参与华为产品的软件研发工作，包括但不限于：
                                （1）完成从客户需求到软件产品定义、架构设计、开发实现、再到上线运营维护等产品生命周期中的各个环节；
                                （2）创造性解决产品在实现过程中的技术难题，应用前沿技术提升产品的核心竞争力，如分布式系统、性能调优、可靠性、数据库等；
                                （3）有机会参与业界前沿技术研究和规划，参与开源社区运作，与全球专家一起工作、交流，构建华为在业界影响力。</p>
                        </div>
                    </li>
                </ul>
            </div>
            <!--TODO：页码显示，只有一页时不显示-->
            <div class="pager"></div>
        </div>
    </div>
</div>

<!--Footer-->
<footer class="container-fluid">
    <div class="container p-4">
        <div class="row">
            <div class="col-2">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item font-weight-bold text-white">关于我们</li>
                    <li class="list-group-item"><a href="#" class="text-muted">公司简介</a></li>
                    <li class="list-group-item"><a href="#" class="text-muted">公司治理</a></li>
                    <li class="list-group-item"><a href="#" class="text-muted">公司年报</a></li>
                    <li class="list-group-item"><a href="#" class="text-muted">可持续发展</a></li>
                    <li class="list-group-item"><a href="#" class="text-muted">出版物</a></li>
                </ul>
            </div>
            <div class="col-2">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item font-weight-bold text-white">新闻 & 展会</li>
                    <li class="list-group-item"><a href="#" class="text-muted">新闻</a></li>
                    <li class="list-group-item"><a href="#" class="text-muted">安全通告</a></li>
                    <li class="list-group-item"><a href="#" class="text-muted">展会 | 活动</a></li>
                </ul>
            </div>
            <div class="col-2">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item font-weight-bold text-white">友情链接</li>
                    <li class="list-group-item"><a href="#" class="text-muted">企业社区</a></li>
                    <li class="list-group-item"><a href="#" class="text-muted">职业测评</a></li>
                </ul>
            </div>
            <div class="col-3"></div>
            <div class="col-3 pl-3 contact">
                <h5 class="text-white p-3">关注我们</h5>
                <ul class="list-inline p-2 ">
                    <!--还需要添加a标签的hover属性，微信采用浮窗图片的形式，无法使用的链接置黑-->
                    <li class="list-inline-item"><a href="weibo" class="text-white h4 weibo" target="_blank"><i
                            class="fa fa-weibo"></i></a></li>
                    <li class="list-inline-item"><a href="weixin" class="text-white h4 wechat"><i
                            class="fa fa-weixin"></i></a></li>
                    <li class="list-inline-item"><a href="facebook" class="text-white h4 facebook" target="_blank"><i
                            class="fa fa-facebook-square"></i></a></li>
                    <li class="list-inline-item"><a href="twitter" class="text-white h4 twitter" target="_blank"><i
                            class="fa fa-twitter"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
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