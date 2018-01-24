package com.sssolutions.sgn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sssolutions.sgn.dao.User;
import com.sssolutions.sgn.service.ILoginService;


@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	ILoginService loginService;
	
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
		
		User userDao ;
		String view = "redirect:/login";
		
		userDao = loginService.validateLogin(user, password);	
		
		if(userDao.getValidate())
			view="login/inicio";
	
		ModelAndView login = new ModelAndView(view);
		
		login.addObject("user", userDao);
		return login;
	}
	
	

}
