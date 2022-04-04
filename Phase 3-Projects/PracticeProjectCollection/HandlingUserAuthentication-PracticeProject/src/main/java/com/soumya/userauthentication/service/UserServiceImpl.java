package com.soumya.userauthentication.service;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumya.userauthentication.entity.User;
import com.soumya.userauthentication.userrepository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User authenticateUser(User user) {
		return userRepository.authenticateUser(user);
	}

}
