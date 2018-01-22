package com.sssolutions.sgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@GetMapping("/")
	public ModelAndView login1() {
		ModelAndView login = new ModelAndView("login/login");
		return login;
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView login = new ModelAndView("login/login");
		return login;
	}
	
	
	@PostMapping("/login/validation")
	public ModelAndView loginValidation(@RequestParam("form-username") String user, @RequestParam("form-password") String password) {
		
		System.out.println(user);
		System.out.println(password);

		ModelAndView login = new ModelAndView("login/inicio");
		login.addObject("user", user);
		return login;
	}
	
	

}
