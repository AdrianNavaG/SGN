package com.sssolutions.sgn.repository.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sssolutions.sgn.dao.User;
import com.sssolutions.sgn.repository.ILoginRepository;



@Repository
public class LoginRepository implements ILoginRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User validateLogin(String user, String password) {
		

		User result = (User) jdbcTemplate.query(
				"SELECT nombre_usuario, contrasena_usuario FROM USUARIOS where nombre_usuario = '"+user+"' and contrasena_usuario = '"+password+"'",
				(rs, rowNum) -> new User(rs.getString("nombre_usuario"), rs.getString("contrasena_usuario")));

		return result;
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
