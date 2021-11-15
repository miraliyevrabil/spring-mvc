package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Computers;
import com.rabilmiraliyev.test.service.ComputersService;

@Controller
public class TestDeleteComputersController {

	@Autowired
	private ComputersService computersService;

	@RequestMapping(value = "/computers/delete/{id}", method = RequestMethod.GET)
	public String loadComputers(@PathVariable Long id, ModelMap modelMap) {
		Computers computers = computersService.findComputers(id);
		modelMap.put("computers", computers);
		return "deleteComputers";
		
	}
	
	@RequestMapping(value = "/computers/delete/{id}", method = RequestMethod.POST)
	public String handleForSubmit(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		computersService.deleteComputers(id);
		redirectAttributes.addFlashAttribute("message", "Computer deleted by id :"+id);
		return "redirect:/computers";
		
	}
}

