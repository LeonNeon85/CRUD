package com.mycomp.crud.controller;

import java.util.List;

import com.mycomp.crud.model.User;

public interface UserBo {
	void create (User user);
	void update (Integer id, User newUser);
	void delete (User user);
	List<User> showAllUsers();
	List<User> searhUser(User user);
}
