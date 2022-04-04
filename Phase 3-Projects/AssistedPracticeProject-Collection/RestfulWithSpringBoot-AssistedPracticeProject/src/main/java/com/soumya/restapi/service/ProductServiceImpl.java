package com.soumya.restapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumya.restapi.entity.Product;
import com.soumya.restapi.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product addProduct(Product product) {
		
		productRepository.save(product);
		
		return product;

	}

	@Override
//	@Transactional
	public Product updateProduct(Product product) {
		
		Product oldProduct = this.getProductById(product.getProductId());
		oldProduct.setProductname(product.getProductname());
		oldProduct.setProductPrice(product.getProductPrice());
		System.out.println(oldProduct);
		
		return product;

	}

	@Override
	public Product deleteProductById(Long id) {
		
		Product product = this.getProductById(id);
		
		productRepository.delete(product);
		
		return product;

	}

}
