$(function() {
    $('#exit').click(function () {
        $.ajax({
           type: "POST",
            url: "logout",
            success:function () {
               alert("退出登录");
            }

        });
    });
});