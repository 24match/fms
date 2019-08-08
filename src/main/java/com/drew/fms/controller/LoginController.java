package com.drew.fms.controller;

import com.drew.fms.entity.fms_user;
import com.drew.fms.mapper.UserMapper;
import com.drew.fms.util.Tools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 登陆controller
 * @author drewLiang
 * @Date 2019/8/8 22:21
 */
@RestController
@RequestMapping("/")
public class LoginController {

    @Resource
    private UserMapper userMapper;

    //页面跳转
    @GetMapping("/login")
    public ModelAndView show(){
        return Tools.getModelAndView("login");
    }



}
