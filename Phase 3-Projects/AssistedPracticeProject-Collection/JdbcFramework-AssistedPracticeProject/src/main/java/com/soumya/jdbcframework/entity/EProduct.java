package com.soumya.jdbcframework.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "products")
public class EProduct {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long productId;
	
	@Column(name = "pname" , nullable = false , length = 255)
	private String productName;
	
	@Column(name = "price" , nullable = false)
	private double productPrice;
	
	@CreationTimestamp
	@Column(name = "dateadded")
	private Timestamp dateAdded;

	public EProduct(Long productId, String productName, double productPrice, Timestamp dateAdded) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.dateAdded = dateAdded;
	}

	public EProduct() {
		super();
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

	public Timestamp getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Timestamp dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public String toString() {
		return "EProduct [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", dateAdded=" + dateAdded + "]";
	}
	
	
	

}
