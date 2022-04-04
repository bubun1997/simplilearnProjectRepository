package com.soumya.userauthentication.userrepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soumya.userauthentication.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private EntityManager em;
	
	@Override
	public User authenticateUser(User user) {
		
		User myuser = null;
		TypedQuery<User> typedQuery = em.createQuery("SELECT user FROM User user"
									+ " WHERE lower ( user.userName ) = :uname AND user.password = :pass ", User.class);
		
		typedQuery.setParameter("uname", user.getUserName());
		typedQuery.setParameter("pass", user.getPassword());
		
		try {
	     myuser = typedQuery.getSingleResult();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return myuser;
	}

}
