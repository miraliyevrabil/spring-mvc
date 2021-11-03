package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rabilmiraliyev.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping("/ishciler")
	public ModelAndView getishciler() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ishciler", testService.findIshciler());
		mav.setViewName("ishciler");
		return mav;
		
	}
	
	
	
	@RequestMapping("/test")
	@ResponseBody
	public String welcome() {
		return "Welcome to Test";
	}

}
