package com.recruit.controller;


import com.recruit.data.pojo.User;
import com.recruit.service.UserService;
import com.recruit.web.interceptor.Const;
import com.recruit.web.interceptor.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @param session
     * @return
     */
    //@RequestMapping(value = "/signin",method = RequestMethod.POST)
    //@ResponseBody
    //public ServerResponse<User> signin(String username, String password, HttpSession session){
    //    ServerResponse<User> response = userService.signin(username,password);
    //    if(response.isSuccess()){
    //        session.setAttribute(Const.CURRENT_USER, response.getData());
    //    }
    //    return response;
    //}

    /**
     *
     * @return
     */
    @RequestMapping(value = "/tosignin", method = RequestMethod.GET)
    public String signin(){
        return "user/signin";
    }

    @RequestMapping(value = "/tosignup", method = RequestMethod.GET)
    public String signup(){
        return "user/signup";
    }

    @RequestMapping(value = "/toindex", method = RequestMethod.GET)
    public String index(){
        return "user/index";
    }


    //@RequestMapping(value = "/logout", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    //public ModelAndView logoutUser(@ModelAttribute("user") User user, SessionStatus sessionStatus){
    //    /**
    //     * @ModelAttribute("User") 相当于将session中名为"User"的对象注入user对象中
    //     * sessionStatus中的setComplete方法可以将session中的内容全部清空
    //     */
    //    sessionStatus.setComplete();
    //    ModelAndView mv = new ModelAndView("user/index");
    //    return mv;
    //}

    //@ResponseBody
    //@RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    //public Map<String, Object> loginUser(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password, @RequestParam(value = "ipAddr") String ipAddr, @RequestParam(value = "resolution") String resolution,@RequestParam(value = "browser") String browser){
    //    Map<String, Object> map = new HashMap<>();
    //    int result = 0;
    //    try {
    //        result = userService.loginUser(account, password, ipAddr, resolution, browser);
    //    } catch (Exception e) {
    //        System.out.println("调用用户登录服务异常------");
    //        e.printStackTrace();
    //    }
    //    if (result <= 0) {
    //        result = 0;
    //    }
    //    return map;
    //}
}
