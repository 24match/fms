package com.drew.fms.util;

import org.springframework.web.servlet.ModelAndView;

/**
 * 工具类
 * @author drewLiang
 * @Date 2019/8/8 22:57
 */
public class Tools {

    /**
     * 返回页面
     * @param viewName 页面名称
     * @return
     */
    public static ModelAndView getModelAndView(String viewName) {
        ModelAndView v = new ModelAndView();
        v.setViewName(viewName);
        return v;
    }

}
