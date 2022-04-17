package com.soumya.selenium.automate;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import com.soumya.selenium.entity.Employee;

public class AutomateRegistration
{
    public static void main( String[] args ) throws InterruptedException
    {

		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter Full Name : ");
		String fullName = scanner.nextLine();
		
		System.out.print("Enter Email : ");
		String email = scanner.nextLine();
		
		System.out.print("Enter Password : ");
		String password = scanner.nextLine();
		
		System.out.print("Enter Phone Number : ");
		String phone = scanner.nextLine();
		
		System.out.print("Enter Designation/Role  : ");
		String designation = scanner.nextLine();
		
		
		
		
		Employee emp = new Employee(fullName,email,password,phone,designation);
		
		
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://accounts.lambdatest.com/register/");
			
			WebElement nameEntry = driver.findElement(By.id("name"));
			
			nameEntry.sendKeys(emp.getEmployeeName());
			
			WebElement emailEntry = driver.findElement(By.id("email"));
			
			emailEntry.sendKeys(emp.getEmployeeEmail());
			
			WebElement passwordEntry = driver.findElement(By.xpath("//*[@id=\"userpassword\"]"));
			
			passwordEntry.sendKeys(emp.getEmployeePassword());
			
			WebElement phoneNumberEntry = driver.findElement(By.id("phone"));
			
			phoneNumberEntry.sendKeys(emp.getEmployeePhoneNumber());
			
			Select selectDesignation = new Select(driver.findElement(By.cssSelector("#designation")));
			
			selectDesignation.selectByVisibleText(emp.getEmployeeDesignation());
			
			WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[7]/label/samp"));
			
			if(!checkBox.isSelected())
				checkBox.click();
			
			WebElement signUpButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[8]/button"));
			
			signUpButton.click();
			
			System.out.println("You are registered successfully !!");
			
			Thread.sleep(30000);
			
			AutomateLogin.employeeLogin(emp, driver);
			
			
			
			
			
			
			
			
	}
}
