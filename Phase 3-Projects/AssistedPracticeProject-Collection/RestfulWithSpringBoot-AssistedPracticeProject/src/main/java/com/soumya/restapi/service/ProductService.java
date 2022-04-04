package com.soumya.restapi.service;

import java.util.List;

import com.soumya.restapi.entity.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	
	Product getProductById(Long id);
	
	Product addProduct(Product product);
	
	Product updateProduct(Product product);
	
	Product deleteProductById(Long id);

}
