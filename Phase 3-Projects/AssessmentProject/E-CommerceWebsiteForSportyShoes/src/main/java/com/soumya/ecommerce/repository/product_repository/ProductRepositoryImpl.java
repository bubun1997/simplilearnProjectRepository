package com.soumya.ecommerce.repository.product_repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soumya.ecommerce.entities.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	private EntityManager em;
	
	@Override
	public List<Product> getAllProducts() {
		
		return em.createQuery("SELECT product FROM Product product", Product.class).getResultList();
	}

	@Override
	public Product getProductById(Long productId) {
		return em.find(Product.class, productId);
	}

	@Override
	@Transactional
	public Product saveProduct(Product product) {
		
		if(product.getProductId()!=null) {
			em.merge(product);
			return product;
		}
		em.persist(product);
		return product;
	}
    
}
