package com.soumya.ecommerce.repository.product_repository;

import java.util.List;

import com.soumya.ecommerce.entities.Product;

public interface ProductRepository {
	
	List<Product> getAllProducts();
	
	Product getProductById(Long productId);
	
	Product saveProduct(Product product);

}
