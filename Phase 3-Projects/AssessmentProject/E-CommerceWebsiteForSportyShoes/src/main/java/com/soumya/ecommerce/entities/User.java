package com.soumya.ecommerce.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private Long userId;
	
	@Column(name="uname",nullable=false,length = 255)
	@NotBlank
	private String userName;
	
	@Column(name="password",nullable=false,length = 255)
	@NotBlank
	private String passWord;
	
	@ManyToMany
	private List<Product> products = new ArrayList<>();

	public User() {
		super();
	}

	public User(Long userId, String userName, String passWord) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", products=" + products
				+ "]";
	}

	
	

}
