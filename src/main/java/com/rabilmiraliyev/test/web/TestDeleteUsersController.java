package com.rabilmiraliyev.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rabilmiraliyev.test.model.Users;
import com.rabilmiraliyev.test.service.UsersService;
@Controller
public class TestDeleteUsersController {
	@Autowired
	private UsersService usersService;
	

	@RequestMapping(value = "/users/delete/{id}", method = RequestMethod.GET)
	public String loadUsers(@PathVariable Long id, ModelMap modelMap) {
		Users users = usersService.finUsers(id);
		modelMap.put("users", users);
		return "deleteUsers";
		
	}
	
	@RequestMapping(value = "/users/delete/{id}", method = RequestMethod.POST)
	public String handleForSubmit(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		usersService.deleteUsers(id);
		redirectAttributes.addFlashAttribute("message", "Users deleted by id :"+id);
		return "redirect:/users";
		
	}

}
