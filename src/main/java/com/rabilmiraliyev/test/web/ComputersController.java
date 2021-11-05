package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rabilmiraliyev.test.service.ComputersService;

@Controller
public class ComputersController {
	
	
	@Autowired
	private ComputersService computersService;
	
	
	@RequestMapping("/computers")
	public ModelAndView getComputers() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("computers", computersService.findComputers());
		mav.setViewName("computers");
		return mav;
	}
}
