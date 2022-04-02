package com.soumya.ecommerce.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue
	private Long productId;
	
	@Column(name = "pname",length = 255,nullable = false)
	private String productName;
	
	private double productPrice;
	
//	@CreationTimestamp
	private Timestamp dateOfPurchase;
	
	@ManyToMany(mappedBy = "products")
	private List<User> users = new ArrayList<>();

	public Product() {
		super();
	}

	public Product(Long productId, String productName, double productPrice, Timestamp dateOfPurchase) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.dateOfPurchase = dateOfPurchase;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Timestamp getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Timestamp dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", dateOfPurchase=" + dateOfPurchase + ", users=" + users + "]";
	}
	
	

}
