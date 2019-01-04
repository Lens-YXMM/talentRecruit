<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>我的简历-XX招聘</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font-Awesome -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <!--Main CSS-->
    <link rel="stylesheet" href="../../styles/main.css" type="text/css">
    <link rel="stylesheet" href="../../styles/resume.css" type="text/css">

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
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
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
    <div class="row">
        <div class="col-8 mr_myResume_1 r-bg">
            <div class="mr-top-bg text-center py-5">
                <div class="rounded-circle mx-auto" style="border: 5px solid #515151; overflow: hidden; width: 122px; height: 122px;">
                    <i class="fa fa-user-circle fa-7x"></i>
                    <!--<img src="..." alt="头像" class="d-none mx-auto mb-3" width="112" height="112">-->
                    <!--<i class="fas fa-camera fa-3x d-none" style="position: absolute;"></i>-->
                </div>
            </div>
            <div data-spy="scroll" data-target="#mr-module" data-offset="0" class="resume-content px-4">
                <div id="baseInfo" class="text-center">
                    <span class="h3" class="mb-3 user-name">张三</span>
                    <div class="mr-p-info">
                        <div class="info-t">
                            <span class="school">
                                <em class="mr-2">软件工程</em>
                                <em class="mr-2">·</em>
                                <em class="mr-2">杭州电子科技大学</em>
                            </span>
                        </div>
                        <div class="info-j">
                            <span class="person-info">
                                <em class="mr-2 sex">男</em>
                                <em class="mr-2 age">21岁</em>
                                <em class="mr-2 ">本科</em>
                                <em class="mr-2 ">应届毕业生</em>
                                <em class="mr-2 ">杭州</em>
                            </span>
                        </div>
                        <div class="info-b">
                            <span class="mobile">
                                <em class="mr-2">17826837546</em>
                            </span>
                            <span class="email">
                                <em class="mr-2">294036494@qq.com</em>
                            </span>
                        </div>
                    </div>
                </div>
                <div id="preferredJob">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>求职意向</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 编辑</button>
                        </div>
                    </div>
                    <form class="preferedJobFrom p-3">
                        <div class="form-group row">
                            <!--添加label和重新布局-->
                            <div class="col-6">
                                <select class="form-control">
                                    <option>web前端开发及相关工作</option>
                                </select>
                            </div>
                            <div class="col-3">
                                <select class="form-control">
                                    <option>全职</option>
                                </select>
                            </div>
                            <div class="col-3">
                                <select class="form-control">
                                    <option>杭州</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-6">
                                <select class="form-control">
                                    <option>6k</option>
                                </select>
                            </div>
                            <div class="col-6">
                                <select class="form-control">
                                    <option>8k</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-6">
                                <select class="form-control">
                                    <option>积极找工作</option>
                                </select>
                            </div>
                            <div class="col-6">
                                <select class="form-control">
                                    <option>随时</option>
                                </select>
                            </div>
                        </div>
                        <button class="btn btn-primary" type="submit">保存</button>
                        <button class="btn btn-link">取消</button>
                    </form>
                    <ul class="list-inline row">
                        <li class="list-inline-item col-4 ml-3">
                            <span>web前端开发及相关工作</span>
                        </li>
                        <li class="list-inline-item col-2 ml-3">
                            <span>全职</span>
                        </li>
                        <li class="list-inline-item col-2 ml-3">
                            <span>杭州</span>
                        </li>
                        <li class="list-inline-item col-2">
                            <span>6-8k</span>
                        </li>
                        <li class="list-inline-item col-4 ml-3">
                            <span>积极找工作</span>
                            <span>/随时</span>
                        </li>
                    </ul>
                </div>
                <div id="workExperience">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <span>工作经历</span>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link dn"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 取消</button>
                        </div>
                    </div>
                    <form class="workExperienceForm">
                        <div class="form-group">
                            <label for="companyName">公司</label>
                            <input type="text" class="form-control" id="companyName" placeholder="公司名称">
                        </div>
                        <div class="form-group">
                            <label for="positionName">职位</label>
                            <input type="text" class="form-control" id="positionName" placeholder="职位名称">
                        </div>
                        <div class="form-group">
                            <label>在职时间</label>
                            <div class="row">
                                <div class="col">
                                    <input type="date" class="form-control" id="startDate" placeholder="起始时间">
                                </div>
                                <div class="col">
                                    <input type="date" class="form-control" id="endDate" placeholder="截止时间">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="workRole">工作职责</label>
                            <div class="workResponsibility">
                                <textarea cols="80" rows="5"  class=" form-control" id="workRole"></textarea>
                            </div>
                        </div>
                        <div class="btn-wrap">
                            <button class="btn btn-primary" type="submit">保存</button>
                            <button class="btn btn-secondary" type="submit">取消</button>
                        </div>
                    </form>
                    <div class="show-list">
                        <div class="list-content-wrap">
                            <div class="d-flex justify-content-between">
                                <div class="mr-content-l">
                                    <span class="company-name">网易公司</span>
                                </div>
                                <div class="mr-content-r">
                                    <div class="dn">
                                        <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 编辑</button>
                                        <button class="btn btn-link"><i class="fa fa-remove" aria-hidden="true"></i> 删除</button>
                                    </div>
                                    <span>2016.03.30</span>
                                    <span> - </span>
                                    <span>2017.09.01</span>
                                </div>
                            </div>
                            <div class="mr-content-b">
                                <span class="job-name">软件测试工程师</span>
                                <div class="job-role">1、对网易产品的软件质量进行把关；理解产品设计原理、实现过程；
                                    2、制订测试计划、规划测试方案、编写软件测试工具、执行软件测试、分析测试数据、输出测试报告；
                                    3、对测试中的问题进行分析和定位，与开发人员一起寻求解决方案；
                                    4、提出对产品的进一步改进的建议，并评估改进方案是否合理；对测试结果进行总结与统计分析；
                                    5、能负责各个产品和解决方案的准入测试、比拼测试、选型测试，负责重大跨领域项目集成交付、问题故障界定、技术能力中心（包括竞争分析、场景分析、性能分析）的建设等工作；
                                    6、能直接与全球顶级的运营商、行业客户沟通对话，以专业的技术，架起华为与客户之间沟通的桥梁。</div>
                            </div>
                        </div>
                        <div class="list-content-wrap">
                            <div class="d-flex justify-content-between">
                                <div class="mr-content-l">
                                    <span class="company-name">公司名称</span>
                                </div>
                                <div class="mr-content-r">
                                    <div class="dn">
                                        <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 编辑</button>
                                        <button class="btn btn-link"><i class="fa fa-remove" aria-hidden="true"></i> 删除</button>
                                    </div>
                                    <span>开始时间</span>
                                    <span> - </span>
                                    <span>截止时间</span>
                                </div>
                            </div>
                            <div class="mr-content-b">
                                <span class="job-name">职位名称</span>
                                <div class="job-role">工作职责</div>
                            </div>
                        </div>
                    </div>
                    </div>
                </div>
                <div id="educationExperience">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>教育经历</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                        </div>
                    </div>
                    <form class="educationExperienceForm">
                        <div class="form-group">
                            <label for="inputSchoolName">学校名称</label>
                            <input type="text" class="form-control" id="inputSchoolName" placeholder="请输入学校名称">
                        </div>
                        <div class="form-group">
                            <label>在校时间</label>
                            <input type="number" class="form-control" placeholder="请输入开学年份">
                            <input type="number" class="form-control" placeholder="请输入毕业年份">
                        </div>
                        <div class="form-group">
                            <label for="selectEducationLevel">学历</label>
                            <select name="educationLevel" id="selectEducationLevel" class="form-control" required>
                                <option>请选择学历</option>
                                <option>博士</option>
                                <option>研究生</option>
                                <option>本科</option>
                                <option>大专</option>
                                <option>高中</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="inputMajorName">专业名称</label>
                            <input type="text" class="form-control" id="inputMajorName" placeholder="请输入专业名称"></div>
                    </form>
                    <div class="show-list">
                        <div class="d-flex justify-content-between">
                            <div class="mr_content_l">
                                <h5>杭州电子科技大学</h5>
                                <span>本科</span>
                                /
                                <span>软件工程</span>
                            </div>
                            <div class="mr_content_r">
                                <div>
                                    <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 编辑</button>
                                    <button class="btn btn-link"><i class="fa fa-remove" aria-hidden="true"></i> 删除</button>
                                </div>
                                <span>开始时间</span>
                                <span> - </span>
                                <span>截止时间</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="projectExperience">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>项目经历</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                        </div>
                    </div>
                    <form class="projectExperienceForm">
                        <div class="form-group">
                            <label for="inputProjectName">项目名称</label>
                            <input type="text" class="form-control" id="inputProjectName" placeholder="请输入项目名称">
                        </div>
                        <div class="form-group">
                            <label>项目周期</label>
                            <input type="month" class="form-control" placeholder="请输入起始时间">
                            <input type="month" class="form-control" placeholder="请输入截止时间">
                        </div>
                        <div class="form-group">
                            <label for="inputProjectUrl">项目链接</label>
                            <input type="text" class="form-control" id="inputProjectUrl" placeholder="请输入项目链接（选填）">
                        </div>
                        <div class="form-group">
                            <label for="inputProjectInfo">项目描述</label>
                            <input type="text" class="form-control" id="inputProjectInfo" placeholder="请输入项目描述">
                        </div>
                        <div class="form-group">
                            <label for="inputAchievement">个人成就</label>
                            <input type="text" class="form-control" id="inputAchievement" placeholder="请输入个人成就">
                        </div>
                    </form>
                    <div class="show-list">
                        <div class="d-flex justify-content-between">
                            <div class="mr_content_l">
                                <h5>项目名称</h5>
                            </div>
                            <div class="mr_content_r">
                                <div>
                                    <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 编辑</button>
                                    <button class="btn btn-link"><i class="fa fa-remove" aria-hidden="true"></i> 删除</button>
                                </div>
                                <span>开始时间</span>
                                <span> - </span>
                                <span>截止时间</span>
                            </div>
                        </div>
                        <div class="mr_content_b">
                            <div class="info">项目描述</div>
                            <div class="achievement">个人成就</div>
                            <div class="projectUrl">项目链接：<span>url</span></div>
                        </div>
                    </div>
                </div>
                <div id="awardInfo">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>获奖情况</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                        </div>
                    </div>
                    <form class="awardInfoForm">
                        <!--偏向于应届生填写-->
                        <div class="form-group">
                            <label>奖项类型</label>
                            <input type="radio" name="awardTypeRadio" class="form-check-input" id="radioCompetition" value="competition" checked>
                            <label for="radioCompetition" class="form-check-label">竞赛获奖</label>
                            <input type="radio" name="awardTypeRadio" class="form-check-input" id="radioScholarship" value="scholarship">
                            <label for="radioScholarship" class="form-check-label">奖学金</label>
                        </div>
                        <div class="form-group">
                            <label for="selectAwardLevel">奖项级别</label>
                            <select name="awardLevel" id="selectAwardLevel">
                                <option>请选择...</option>
                                <option>国际级</option>
                                <option>国家级</option>
                                <option>省市级</option>
                                <option>学校级</option>
                                <option>院系级</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="inputAwardName">奖项名称</label>
                            <input type="text" class="form-control" id="inputAwardName" placeholder="请输入奖项名称">
                        </div>
                        <div class="form-group">
                            <label for="inputAcquireDate">获奖时间</label>
                            <input type="Month" class="form-control" id="inputAcquireDate">
                        </div>
                        <div class="form-group">
                            <label for="inputPrizeLevel">奖项等级</label>
                            <input type="text" class="form-control" id="inputPrizeLevel" placeholder="请输入奖项等级">
                        </div>
                        <div class="form-group">
                            <label for="inputAwardInfo">获奖情况</label>
                            <textarea cols="80" rows="5"  class=" form-control" id="inputAwardInfo"></textarea>
                        </div>
                    </form>
                    <div class="show-list">
                        <div class="d-flex justify-content-between">
                            <div class="mr_content_l">
                                <h5>奖项名称</h5>
                            </div>
                            <div class="mr_content_r">
                                <div>
                                    <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 编辑</button>
                                    <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 删除</button>
                                </div>
                                <span>获得时间</span>
                            </div>
                        </div>
                        <div class="mr_content_b">
                            <div class="awardLevel">省级</div>
                            <div class="prizeLevel">一等奖</div>
                        </div>
                    </div>
                </div>
                <div id="skillAccess">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>技能评估</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                        </div>
                    </div>
                    <div class="showlist">
                        <div class="skill">
                            <!--跟随范围条移动改变值，分为了解、熟悉、掌握、精通-->
                            <label for="skillRange1">掌握程度</label>
                            <!--确定后变为只读状态-->
                            <input type="text" class="form-control" id="skillname1" placeholder="技能项">
                            <input type="range" class="form-control-range" id="skillRange1">
                        </div>
                    </div>
                </div>
                <div id="language">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>语言能力</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                        </div>
                    </div>
                    <div class="showlist">
                        l
                    </div>
                </div>
                <div id="certificate">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>资格证书</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                        </div>
                    </div>
                </div>
                <div id="identity">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>身份证明</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 添加</button>
                        </div>
                    </div>
                </div>
                <div id="otherInfo">
                    <div class="title d-flex justify-content-between">
                        <div class="title-l">
                            <h3>自定义信息</h3>
                        </div>
                        <div class="title-r">
                            <button class="btn btn-link"><i class="fa fa-edit" aria-hidden="true"></i> 编辑</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-4 pl-5 mr_myResume_r">
            <div class="mr_bar">
                <ul class="list-inline text-center">
                    <li class="list-inline-item p-2 pr r-bg rb-s">
                        <span class="badge badge-primary ml-1 pa-rt">5</span>
                        <a href="#">
                            <i class="fa fa-archive fa-2x"></i>
                            <p class="mb-0">投递箱</p>
                        </a>
                    </li>
                    <li class="list-inline-item p-2 r-bg rb-s">
                        <a href="#">
                            <i class="fa fa-envelope fa-2x"></i>
                            <p class="mb-0">邀请函</p>
                        </a>
                    </li>
                    <li class="list-inline-item p-2 r-bg rb-s">
                        <a href="#">
                            <i class="fa fa-star fa-2x"></i>
                            <p class="mb-0">收藏夹</p>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="mr_upload p-3 mb-3 r-bg rb-s">
                <button type="button" class="close d-none" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <div class="mr_up_main">
                    <i class="fa fa-file fa-2x"></i>
                    <a href="#">上传简历.pdf</a>
                </div>
                <form class="mr_set_default">
                    <select class="form-control" id="default_resume">
                        <option>默认投递：在线简历</option>
                        <option>默认投递：附件简历</option>
                    </select>
                </form>
            </div>
            <div id="scroll-fix">
                <div class="mr-integrity p-3  mb-3 r-bg rb-s">
                    <h5 class="text-muted">简历完整度</h5>
                    <div class="progress">
                        <div class="progress-bar" role="progressbar" style="width: 25%" aria-valuenow="25"
                             aria-valuemin="0" aria-valuemax="100">25%
                        </div>
                    </div>
                </div>
                <div id="mr-module" class="list-group p-3  mb-3 r-bg rb-s">
                    <a class="list-group-item list-group-item-action" href="#baseInfo">基本信息</a>
                    <a class="list-group-item list-group-item-action" href="#preferredJob">求职意向</a>
                    <a class="list-group-item list-group-item-action" href="#workExperience">工作经历</a>
                    <a class="list-group-item list-group-item-action" href="#educationExperience">教育经历</a>
                    <a class="list-group-item list-group-item-action" href="#projectExperience">项目经验</a>
                    <a class="list-group-item list-group-item-action" href="#awardInfo">获奖情况</a>
                    <a class="list-group-item list-group-item-action" href="#skillAccess">技能评估</a>
                    <a class="list-group-item list-group-item-action" href="#language">语言能力</a>
                    <a class="list-group-item list-group-item-action" href="#certificate">资格证书</a>
                    <a class="list-group-item list-group-item-action" href="#identity">身份证明</a>
                    <a class="list-group-item list-group-item-action" href="#otherInfo">自定义信息</a>
                </div>
            </div>
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