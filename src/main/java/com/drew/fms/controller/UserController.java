package com.drew.fms.controller;

import com.drew.fms.entity.fms_user;
import com.drew.fms.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户管理controller
 * @author drewLiang
 * @Date 2019/8/4 15:50
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/queryUser")
    public List<fms_user> queryUser(){
        try {
            List list = userMapper.selectList(null);
            System.out.println(list);
        } catch (Exception e){
            e.printStackTrace();
        }

        return userMapper.selectList(null);
    }
}
