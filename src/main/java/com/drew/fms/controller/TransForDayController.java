package com.drew.fms.controller;

import com.drew.fms.mapper.TransForDayMapper;
import com.drew.fms.util.Tools;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 日交易查询
 * @author drewLiang
 * @Date 2019/8/26 21:43
 */
@RestController
@RequestMapping("/transDay")
public class TransForDayController {

    @Resource
    private TransForDayMapper transForDayMapper;

    @GetMapping("/show")
    public ModelAndView show(){
        return Tools.getModelAndView("transDay/transDayList");
    }

    //显示页面
    public Map<String,Object> selectTransForDay(){
        Map<String,Object> map = new HashMap<>();

        return map;
    }

}
