package com.soumya.ecommerce.service.product_service;

import java.util.List;

import com.soumya.ecommerce.entities.Product;

public interface ProductService {
     
	List<Product> getAllProducts();
	
	Product getProductById(Long productId);
	
	Product saveProduct(Product product);
}
