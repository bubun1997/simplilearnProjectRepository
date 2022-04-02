package com.soumya.service;

import com.soumya.model.User;

public interface UserService {
	
	void updateUser(User user);
    void addUser(User user);

	User getUser(Long userId);

}
