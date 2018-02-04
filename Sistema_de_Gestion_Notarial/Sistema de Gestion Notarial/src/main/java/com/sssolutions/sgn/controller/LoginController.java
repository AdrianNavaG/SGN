package com.sssolutions.sgn.controller;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

	//	@Autowired
	//	private Environment environment;

	@GetMapping("/login")
	public ModelAndView login() {

		//		System.out.println(environment.getProperty("sgn.query.expediente"));

		ModelAndView login = new ModelAndView("login/login");
		return login;
	}


	@PostMapping("validation")
	public ModelAndView loginValidation(@RequestParam("form-username") String user, @RequestParam("form-password") String password) {

		User userDao ;
		String view = "redirect:/login";

		userDao = loginService.validateLogin(user, password);	


		String today = "";

		if(userDao.getUser() != null) {
			view="sufee-admin-dashboard-master/home";
			Date date = new Date();
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			today = formatter.format(date);
		}

		ModelAndView login = new ModelAndView(view);
		login.addObject("fecha_actual", today);
		

		login.addObject("user", userDao);
		return login;
	}



}
