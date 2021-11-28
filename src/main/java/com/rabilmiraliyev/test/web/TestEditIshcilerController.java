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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Ishciler;
import com.rabilmiraliyev.test.service.CityService;
import com.rabilmiraliyev.test.service.TestService;

@Controller
public class TestEditIshcilerController {
	@Autowired
	private TestService testService;
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value = "/ishciler/update/{id}",method = RequestMethod.GET)
	public ModelAndView loadIShciler(@PathVariable Long id,ModelMap modelMap,Ishciler ishciler) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("city", cityService.findCity());
		mav.setViewName("editIshciler");
		ishciler = testService.findIshciler(id);
		modelMap.put("ishciler",ishciler);
		return mav;
	}
	
	@RequestMapping(value = "/ishciler/update/{id}",method = RequestMethod.POST)
	public String hadleFormSubmit(@ModelAttribute @Valid Ishciler ishciler, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			
			return "editIshciler";
		}
		testService.update(ishciler);
		redirectAttributes.addFlashAttribute("message", "İd-si "+ ishciler.getId()+ "olan İşçi yeniləndi!");
		return "redirect:/ishciler";
	}
}
