package com.rabilmiraliyev.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SqlController {
	
	
	
	@RequestMapping("/sql")
	public String getSql() {
		return "sql";
	}

}
