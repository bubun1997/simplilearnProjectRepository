package com.soumya.springsecurity.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.soumya.springsecurity.entities.User;
import com.soumya.springsecurity.repository.UsersRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UsersRepository userRepo;
		public User GetUserByName(String name) {
			Optional<User> user = userRepo.findUserByName(name);
			return user.get();
		}
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			return null;
		}
}
