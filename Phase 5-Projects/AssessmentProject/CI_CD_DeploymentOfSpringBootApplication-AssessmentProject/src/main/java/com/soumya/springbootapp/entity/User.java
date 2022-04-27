package com.soumya.springbootapp.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.lang.NonNull;

public class User {
	
	@NonNull
	private String firstName;
	private String lastName;
	@NonNull
	private int age;
	@NonNull
	private String gender;
	@NonNull
	private String country;
	@NonNull
	private List<String> hobbies = new ArrayList<String>();
	
	public User() {
		super();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", country=" + country + ", hobbies=" + hobbies + "]";
	}

	
	
	
	
	

}
