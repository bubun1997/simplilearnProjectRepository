package com.soumya.userauthentication.service;

import com.soumya.userauthentication.entity.User;

public interface UserService {
	
	User authenticateUser(User user);

}
