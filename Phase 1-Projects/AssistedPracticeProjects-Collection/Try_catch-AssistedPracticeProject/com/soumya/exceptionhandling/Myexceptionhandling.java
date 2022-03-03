package com.soumya.exceptionhandling;

class Operation
{
	public int divideNumbers(int num1,int num2)
	{
		return num1/num2;
	}
	public int getStringLength(String str)
	{
		return str.length();
	}
}
public class Myexceptionhandling {

	public static void main(String[] args) {
		
		System.out.println("***Handling various types of exceptions using try-catch***");
        System.out.println();
		Operation op = new Operation();
        
		System.out.println("***ARITHMETIC EXCEPTION EXAMPLE***");
		try 
		{
			System.out.println("Result = "+op.divideNumbers(130, 10));
			System.out.println("Result = "+op.divideNumbers(130, 0)); // Here, ArithMeticexception occurs at runtime as we are dividing number by Zero

		}
		catch(ArithmeticException ae)// Handling Arithmeticexception which occured inside try block 
		{
			System.out.println("sorry can't divide number by 0");
		}
		finally
		{
			System.out.println("Finally block associated with Arithmetic exception executed");
		}
		System.out.println();

		System.out.println("***NULLPOINTER EXCEPTION EXAMPLE***");

		try 
		{
		   System.out.println("Length = "+op.getStringLength("hello"));
		   System.out.println("Length = "+op.getStringLength(null));// Here , nullpointerexception occurs at runtime as we are trying to find length of string which holds a null value
		}
		catch(NullPointerException np)// Handling the nullpointerexception which occurs inside try block
		{
			System.out.println("sorry can't find length of the string");
		}
		finally
		{
			System.out.println("Finally block associated with Nullpointer exception executed");
		}
		
		System.out.println("Program ended");
		
	}

}
