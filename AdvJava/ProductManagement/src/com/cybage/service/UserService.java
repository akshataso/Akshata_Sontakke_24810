package com.cybage.service;

import com.cybage.dao.UserDao;
import com.cybage.model.User;


public class UserService {
	private UserDao userDao;

	public UserService() {
		super();
		userDao = new UserDao();
	}
	
	public User authenticateUser(String name, String password)
	{
		return userDao.authenticateUser(name, password);	
	}
}


