package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rabilmiraliyev.test.service.CityService;

@Controller
public class CityController {

	@Autowired
	private CityService cityService;
	

	@RequestMapping("/city")
	public ModelAndView getCity() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("city", cityService.findCity());
		mav.setViewName("city");
		return mav;
		
	}
	
}
