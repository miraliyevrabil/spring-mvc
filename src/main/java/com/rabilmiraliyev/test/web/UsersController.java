package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rabilmiraliyev.test.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService userService;
	
	
	@RequestMapping("/users")
	public ModelAndView getUsers() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users", userService.findAll());
		mav.setViewName("users");
		return mav;
		
	}
}
