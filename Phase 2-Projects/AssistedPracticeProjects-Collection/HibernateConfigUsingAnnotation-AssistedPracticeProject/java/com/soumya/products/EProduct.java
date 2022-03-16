package com.soumya.products;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="products")

public class EProduct {
	
	@Id @GeneratedValue  
	@Column(name="product_id")
	private int productId;
	
	@Column(name="product_name")
	private String productName;
	
	
	
	@Column(name="product_price")
	private double productPrice;
	
	@Column(name="date_added")
    @UpdateTimestamp

    private Timestamp dateAdded;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
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
