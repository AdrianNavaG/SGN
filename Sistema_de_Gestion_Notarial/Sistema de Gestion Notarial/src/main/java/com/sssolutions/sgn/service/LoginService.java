package com.sssolutions.sgn.service;

import org.springframework.stereotype.Service;

import com.sssolutions.sgn.dao.User;

@Service
public class LoginService {

	public User validation(String user, String password) {
		
		User userDao = new User();
		userDao.setUser(user);
		userDao.setPassword(password);
		//llamar la funcion de la consulta

		return userDao;
	}
	
}
