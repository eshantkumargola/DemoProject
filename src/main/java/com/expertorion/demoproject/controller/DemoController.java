package com.expertorion.demoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.expertorion.demoproject.dao.User;
import com.expertorion.demoproject.service.LoginService;

@Controller
public class DemoController {
	
	@Autowired
	private LoginService loginService;
		
	@RequestMapping("/")
	public String welcome(ModelMap model) {
		return "index" ;
	}
	
	@RequestMapping("login")
	public String login(ModelMap model) {
		return "login" ;
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)	
	public String gotoWelcomePage(
		@RequestParam String username, @RequestParam String password, ModelMap model ) {
		
		User inputUser=loginService.validateUser(username, password);
		
		if (inputUser == null) {
			model.put("errorMessage"," Invalid Credentials . Please try again ");
			return "login";
		}
		else 
		{
			model.put("username",username);
			model.put("userid",Long.valueOf(inputUser.getId()));
			return "welcome";
		}
	}
	
}
