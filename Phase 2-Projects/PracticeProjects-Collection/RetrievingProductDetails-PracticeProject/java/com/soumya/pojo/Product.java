package com.soumya.pojo;

import java.sql.Timestamp;

public class Product {
	
	 private int productId;
	   private String productName;
	   private double productPrice;
	   private Timestamp dateOfPurchase;
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
	public Timestamp getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Timestamp dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", dateOfPurchase=" + dateOfPurchase + "]";
	}
	   

}
