package com.sssolutions.sgn.repository.imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sssolutions.sgn.dao.User;
import com.sssolutions.sgn.repository.ILoginRepository;



@Repository
public class LoginRepository implements ILoginRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User validateLogin(String user, String password) {

		User userDao;
		try {
		userDao = this.jdbcTemplate.queryForObject(
		        "SELECT nombre_usuario AS username, contrasena_usuario AS password FROM USUARIOS WHERE nombre_usuario = ? and contrasena_usuario = ?",
		        new Object[]{user,password},
		        new RowMapper<User>() {
		            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	User actor = new User();
		                actor.setUser(rs.getString("username"));
		                actor.setPassword(rs.getString("password"));
		                return actor;
		            }
		        });
		}catch(Exception e) {
			userDao = new User();
		}

		return userDao;
	}

	

	// thanks Java 8, look the custom RowMapper
//	@Override
//	public List<User> findAll() {
//
////		List<User> result = jdbcTemplate.query(
////				"SELECT nombre_usuario, contrasena_usuario FROM USUARIOS",
////				(rs, rowNum) -> new User(rs.getString("nombre_usuario"), rs.getString("contrasena_usuario")));
//
////		for (User user : result) {
////			System.out.println(user.getUser());
////			System.out.println(user.getPassword());
////		}
//		
//		return result;
//
//	}

}
