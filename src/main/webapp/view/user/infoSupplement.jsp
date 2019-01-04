<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>请完善你的个人信息</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font-Awesome -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- Sign in & Sign up CSS -->
    <link rel="stylesheet" href="../../styles/sign.css" type="text/css">
</head>
<body>
<div class="container supplement-container">
    <!--信息完善表单-->
    <form id="supplement" class="form-supplement">
        <h3 class="text-center mb-5">请完善你的个人信息</h3>
        <div class="form-group row">
            <label for="inputName" class="col-form-label required">姓名</label>
            <div class="col-sm-4">
                <input type="text" id="inputName" class="form-control" autocomplete="off" autofocus>
            </div>
        </div>
        <div class="form-group row">
            <label for="selectEducationLevel" class="col-form-label required">学历</label>
            <div class="col-sm-3">
                <select name="educationLevel" id="selectEducationLevel" class="form-control" required>
                    <option>请选择...</option>
                    <option>博士</option>
                    <option>研究生</option>
                    <option>本科</option>
                    <option>大专</option>
                    <option>高中</option>
                    <option>其他</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="selectSex" class="col-form-label required">性别</label>
            <div class="col-sm-3">
                <select name="sex" id="selectSex" class="form-control" required>
                    <option value="1" selected>男</option>
                    <option value="0">女</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="selectSchool" class="col-form-label required">学校</label>
            <div class="col-sm-3">
                <select name="province" class="form-control" required>
                    <option selected>省</option>
                    <option>浙江省</option>
                    <option>...</option>
                </select>
            </div>
            <div class="col-sm-3">
                <select name="city" class="form-control" required>
                    <option selected>市</option>
                    <option>杭州市</option>
                    <option>...</option>
                </select>
            </div>
            <div class="col-sm-4">
                <select name="school" id="selectSchool" class="form-control" required>
                    <option selected>请选择...</option>
                    <option>杭州电子科技大学</option>
                    <option>...</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="inputBirthday" class="col-form-label required">出生日期</label>
            <div class="col-sm-6">
                <input type="date" class="form-control" id="inputBirthday" required>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label required">所在地</label>
            <div class="col-sm-3">
                <select name="province" class="form-control" required>
                    <option selected>省</option>
                    <option>浙江省</option>
                    <option>...</option>
                </select>
            </div>
            <div class="col-sm-3">
                <select name="city" class="form-control" required>
                    <option selected>市</option>
                    <option>杭州市</option>
                    <option>...</option>
                </select>
            </div>
            <!--<div class="col-sm-6">-->
            <!--<input type="text" id="inputLocation" class="form-control" placeholder="详细地址(选填)">-->
            <!--</div>-->
        </div>
        <div class="form-group row">
            <label for="inputPhone" class="col-form-label required">手机号码</label>
            <div class="col-sm-4">
                <!--指定只能输入数字，但是还没有能够关闭输入法的输入-->
                <input type="text" id="inputPhone" class="form-control" maxlength="11" style="ime-mode:disabled"
                       onkeydown="if(event.keyCode==13)event.keyCode=9"
                       onkeypress="if ((event.keyCode<48 || event.keyCode>57)) event.returnValue=false">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputEMail" class="col-form-label">邮箱</label>
            <div class="col-sm-6">
                <input type="text" id="inputEMail" class="form-control">
            </div>
        </div>
        <!--上传头像-->
        <div class="btn-wrap text-center">
            <button class="btn btn-primary" type="submit">提交</button>
            <button class="btn btn-secondary" type="submit">取消</button>
        </div>
    </form>
</div>

<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<script src="../../scripts/common.js"></script>
<script src="../../scripts/validator.js"></script>
<script src="../../scripts/input.js"></script>
<script src="../../scripts/infoSupplement.js"></script>
</body>
</html>