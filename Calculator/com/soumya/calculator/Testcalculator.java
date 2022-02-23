package com.soumya.calculator;

import java.util.Scanner;

interface Calculator
{
	double addNumbers(double num1,double num2);
	double subtractNumbers(double num1,double num2);
	double multiplyNumbers(double num1,double num2);
	double divideNumbers(double num1,double num2);
	
}
class Mycalculator implements Calculator
{
	public double addNumbers(double num1,double num2)
	{
		System.out.println("Adding your numbers...");
		return num1+num2;
	}
	public double subtractNumbers(double num1,double num2)
	{
		System.out.println("Subtracting your numbers...");
		return num1-num2;
	}
	public double multiplyNumbers(double num1,double num2)
	{
		System.out.println("Multiplying your numbers...");
		return num1*num2;
	}
	public double divideNumbers(double num1,double num2)
	{
		System.out.println("Dividing your numbers...");
		return num1/num2;
	}
}
public class Testcalculator {

	public static void main(String[] args) {
         Scanner scannerObj=new Scanner(System.in);
         Calculator calculatorObj=new Mycalculator();
         
         System.out.println("***WELCOME TO MY CALCULATOR***");
         System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
         first:while(true)
         {
            System.out.print("Enter your choice : ");
            int choice=scannerObj.nextInt();
            
            second:switch(choice)
            {
               case 1:
            	      System.out.print("Enter 1st Number : ");
            	      double num1=scannerObj.nextDouble();
            	      System.out.print("Enter 2nd Number : ");
            	      double num2=scannerObj.nextDouble();
            	      System.out.println("Your Result is = "+calculatorObj.addNumbers(num1,num2));
            	      break first;
               case 2:
            	      System.out.print("Enter 1st Number : ");
	         	      num1=scannerObj.nextDouble();
	         	      System.out.print("Enter 2nd Number : ");
	         	      num2=scannerObj.nextDouble();
	         	      System.out.println("Your Result is = "+calculatorObj.subtractNumbers(num1,num2));
	         	      break first;
               case 3:
            	      System.out.print("Enter 1st Number : ");
	         	      num1=scannerObj.nextDouble();
	         	      System.out.print("Enter 2nd Number : ");
	         	      num2=scannerObj.nextDouble();
	         	      System.out.println("Your Result is = "+calculatorObj.multiplyNumbers(num1,num2));
	         	      break first;
               case 4:
            	   while(true)
            	   {
         	          System.out.print("Enter 1st Number : ");
	         	      num1=scannerObj.nextDouble();
	         	      System.out.print("Enter 2nd Number : ");
	         	      num2=scannerObj.nextDouble();
	         	      if(num2==0)
	         	      {
	         	    	  try {
	         	    		  throw new NumberFormatException();
	         	    	  }
	         	    	  catch(NumberFormatException n)
	         	    	  {
	         	    		  System.out.println("Sorry Can't divide by Zero,please enter valid value !!");
	         	    		  continue;
	         	    	  }
	         	      }
	         	      System.out.println("Your Result is = "+calculatorObj.divideNumbers(num1,num2));
	         	      break first;
            	   }
	         	default:continue;
            	
            }
         }
         System.out.println("***Thank You***");
	}

}
