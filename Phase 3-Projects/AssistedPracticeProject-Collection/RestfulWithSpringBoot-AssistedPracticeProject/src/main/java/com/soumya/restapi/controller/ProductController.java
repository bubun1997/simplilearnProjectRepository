package com.soumya.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.restapi.entity.Product;
import com.soumya.restapi.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/get/all/products")
	public List<Product> getAllProducts(){
		
		return productService.getAllProducts();
		
	}
	
	@GetMapping("get/product/byid/{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		
		return productService.getProductById(id);
	}

	@PostMapping("add/product")
	public Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
	}
	
	@PutMapping("/update/product")
	public Product updateProduct(@RequestBody Product product) {
		
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("delete/product/byid/{id}")
	public Product deleteProductById(@PathVariable("id") Long id) {
		
		return productService.deleteProductById(id);
	}
}

