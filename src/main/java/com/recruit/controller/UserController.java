package com.recruit.controller;

import com.recruit.data.entity.User;
import com.recruit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes({"user"})
public class UserController {

    User user = new User();

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/signin",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ModelAndView loginUser(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password, ModelMap modelMap){
        Map<String, Object> map = new HashMap<>();
        int result = 0;
        String viewName;
        try {
            user = userService.loginUser(account, password);
        } catch (Exception e) {
            System.out.println("调用用户登录服务异常------");
            e.printStackTrace();
        }
        if (user == null) {
            result = -1;
            viewName = "/signin/signinError";
        }else {
            result = 1;
            viewName = "index";
            user.setUiPassword("");
            modelMap.addAttribute("user",user);
        }

        map.put("result",result);

        ModelAndView mv = new ModelAndView(viewName,map);
        return mv;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ModelAndView logoutUser(@ModelAttribute("user") User user, SessionStatus sessionStatus){
        /**
         * @ModelAttribute("User") 相当于将session中名为"User"的对象注入user对象中
         * sessionStatus中的setComplete方法可以将session中的内容全部清空
         */
        sessionStatus.setComplete();
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

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
