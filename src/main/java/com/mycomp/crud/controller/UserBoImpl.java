package com.mycomp.crud.controller;

import java.util.List;

import com.mycomp.crud.model.User;
import com.mycomp.crud.model.UserDao;

public class UserBoImpl implements UserBo {

	private UserDao userDao;
	
	
	public void setUserDao (UserDao userDao){
		this.userDao = userDao;
	}

	public void create(User user) {
		userDao.create(user);		
	}

	public void update(Integer id, User newUser) {
		userDao.update(id, newUser);		
	}

	public void delete(User user) {
		userDao.delete(user);		
	}

	public List<User> showAllUsers() {
		return userDao.showAllUsers();		
	}

	public List<User> searhUser(User user) {		
		return userDao.searhUser(user);
	}		
}
