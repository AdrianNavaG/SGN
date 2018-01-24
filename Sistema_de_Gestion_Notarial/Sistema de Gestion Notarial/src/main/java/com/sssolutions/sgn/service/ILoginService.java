package com.sssolutions.sgn.service;

import com.sssolutions.sgn.dao.User;

public interface ILoginService {

    /**
     * @param user
     * @param password
     * @return User
     */
	public User validateLogin(String user, String password);
	
}
