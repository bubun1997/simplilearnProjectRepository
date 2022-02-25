package com.soumya.methods;

import java.util.Scanner;

class Method
{
	private int value=100;
	public int getSum(int[] arr)
	{
		int sum=0;
		for(int num:arr)
			sum+=num;
		return sum;
	}
	public void setValue(int value)// call by value method
	{
		value=value;
	}
	public int getValue()
	{
		return this.value;
	}
	public String greet(String name)
	{
		return "Hello ".concat(name);
	}
}
class Methodoverload
{
	public int addNumbers(int num1,int num2)//overloaded method
	{
		return num1+num2;
	}
	public int addNumbers(int num1,int num2,int num3)//overloaded method
	{
		return num1+num2+num3;
	}
}
public class Testmethod {

	public static void main(String[] args) {
		
		   Scanner scannerObj = new Scanner(System.in);
		   Method methodObj = new Method();
		   System.out.print("Enter your Name : ");
		   String name = scannerObj.nextLine();
		   System.out.println(methodObj.greet(name));
		   
		   System.out.print("Enter array size whose sum you want to calculate : ");
		   int arrSize = scannerObj.nextInt();
		   int[] arr = new int[arrSize];
		  
		   for(int i=0;i<arr.length;i+=1)
		   {
			   System.out.print("Enter "+(i+1)+" element : ");
			   int num = scannerObj.nextInt();
			   arr[i]=num;
		   }
		   System.out.println("The sum of your array elements is : "+methodObj.getSum(arr));
		  
		   System.out.println("***Demonstrating call by value***");
		   System.out.println("valueof instance variable of class Method before setting value is : "+methodObj.getValue());//100
		   methodObj.setValue(5000);
		   System.out.println("valueof instance variable of class Method after setting value is : "+methodObj.getValue());//100
		   
		  System.out.println("***Demonstrating overloaded method***");
		  
          Methodoverload mobj = new Methodoverload();
          System.out.println("sum of 2 numbers are : "+mobj.addNumbers(10, 20));//calling overloaded method
          System.out.println("sum of 3 numbers are : "+mobj.addNumbers(10, 20,50));//calling overloaded method


           
           

	}

}
