package com.sssolutions.sgn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sssolutions.sgn.dao.User;
import com.sssolutions.sgn.service.LoginService;


@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
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
		
		User userDao = new User();

		ModelAndView login = new ModelAndView("login/inicio");
		
		userDao = loginService.validation(user, password);		
		
		login.addObject("user", userDao);
		return login;
	}
	
	

}
