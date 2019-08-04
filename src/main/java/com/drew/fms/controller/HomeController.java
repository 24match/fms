package com.drew.fms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页 controller
 * @author drewLiang
 * @Date 2019/8/4 13:41
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/show")
    public String show(){
        return "index";
    }

}
