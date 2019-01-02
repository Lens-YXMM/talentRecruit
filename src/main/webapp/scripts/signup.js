$(function () {
    'use strict';

    var _com = new Common();

    // 选中页面中所有的input[data-rule]
    var $inputs = $('[data-rule]'),
        $form = $('#signup'),
        inputs = [];

    $inputs.each(function (index, node) {
        // 解析每一个input的验证规则
        var tmp = new Input(node);
        inputs.push(tmp);
    });
    var username = $.trim($inputs.eq(0).val()),
        password = $.trim($inputs.eq(1).val());
    // 异步验证用户名是否存在
    // $inputs.eq(0).on('blur',
    // check_username(username,
    //     function (res) {
    //         // TODO: toggle错误提示
    //     },
    //     function (errMsg) {
    //         alert(errMsg);
    //     }));

    // 提交验证
    $form.on('submit', function (e) {
        for (var i = 0; i < inputs.length; i++) {
            e.preventDefault();

            $inputs.trigger('blur');
            var item = inputs[i];
            var r = item.validator.is_valid();
            if (!r) {
                return;
            }
        }

        // 带参数跳转至信息补充页面
        // TODO: 改成跳转jsp页面
        window.location.href = './infoSupplement.html?txt='+encodeURIComponent(username+'|'+password);
    });

    function confirm_password() {
        // $('#inputConfirmPwd').on('blur', function () {

        $inputs[2].on('blur', function () {
            // 比较密码和确认密码框中字符是否相同
            if ($inputs[1].val() === $inputs[2].val())
                console.log('两次密码相同');
        })
    }
    // // 跳转信息补充页面
    // function go_supplement() {
    //
    // }
    // 检查用户名是否存在
    function check_username(username, resolve, reject){
        _com.request({
            url     : _com.getServerUrl('/user/check_username'),
            data    : {
                type    : 'username',
                str     : username
            },
            method  : 'POST',
            success : resolve,
            error   : reject
        });
    }
});