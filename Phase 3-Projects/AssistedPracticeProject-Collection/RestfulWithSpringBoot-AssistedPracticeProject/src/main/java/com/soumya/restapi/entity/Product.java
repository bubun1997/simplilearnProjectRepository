package com.soumya.restapi.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name = "pid")
	private Long productId;
	
	@Column(nullable = false,length = 255,name = "pname")
	private String productname;
	
	@Column(nullable = false,name = "price")
	private Double productPrice;
	
	@CreationTimestamp
	@Column(name = "dateadded")
	private Timestamp dateAdded;
	
	@UpdateTimestamp
	private Timestamp updateTime;
	

	public Product(String productname, Double productPrice) {
		super();
		this.productname = productname;
		this.productPrice = productPrice;
	}

	public Product() {
		super();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", productPrice=" + productPrice
				+ ", dateAdded=" + dateAdded + "]";
	}
	
	
	
	
	
	
	

}
