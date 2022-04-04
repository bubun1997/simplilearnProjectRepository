package com.soumya.ecommerce.repository.user_repository;

import java.util.List;

import com.soumya.ecommerce.entities.User;

public interface UserRepository {

   User userLogin(User user);
   
   User getUserById(Long userId);
   
   User saveUser(User user);
   
   List<User> getAllRegisteredUsers();
   
   List<Object[]> getAllPurchaseDetails();
}
