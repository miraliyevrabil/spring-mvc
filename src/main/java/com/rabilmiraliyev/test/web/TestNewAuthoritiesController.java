package com.rabilmiraliyev.test.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Authorities;
import com.rabilmiraliyev.test.service.AuthoritiesService;

@Controller
public class TestNewAuthoritiesController {
	@Autowired
	private AuthoritiesService authoritiesService;
	@RequestMapping(value = "/authorities/new",method = RequestMethod.GET)
	public String newAuthorities(Authorities authorities) {
		
		return "newAuthorities";
	}
	@ModelAttribute
	public Authorities initModel() {
		return new Authorities();
}
	@RequestMapping(value = "/authorities/new",method = RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute @Valid Authorities authorities , RedirectAttributes redirectAttributes, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "newAuthorities";
		}
		authoritiesService.createAuthorities(authorities);;
		redirectAttributes.addFlashAttribute("message", "Authority created by username :"+ authorities.getUsername());
		return "redirect:/authorities";
}

}
