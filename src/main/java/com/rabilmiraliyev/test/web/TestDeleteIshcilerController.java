package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Ishciler;
import com.rabilmiraliyev.test.service.TestService;

@Controller
public class TestDeleteIshcilerController {
		
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/ishciler/delete/{id}", method = RequestMethod.GET)
	public String loadIshciler(@PathVariable Long id, ModelMap modelMap) {
		Ishciler ishciler = testService.findIshciler(id);
		modelMap.put("ishciler", ishciler);
		return "deleteIshciler";
		
	}
	
	@RequestMapping(value = "/ishciler/delete/{id}", method = RequestMethod.POST)
	public String handleForSubmit(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		testService.deleteIshciler(id);
		redirectAttributes.addFlashAttribute("message", "İd-si" +id+" olan İşçi silindi!");
		return "redirect:/ishciler";
		
	}
	
	
	
}
