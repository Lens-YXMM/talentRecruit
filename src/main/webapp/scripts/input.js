$(function () {
    'use strict';

    window.Input = function (selector) {
        var $ele,
            $error_ele,
            me = this,
            rule =
                {
                    required: true
                };

        this.load_validator = function () {
            var val = this.get_val();
            this.validator = new Validator(val, rule);
        };

        // var lv = load_validator();

        this.get_val = function () {
            return $ele.val();
        };

        function init() {
            find_ele();
            get_error_ele();
            parse_rule();
            me.load_validator();
            listen();
        }

        function find_ele() {
            //如果传入的参数selector为jQuery对象，则直接赋值给$ele,否则将其转换为jQuery对象后再赋值
            if (selector instanceof jQuery) {
                $ele = selector;
            } else {
                $ele = $(selector);
            }
        }

        function get_error_ele() {
            $error_ele = $(get_error_selector());
        }

        function get_error_selector() {
            return '#' + $ele.attr('name') + '-input-error';
        }

        function parse_rule() {
            var i,
                rule_str = $ele.data('rule'); // data-rule='pattern:"^[a-z0-9]*$"|maxlength:20|minlength:6'
            if (!rule_str) return;

            var rule_arr = rule_str.split('|'); // ['pattern:"^[a-z0-9]*$"', 'maxlength:20', 'minlength:6']
            for (i = 0; i < rule_arr.length; i++) {
                var item_str = rule_arr[i];
                var item_arr = item_str.split(':'); // ['maxlength', '20']
                rule[item_arr[0]] = JSON.parse(item_arr[1]); // {maxlength: 20}
            }
        }

        // function load_validator() {
        //     var val = me.get_val();
        //     this.validator = new Validator(val, rule);
        // }

        function listen() {
            $ele.on('blur', function () {
                var valid = me.validator.is_valid(me.get_val());
                if (valid)
                    hide_invalid();
                else
                    show_invalid();
            })
        }

        function hide_invalid() {
            // if ($ele.hasClass("border-invaild"))
                $ele.removeClass("border-invaild");
            $error_ele.hide();
        }

        function show_invalid() {
            $ele.addClass("border-invaild");
            $error_ele.show();
        }

        init();
    }

});