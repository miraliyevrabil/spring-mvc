package com.rabilmiraliyev.test.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Users;
import com.rabilmiraliyev.test.service.UsersService;

@Controller
public class TestNewUsersController {
	@Autowired
	private UsersService userService;
	@RequestMapping(value = "/users/new",method = RequestMethod.GET)
	public String newUsers(Users users) {
		
		return "newUsers";
	}
	@ModelAttribute
	public Users initModel() {
		return new Users();
}
	@RequestMapping(value = "/users/new",method = RequestMethod.POST)
	public String handleFormSubmit(@ModelAttribute @Valid Users users , RedirectAttributes redirectAttributes, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "newUsers";
		}
		userService.createUsers(users);;
		redirectAttributes.addFlashAttribute("message", "Users created by id :"+ users.getId());
		return "redirect:/users";
}
}