package com.drew.fms.controller;

import com.drew.fms.entity.Fms_user;
import com.drew.fms.mapper.UserMapper;
import com.drew.fms.util.Tools;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 注册新用户
 * @author drewLiang
 * @Date 2019/8/8 22:28
 */
@RestController
@RequestMapping("/")
public class RegisteredController {

    @Resource
    private UserMapper userMapper;

    //页面跳转
    @GetMapping("/registered")
    public ModelAndView show(){
        return Tools.getModelAndView("registered");
    }

    //插入
    /*@PostMapping("/insertUser")
    public void insertUser(Fms_user user){
        userMapper.insert(user);
    }*/
}
