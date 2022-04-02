package com.soumya.ecommerce.repository.admin_repository;

import com.soumya.ecommerce.entities.Admin;
import com.soumya.ecommerce.entities.Product;

public interface AdminRepository {
	
	Admin getAdmin(Admin admin);
	
	Product addProduct(Product product);
	
	void updateAdmin(Admin admin);

}
