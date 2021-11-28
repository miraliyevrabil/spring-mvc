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

import com.rabilmiraliyev.test.model.Authorities;
import com.rabilmiraliyev.test.service.AuthoritiesService;
@Controller
@RequestMapping("/authorities")
public class TestEditAuthoritiesController {
	@Autowired
	private AuthoritiesService authoritiesService;
	
	@RequestMapping(value = "/update/{username}",method = RequestMethod.GET)
	public String loadAuthorities(@PathVariable String username,ModelMap modelMap) {
		Authorities authorities = authoritiesService.findAuthorities(username);
		modelMap.put("authorities",authorities);
		return "editAuthorities";
	}
	@RequestMapping(value = "/update/{username}",method = RequestMethod.POST)
	public String hadleFormSubmit(@ModelAttribute @Valid Authorities authorities, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			
			return "editAuthorities";
		}
		authoritiesService.updateAuthorities(authorities);
		redirectAttributes.addFlashAttribute("message", "İstifadəçi adı "+authorities.getUsername()+" olan Rol yeniləndi!");
		return "redirect:/authorities";
	}
}
