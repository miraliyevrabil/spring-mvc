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

import com.rabilmiraliyev.test.model.Ishciler;
import com.rabilmiraliyev.test.service.TestService;

@Controller
public class TestEditIshcilerController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/ishciler/update/{id}",method = RequestMethod.GET)
	public String loadIShciler(@PathVariable Long id,ModelMap modelMap) {
		Ishciler ishciler = testService.findIshciler(id);
		modelMap.put("ishciler",ishciler);
		return "editIshciler";
	}
	@RequestMapping(value = "/ishciler/update/{id}",method = RequestMethod.POST)
	public String hadleFormSubmit(@ModelAttribute @Valid Ishciler ishciler, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			
			return "editIshciler";
		}
		testService.update(ishciler);
		redirectAttributes.addFlashAttribute("message", "Ishci updated by id:"+ ishciler.getId());
		return "redirect:/ishciler";
	}
}
