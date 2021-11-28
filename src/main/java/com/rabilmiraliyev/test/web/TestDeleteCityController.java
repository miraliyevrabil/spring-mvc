package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.City;
import com.rabilmiraliyev.test.service.CityService;

@Controller
public class TestDeleteCityController {
	
	@Autowired
	private CityService cityService;
	

	@RequestMapping(value = "/city/delete/{id}", method = RequestMethod.GET)
	public String loadCity(@PathVariable Long id, ModelMap modelMap) {
		City city = cityService.findCity(id);
		modelMap.put("city", city);
		return "deleteCity";
		
	}
	
	@RequestMapping(value = "/city/delete/{id}", method = RequestMethod.POST)
	public String handleForSubmit(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		cityService.deleteCity(id);
		redirectAttributes.addFlashAttribute("message", "İd-si "+id+ " olan Şəhər silindi!");
		return "redirect:/city";
		
	}
}
