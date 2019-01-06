$(function () {
    'use strict';

    var _com = new Common();

    var currentUser = JSON.parse($.cookie('currentUser'));


    //读取当前登录用户的信息
    $('.signout').on('click', function (e) {
        if(currentUser)
            $.removeCookie('currentUser', { path: '/' });
        check_current_user();
    });

    var $signed_user_ele = $('#signin-toggle > .hide');
    var $nosignin_user_ele = $('#signin-toggle > .show');

    function check_current_user() {
        if (currentUser != null) {
            $('#userDropdown').html(currentUser.name);
            $signed_user_ele.show();
            $nosignin_user_ele.hide();
        } else {
            $('#userDropdown').html('姓名');
            $signed_user_ele.hide();
            $nosignin_user_ele.show();
        }
    }

    check_current_user();
    // console.log(currentUser);
    // console.log(currentUser.name);
    // console.log(currentUser);
    // console.log(currentUser.name);
});