function webInfo(){
    /**
     * @param browserName 浏览器名,browserVersion 浏览器版本
     * @type {string}
     */
    var browserName = navigator.appName;
    var browserVersion = navigator.appVersion;

    $.ajax({
        url: "login",
        type: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify({
            ipAddr:"127.0.0.1",
            resolution: screen.width+"*"+screen.height,
            browser: browserName+" "+browserVersion
        }),
        async: true,
        success: function(data) {
            alert("浏览器的版本是"+browserVersion);
            var ss = JSON.stringify(data);
            $("#result").val(ss);
            console.log(ss);
        }
    })
}