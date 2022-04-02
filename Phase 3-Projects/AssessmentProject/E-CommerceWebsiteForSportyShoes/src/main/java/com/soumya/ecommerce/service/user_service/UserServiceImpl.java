package com.soumya.ecommerce.service.user_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumya.ecommerce.entities.User;
import com.soumya.ecommerce.repository.user_repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User userLogin(User user) {
		return userRepository.userLogin(user);
	}

	@Override
	public User getUserById(Long userId) {
		return userRepository.getUserById(userId);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.saveUser(user);
	}

	@Override
	public List<User> getAllRegisteredUsers() {
		return userRepository.getAllRegisteredUsers();
	}

	@Override
	public List<Object[]> getAllPurchaseDetails() {
		return userRepository.getAllPurchaseDetails();
	}
	
	
	
	
      
	   
}
