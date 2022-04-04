package com.soumya.ecommerce.repository.user_repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soumya.ecommerce.entities.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private EntityManager em;
	
	@Override
	public User userLogin(User user) {
		
		User myUser = null;

		TypedQuery<User> typedQuery = em.createQuery("SELECT user from User user WHERE "
															+ "user.userName = :uname AND user.passWord = :pass", User.class);
		
		typedQuery.setParameter("uname", user.getUserName());
		typedQuery.setParameter("pass", user.getPassWord());
		
		try {
			myUser = typedQuery.getSingleResult();
		}
		catch(Exception ex) {
			
		}
		return myUser;
	}

	@Override
	public User getUserById(Long userId) {
		
		return em.find(User.class,userId);
	}

	@Override
	@Transactional
	public User saveUser(User user) {
		
		if(user.getUserId()!=null) {
			em.merge(user);
			return user;
		}
		em.persist(user);
		return user;
	}

	@Override
	public List<User> getAllRegisteredUsers() {
		return em.createQuery("SELECT user FROM User user", User.class).getResultList();
	}

	@Override
	public List<Object[]> getAllPurchaseDetails() {
		
		return em.createQuery("SELECT user.userId,user.userName,product.productId,product.productName,product.productPrice,product.dateOfPurchase"
				              + "   FROM User user JOIN user.products product").getResultList();
	}
	
	
	
	

}
