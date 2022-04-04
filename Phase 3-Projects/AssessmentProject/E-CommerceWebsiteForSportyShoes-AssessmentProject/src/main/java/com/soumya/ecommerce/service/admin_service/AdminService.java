package com.soumya.ecommerce.service.admin_service;

import com.soumya.ecommerce.entities.Admin;
import com.soumya.ecommerce.entities.Product;

public interface AdminService {
	
	Admin getAdmin(Admin admin);
	
	Product addProduct(Product product);
	
	void updateAdmin(Admin admin);


}
