package com.soumya.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@Column(name = "id")
	private  Long ADMINID;
	
	@Column(name = "uname",nullable = false,length = 255)
	private String userName;
	
	@Column(name = "password",nullable = false,length = 255)
	private String password;

	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public Admin() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [ADMINID=" + ADMINID + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	

}
