package com.recruit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    /**
     * 跳转关于我们页面
     * @return employee/aboutUs.jsp
     */
    @RequestMapping(value = "/toabout", method = RequestMethod.GET)
    public String aboutUs(){
        return "employee/aboutUs";
    }

    /**
     * 跳转校园招聘页面
     * @return employee/campus.jsp
     */
    @RequestMapping(value = "/tocampus", method = RequestMethod.GET)
    public String campus(){
        return "employee/campus";
    }

    /**
     * 跳转社会招聘页面
     * @return employee/society.jsp
     */
    @RequestMapping(value = "/tosociety", method = RequestMethod.GET)
    public String society(){
        return "employee/society";
    }

    /**
     * 跳转招聘会页面
     * @return employee/jobFair.jsp
     */
    @RequestMapping(value = "/tojobfair", method = RequestMethod.GET)
    public String jobFair(){
        return "employee/jobFair";
    }

}
