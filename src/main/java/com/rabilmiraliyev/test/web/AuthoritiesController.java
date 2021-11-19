package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rabilmiraliyev.test.service.AuthoritiesService;

@Controller
public class AuthoritiesController {
	@Autowired
	private AuthoritiesService authoritiesService;
	@RequestMapping("/authorities")
	public ModelAndView getAuthorities() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities", authoritiesService.findAll());
		mav.setViewName("authorities");
		return mav;
		
	}
}
