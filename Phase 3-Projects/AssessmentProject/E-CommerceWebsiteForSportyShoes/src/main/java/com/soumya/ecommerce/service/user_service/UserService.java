package com.soumya.ecommerce.service.user_service;

import java.util.List;

import com.soumya.ecommerce.entities.User;

public interface UserService {

	User userLogin(User user);
	
	User getUserById(Long userId);
	
	User saveUser(User user);
	
	List<User> getAllRegisteredUsers();
	
	List<Object[]> getAllPurchaseDetails();
}
