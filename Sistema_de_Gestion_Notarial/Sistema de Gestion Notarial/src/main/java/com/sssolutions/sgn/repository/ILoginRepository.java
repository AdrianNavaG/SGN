package com.sssolutions.sgn.repository;

import com.sssolutions.sgn.dao.User;

public interface ILoginRepository {
	
	/**
	 * @param user
	 * @param password
	 * @return User
	 */
	public User validateLogin(String user, String password);
	
//	/**
//	 * @return User list
//	 */
//	public List<User> findAll();

}
