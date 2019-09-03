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
 * search for the day
 * @author drewLiang
 * @Date 2019/8/26 21:43
 */
@RestController
@RequestMapping("/transDay")
public class TransForDayController {

    @Resource
    private TransForDayMapper transForDayMapper;

    /**
     * get view
     * @return html's name
     */
    @GetMapping("/show")
    public ModelAndView show(){
        return Tools.getModelAndView("transDay/transDayList");
    }

    /**
     * list of transaction
     * @return layUi's map
     */
    public Map<String,Object> selectTransForDay(){
        Map<String,Object> map = new HashMap<>();
        return map;
    }

}
