package com.sssolutions.sgn.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sssolutions.sgn.dao.User;
import com.sssolutions.sgn.repository.imp.LoginRepository;
import com.sssolutions.sgn.service.ILoginService;

@Service
public class LoginService implements ILoginService{


	@Autowired
	LoginRepository loginRepository;

	@Override
	public User validateLogin(String user, String password) {

		User userDao;

		userDao = loginRepository.validateLogin(user, password);

		return userDao;
	}

}
