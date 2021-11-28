package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Authorities;
import com.rabilmiraliyev.test.service.AuthoritiesService;
@Controller
public class TestDeleteAuthorityController {
	@Autowired
	private AuthoritiesService authoritiesService;
	

	@RequestMapping(value = "/authorities/delete/{username}", method = RequestMethod.GET)
	public String loadAuthorities(@PathVariable String username, ModelMap modelMap) {
		Authorities authorities = authoritiesService.findAuthorities(username);
		modelMap.put("authorities", authorities);
		return "deleteAuthorities";
		
	}
	
	@RequestMapping(value = "/authorities/delete/{username}", method = RequestMethod.POST)
	public String handleForSubmit(@PathVariable String username, RedirectAttributes redirectAttributes) {
		authoritiesService.deleteAuthorities(username);
		redirectAttributes.addFlashAttribute("message", "Rol silindi!");
		return "redirect:/authorities";
		
	}
}
