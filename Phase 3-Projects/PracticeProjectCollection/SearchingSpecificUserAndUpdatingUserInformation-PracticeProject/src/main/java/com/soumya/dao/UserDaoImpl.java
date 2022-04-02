package com.soumya.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.soumya.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
    
	@Override
	@Transactional
	public void addUser(User user) {
		 hibernateTemplate.save(user);
	}
	
	@Override
	@Transactional
	public void updateUser(User user) {
		hibernateTemplate.update(user);
	}

	@Override
	public User getUser(Long id) {
		return hibernateTemplate.get(User.class, id);
	}

	
	   
	   
}
