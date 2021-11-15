package com.rabilmiraliyev.test.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class IndexController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ModelAndView error() {
    	ModelAndView mav =new ModelAndView();
    	mav.addObject("error", getErrorPath());
    	mav.setViewName("error");
        return mav;
    }
    @Override
    public String getErrorPath() {
        return PATH;
    }
}
