package com.rabilmiraliyev.test.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class IndexController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ModelAndView error(HttpServletRequest request) {
    	ModelAndView mav =new ModelAndView();
    	mav.addObject("error", getErrorPath());
   // 	mav.setViewName("error");
    	Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    	Integer statusCode = Integer.valueOf(status.toString());
    	if(statusCode == HttpStatus.NOT_FOUND.value()) {
    		mav.setViewName("error-404");
    		 return mav;
    		}
    		else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
    			mav.setViewName("error-500");
    			return mav;
    		}
    		else if(statusCode==HttpStatus.FORBIDDEN.value()) {
    			mav.setViewName("error-403");
    			return mav;
    		}
    	
    		else {
    		   mav.setViewName("error");
    		  return mav;
    		}
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
