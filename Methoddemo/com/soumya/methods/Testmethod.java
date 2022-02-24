package com.soumya.methods;

import java.util.Scanner;

class Method
{
	private int value=100;
	public int getCube(int num)
	{
		return num*num*num;
	}
	public void callByValueMethod(int value)
	{
		value=value*10;
	}
	public int getValue()
	{
		return this.value;
	}
}
class Methodoverload
{
	public int addNumbers(int num1,int num2)
	{
		return num1+num2;
	}
	public int addNumbers(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
}
public class Testmethod {

	public static void main(String[] args) {
		
		   Scanner scannerObj = new Scanner(System.in);
		   Method methodObj = new Method();
		   
           System.out.print("Enter a Number : ");
           
           int input = scannerObj.nextInt();
           
           System.out.println("Cube of number "+input+" is : "+methodObj.getCube(input));// calling method getCube() to get cube of the number provided
            
           System.out.println("Before Changing value : "+methodObj.getValue());//100
           
           methodObj.callByValueMethod(200);// call by value
           
           System.out.println("After Changing value : "+methodObj.getValue());//100
           
           // Method overloading example 
           
           Methodoverload methodOverloadObj = new Methodoverload();
           System.out.println("Sum of two numbers is = "+methodOverloadObj.addNumbers(100, 50));
           System.out.println("Sum of three numbers is = "+methodOverloadObj.addNumbers(100, 50,60));

           
           

	}

}
