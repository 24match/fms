package com.drew.fms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.drew.fms.entity.Fms_user;
import com.drew.fms.entity.User;
import com.drew.fms.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    //测试查询所有商户
    /*@GetMapping("/queryUser")
    public List<Fms_user> queryUser(){
        try {
            List list = userMapper.selectList(null);
        } catch (Exception e){
            e.printStackTrace();
        }
        return userMapper.selectList(null);
    }*/

    @GetMapping("/testLayUi")
    public Map<String,Object> testLayUi(Page<User> page, Integer state){
        int code = 0;
        Map<String,Object> map = new HashMap<>();
        List list = (List) userMapper.selectPageVo(page,state);

        map.put("data",list);
        map.put("count",list.size());
        map.put("code",code);
        return map;
    }

}
