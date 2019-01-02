$(function () {
   'use strict';

   window.Common = function () {
       var conf = {
           serverHost: ''
       };

       this.request = function (param) {
           var me = this;
           $.ajax({
               type        : param.method  || 'get',
               url         : param.url     || '',
               dataType    : param.type    || 'json',
               data        : param.data    || '',
               success     : function(res){
                   // 请求成功
                   if(0 === res.status){
                       typeof param.success === 'function' && param.success(res.data, res.msg);
                   }
                   // 没有登录状态，需要强制登录
                   else if(10 === res.status){
                       me.doLogin();
                   }
                   // 请求数据错误
                   else if(1 === res.status){
                       typeof param.error === 'function' && param.error(res.msg);
                   }
               },
               error       : function(err){
                   typeof param.error === 'function' && param.error(err.statusText);
               }
           });
       };
       // 获取服务器地址
       this.getServerUrl = function (path) {
           return conf.serverHost + path;
       };
       // 获取url参数
       this.getUrlParam = function(name){
           var reg     = new RegExp('(^|&)' + name + '=([^&]*)(&|$)');
           var result  = window.location.search.substr(1).match(reg);
           return result ? decodeURIComponent(result[2]) : null;
       };
       // 成功提示
       this.successTips = function(msg){
           alert(msg || '操作成功！');
       };
       // 错误提示
       this.errorTips = function(msg){
           alert(msg || '哪里不对了~');
       };
       // 统一登录处理
       this.doLogin = function(){
           window.location.href = this.getServerUrl('/user/signin.html?redirect=' + encodeURIComponent(window.location.href));
       };
       // 回到首页
       this.goHome = function(){
           window.location.href = this.getServerUrl('/index.html');
       }
   }
});