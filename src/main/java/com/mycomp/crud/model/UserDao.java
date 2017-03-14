package com.mycomp.crud.model;

import java.util.List;

import com.mycomp.crud.model.User;

public interface UserDao {
	void create (User user);
	void update (Integer id, User newUser);
	void delete (User user);
	List<User> showAllUsers();
	List<User> searhUser(User user);
}
