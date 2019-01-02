$(function () {
    'use strict';

    // 验证器
    window.Validator = function (val, rule) {

        this.is_valid = function (new_val) {
            var key;

            // 避免在清空原有输入值之后不再进行检测的情况，即new_val为空时取清空前的val值
            if (new_val !== undefined)
                val = new_val;

            // 如果不是必填项且用户未填写任何内容则直接判定为合法
            if (!rule.required && !val)
                return true;

            for (key in rule) {
                // 避免对required字段的重复检测
                if (key === 'required' && !rule.required) {
                    continue;
                }

                // 调用验证器中相对应rule字段的方法
                var r = this['validate_' + key]();
                if (!r) return false;
            }

            return true;
        };

        this.validate_max = function () {
            pre_max_min();
            return val <= rule.max;
        };

        this.validate_min = function () {
            pre_max_min();
            return val >= rule.min;
        };

        this.validate_minlength = function () {
            pre_length();
            return val.length >= rule.minlength;
        };

        this.validate_maxlength = function () {
            pre_length();
            return val.length <= rule.maxlength;
        };

        this.validate_numeric = function () {
            return $.isNumeric(val);
        };

        this.validate_required = function () {
            var real = $.trim(val); // 去掉前后多余的空格
            if (!real && real !== 0)
                return false;
            return true;
        };

        this.validate_pattern = function () {
            var reg = new RegExp(rule.pattern);
            return reg.test(val);
        };

        // 用于注册界面验证确认密码是否与密码一致
        this.validate_confirm_password = function () {
            var pwd = $('#inputPwd').val().toString();
            var confirm_pwd = $('#inputConfirmPwd').val().toString();
            return pwd===confirm_pwd;
        };

        /* 用于完成validate_max
            或validate_min的前置工作
         */
        function pre_max_min() {
            val = parseFloat(val);
        }

        /* 用于完成validate_maxlength
            或validate_minlength的前置工作
         */
        function pre_length() {
            val = val.toString();
        }
    }
});