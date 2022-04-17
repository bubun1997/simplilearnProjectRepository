package com.soumya.selenium.automate;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.soumya.selenium.entity.Employee;

public class AutomateLogin {

	
	public static void employeeLogin(Employee emp,WebDriver driver) {
		
		driver.get("https://accounts.lambdatest.com/login/");

		WebElement emailEntry = driver.findElement(By.cssSelector("#email"));
		
		emailEntry.sendKeys(emp.getEmployeeEmail());
		
		WebElement passwordEntry = driver.findElement(By.cssSelector("#password"));
		
		passwordEntry.sendKeys(emp.getEmployeePassword());
		
		WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
		
		loginButton.click();
		
		System.out.println("Successfully Logged in....");
		
		driver.close();
		
		
		
	}

}
