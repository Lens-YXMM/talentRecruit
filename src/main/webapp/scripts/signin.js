$(function () {
    'use strict';

    var _com = new Common();

    // 选中页面中所有的input[data-rule]
    var $inputs = $('[data-rule]'),
        $form = $('#signin'),
        inputs = [];

    $inputs.each(function (index, node) {
        // 解析每一个input的验证规则
        var tmp = new Input(node);
        inputs.push(tmp);
    });

    // 提交验证
    $form.on('submit', function (e) {
        e.preventDefault();
        $inputs.trigger('blur');

        for (var i = 0; i < inputs.length; i++) {
            var item = inputs[i];
            var r = item.validator.is_valid();
            if (!r) {
                return;
            }
        }
        submit();
    });
    // 提交表单
    function submit() {
        var formData = {
            username: $.trim($inputs.eq(0).val()),
            password: $.trim($inputs.eq(1).val())
        };
        signin(formData,
            function (res) {
                window.location.href = _com.getUrlParam('redirect') || _com.goHome();
            },
            function (errMsg) {
                // TODO: 为输入框添加红框
                alert(errMsg);
            })
    }
    // 用户登录
    function signin(userInfo, resolve, reject) {
        _com.request({
            url: _com.getServerUrl('/user/signin.do'),
            data: userInfo,
            method: 'POST',
            success: resolve,
            error: reject
        });
    }
});