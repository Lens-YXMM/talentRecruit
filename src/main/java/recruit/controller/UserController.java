package recruit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import recruit.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ModelAndView loginUser(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password){
        Map<String, Object> map = new HashMap<>();
        int result = 0;
        try {
            result = userService.loginUser(account, password);
        } catch (Exception e) {
            System.out.println("调用用户登录服务异常------");
            e.printStackTrace();
        }
        if (result <= 0) {
            result = 0;
        }

        map.put("result",result);

        ModelAndView mv  = new ModelAndView("index",map);
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
