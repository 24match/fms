package com.drew.fms.controller;

import com.drew.fms.util.Tools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页 controller
 * @author drewLiang
 * @Date 2019/8/4 13:41
 */
@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {

    @GetMapping("/show")
    public ModelAndView show(){
        log.info("===========================进入首页=================");
        return Tools.getModelAndView("index");
    }

    @GetMapping("/test")
    public ModelAndView test() {
        log.info("=========================进入测试页面===============");
        return Tools.getModelAndView("layuiTest");
    }

}
