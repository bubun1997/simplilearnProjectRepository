package com.soumya.selenium.entity;

public class Employee {
	
	
  private String employeeName;
  
  private String employeeEmail;
  
  private String employeePassword;
  
  private String employeePhoneNumber;
  
  private String employeeDesignation;

public Employee(String employeeName, String employeeEmail, String employeePassword, String employeePhoneNumber,
		String employeeDesignation) {
	super();
	this.employeeName = employeeName;
	this.employeeEmail = employeeEmail;
	this.employeePassword = employeePassword;
	this.employeePhoneNumber = employeePhoneNumber;
	this.employeeDesignation = employeeDesignation;
}

public String getEmployeeName() {
	return employeeName;
}

public String getEmployeeEmail() {
	return employeeEmail;
}

public String getEmployeePassword() {
	return employeePassword;
}

public String getEmployeePhoneNumber() {
	return employeePhoneNumber;
}

public String getEmployeeDesignation() {
	return employeeDesignation;
}

@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeEmail=" + employeeEmail + ", employeePassword="
			+ employeePassword + ", employeePhoneNumber=" + employeePhoneNumber + ", employeeDesignation="
			+ employeeDesignation + "]";
}
  
  

	

}
