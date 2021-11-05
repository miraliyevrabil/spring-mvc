package com.rabilmiraliyev.test.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.City;
import com.rabilmiraliyev.test.model.Ishciler;
import com.rabilmiraliyev.test.service.CityService;
import com.rabilmiraliyev.test.service.TestService;

@Controller
public class TestNewIshcilerController {
	@Autowired
	private TestService testService;
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value = "/ishciler/new",method = RequestMethod.GET)
	public ModelAndView newIshciler(Ishciler ishciler) {
		// city nin modelini yaradiriq ve ishciler new cagirilanda onuda yukleyirik
		ModelAndView mav = new ModelAndView();
		mav.addObject("city", cityService.findCity());
		mav.setViewName("newIshciler");
		return mav;
	}
	@ModelAttribute
	public Ishciler initModel() {
		return new Ishciler();
	}
	
	@RequestMapping(value = "/ishciler/new",method = RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute @Valid Ishciler ishciler, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return "newIshciler";
		}
		testService.createIshciler(ishciler);
		redirectAttributes.addFlashAttribute("message", "Ishci created by id:"+ishciler.getId());
		return "redirect:/ishciler";
	}
}
