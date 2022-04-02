package com.soumya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soumya.dao.UserDao;
import com.soumya.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		 userDao.addUser(user);
	}
	
	
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	public User getUser(Long id) {
		User user = userDao.getUser(id);
		if(user!=null) {
			return user;
		}
		return null;
	}

}
