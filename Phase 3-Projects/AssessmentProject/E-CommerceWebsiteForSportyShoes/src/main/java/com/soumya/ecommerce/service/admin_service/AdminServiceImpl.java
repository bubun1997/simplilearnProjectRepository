package com.soumya.ecommerce.service.admin_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumya.ecommerce.entities.Admin;
import com.soumya.ecommerce.entities.Product;
import com.soumya.ecommerce.repository.admin_repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Admin getAdmin(Admin admin) {
		return adminRepository.getAdmin(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		 adminRepository.updateAdmin(admin);
	}

	@Override
	public Product addProduct(Product product) {
		return adminRepository.addProduct(product);
	}
	
	
	
	

}
