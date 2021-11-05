package com.rabilmiraliyev.test.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.City;
import com.rabilmiraliyev.test.model.Ishciler;
import com.rabilmiraliyev.test.service.CityService;

@Controller
public class TestNewCityController {
	@Autowired
	private CityService cityService;
	
	
	@RequestMapping(value = "/city/new",method = RequestMethod.GET)
	public String newCity(City city) {
		
		return "newCity";
	}
	@ModelAttribute
	public City initModel() {
		return new City();
	}
	@RequestMapping(value = "/city/new",method = RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute @Valid City city , RedirectAttributes redirectAttributes, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "newCity";
		}
			
		cityService.createCity(city);
		redirectAttributes.addFlashAttribute("message", "City created by id:"+ city.getId());
		return "redirect:/city";
	}
}
