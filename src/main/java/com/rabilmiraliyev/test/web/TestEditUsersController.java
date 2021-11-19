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

import com.rabilmiraliyev.test.model.Users;
import com.rabilmiraliyev.test.service.UsersService;

@Controller
public class TestEditUsersController {
	@Autowired
	private UsersService usersService;
	@RequestMapping(value = "/users/update/{id}",method = RequestMethod.GET)
	public String loadUsers(@PathVariable Long id,ModelMap modelMap) {
		Users users = usersService.finUsers(id);
		modelMap.put("users",users);
		return "editUsers";
	}
	@RequestMapping(value = "/users/update/{id}",method = RequestMethod.POST)
	public String hadleFormSubmit(@ModelAttribute @Valid Users users, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			
			return "editUsers";
		}
		usersService.updateUsers(users);
		redirectAttributes.addFlashAttribute("message", "User updated by id:"+ users.getId());
		return "redirect:/users";
	}

}
