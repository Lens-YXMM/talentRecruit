$(function () {
    'use strict';

    // txt=username|password
    var loc = window.location.href;
    var tmp = loc.indexOf('txt=')
    var username = '',
        password = '';

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
});