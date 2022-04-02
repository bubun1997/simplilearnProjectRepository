package com.soumya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="users")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@NotBlank
	private String userName;
	
	@NotBlank
	private String userAge;
	
	@NotBlank
	private String userGender;
	

	public User(Long userId, @NotBlank String userName, @NotBlank String userAge, @NotBlank @NotBlank String userGender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}


	public User() {
		super();
	}
	
    
	public @NotBlank String getUserGender() {
		return userGender;
	}


	public void setUserGender(@NotBlank String userGender) {
		this.userGender = userGender;
	}


	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
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


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userGender="
				+ userGender + "]";
	}
    
	
	

}
