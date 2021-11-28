package com.rabilmiraliyev.test.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.City;
import com.rabilmiraliyev.test.service.CityService;

@Controller
public class TestEditCityController {

	@Autowired
	private CityService cityService;
	@RequestMapping(value = "/city/update/{id}",method = RequestMethod.GET)
	public String loadCity(@PathVariable Long id,ModelMap modelMap) {
		City city = cityService.findCity(id);
		modelMap.put("city",city);
		return "editCity";
	}
	@RequestMapping(value = "/city/update/{id}",method = RequestMethod.POST)
	public String hadleFormSubmit(@ModelAttribute @Valid City city, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			
			return "editCity";
		}
		cityService.update(city);
		redirectAttributes.addFlashAttribute("message", "İd-si "+city.getId()+" olan Şəhər yeniləndi!" );
		return "redirect:/city";
	}
	
}
