package com.rabilmiraliyev.test.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Computers;
import com.rabilmiraliyev.test.service.ComputersService;
import com.rabilmiraliyev.test.service.TestService;

@Controller
public class TestNewComputersController {
	@Autowired
	private ComputersService computersService;
	@Autowired
	private TestService testService;
	
	
	
	@RequestMapping(value = "/computers/new",method = RequestMethod.GET)
	public ModelAndView newCcomputers(Computers computers) {
		ModelAndView mav = new ModelAndView();
		//compseyfesi yuklenende find ishciler yox get id and name gelir
		mav.addObject("ishcileridandname", testService.getIdAndNameCompNew());
		mav.setViewName("newComputers");
		return mav;
		
	}
	@ModelAttribute
	public Computers initModel() {
		return new Computers();
	}
	@RequestMapping(value = "/computers/new",method = RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute @Valid Computers computers , RedirectAttributes redirectAttributes, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "newComputers";
		}
			
		computersService.createComputers(computers);
		redirectAttributes.addFlashAttribute("message", "Computer created by id:"+ computers.getId());
		return "redirect:/computers";
	}
}
