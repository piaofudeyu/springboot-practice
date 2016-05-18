/**
 * Project Name:demo
 * Package Name:com.example.controller
 * Date: 2016-05-18 14:19
 * Copyright (c) 2015,  www.miaozhen All Rights Reserved.
 */
package cn.stackbox.practise.controller;

import cn.stackbox.practise.common.ResultModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: HomeController <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-05-18 14:19
 *
 * @author SRK.Lyu (lvsijia@miaozhen.com)
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "/home";
    }




    @RequestMapping("/test/json")
    @ResponseBody
    public ResultModel testJSON() {
        return ResultModel.SUCCESS(null);
    }



}
