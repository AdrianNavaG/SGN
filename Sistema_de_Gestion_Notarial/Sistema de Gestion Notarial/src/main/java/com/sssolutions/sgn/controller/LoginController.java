package com.sssolutions.sgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/SGN")
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
	
	

}
