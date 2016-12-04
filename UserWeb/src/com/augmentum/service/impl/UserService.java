package com.augmentum.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.augmentum.dao.IUserDao;
import com.augmentum.model.User;
import com.augmentum.service.IUserService;

@Service
public class UserService implements IUserService {

	@Resource
	private IUserDao userDao;
	
	@Override
	public boolean saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public boolean removeUser(String id) {
		return userDao.removeUser(id);
	}

}
