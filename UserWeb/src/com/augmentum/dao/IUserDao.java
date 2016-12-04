package com.augmentum.dao;

import java.util.List;

import com.augmentum.model.User;

public interface IUserDao {

	boolean saveUser(User user);
	
	boolean updateUser(User user);
	
	User findById(String id);
	
	List<User> findAll();
	
	boolean removeUser(String id);
	
}
