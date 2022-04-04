package com.soumya.userauthentication.userrepository;

import com.soumya.userauthentication.entity.User;

public interface UserRepository {
	
	User authenticateUser(User user);

}
