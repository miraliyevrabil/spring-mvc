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

import com.rabilmiraliyev.test.model.Computers;
import com.rabilmiraliyev.test.service.ComputersService;

@Controller
public class TestEditComputersController {
	@Autowired
	private ComputersService computersService;
	
	@RequestMapping(value = "/computers/update/{id}",method = RequestMethod.GET)
	public String loadComputers(@PathVariable Long id,ModelMap modelMap) {
		Computers computers = computersService.findComputers(id);
		modelMap.put("computers",computers);
		return "editComputers";
	}
	@RequestMapping(value = "/computers/update/{id}",method = RequestMethod.POST)
	public String hadleFormSubmit(@ModelAttribute @Valid Computers computers, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			
			return "editComputers";
		}
		
		computersService.update(computers);
		redirectAttributes.addFlashAttribute("message", "Computers updated by id:"+ computers.getId());
		return "redirect:/computers";
	}
	
}
