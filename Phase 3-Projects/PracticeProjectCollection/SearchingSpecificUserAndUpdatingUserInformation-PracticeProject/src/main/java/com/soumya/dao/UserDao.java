package com.soumya.dao;

import com.soumya.model.User;

public interface UserDao{
	
    void updateUser(User user);
    void addUser(User user);
	User getUser(Long id);
	
	
}