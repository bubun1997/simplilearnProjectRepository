package com.soumya.ecommerce.service.product_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumya.ecommerce.entities.Product;
import com.soumya.ecommerce.repository.product_repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(Long productId) {
		return productRepository.getProductById(productId);
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.saveProduct(product);
	}
	
	
   
}
