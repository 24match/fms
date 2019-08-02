package com.drew.fms.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试是否可以运行
 * @author drewLiang
 * @Date 2019/8/2 23:19
 */
@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("/helloWorld")
    public String test(){
        return "hello world";
    }

}
