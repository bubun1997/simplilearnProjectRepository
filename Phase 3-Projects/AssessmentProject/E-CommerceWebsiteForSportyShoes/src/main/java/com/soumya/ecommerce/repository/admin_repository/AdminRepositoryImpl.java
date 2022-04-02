package com.soumya.ecommerce.repository.admin_repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soumya.ecommerce.entities.Admin;
import com.soumya.ecommerce.entities.Product;

@Repository
public class AdminRepositoryImpl implements AdminRepository {

	@Autowired
	EntityManager em;
	
	@Override
	public Admin getAdmin(Admin admin) {
		
		Admin myAdmin = null;
	    TypedQuery<Admin> typedQuery = em.createQuery("SELECT admin from Admin admin WHERE"
	    		                                      + " admin.userName = :uname AND admin.password = :pass", Admin.class);
	    
	    typedQuery.setParameter("uname",admin.getUserName());
	    typedQuery.setParameter("pass", admin.getPassword());
	    
	    try {
	              myAdmin = typedQuery.getSingleResult();
	    }
	    catch(Exception ex) {}
	    return myAdmin;
	}
	
	

	public Admin getAdminById(Long id) {
		return em.find(Admin.class, id);
	}

	@Override
	@Transactional
	public void updateAdmin(Admin admin) {
	
		Admin myAdmin = this.getAdminById(1000L);
		myAdmin.setUserName(admin.getUserName());
		myAdmin.setPassword(admin.getPassword());
		
	}



	@Override
	public Product addProduct(Product product) {
		 em.persist(product);
		 return product;
	}
	
	

}
