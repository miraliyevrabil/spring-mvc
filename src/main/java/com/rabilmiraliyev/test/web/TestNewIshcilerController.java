package com.rabilmiraliyev.test.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Ishciler;
import com.rabilmiraliyev.test.service.TestService;

@Controller
public class TestNewIshcilerController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/ishciler/new",method = RequestMethod.GET)
	public String newIshciler(Ishciler ishciler) {
		
		return "newIshciler";
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
