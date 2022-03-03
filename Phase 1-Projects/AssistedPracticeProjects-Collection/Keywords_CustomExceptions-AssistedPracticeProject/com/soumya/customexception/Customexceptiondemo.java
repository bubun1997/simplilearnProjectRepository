package com.soumya.customexception;

class Myexception extends Exception
{
	public String toString()
	{
		return "An Exception is raise explicitly by "+super.toString();
	}
	
}
public class Customexceptiondemo {

	public static void main(String[] args) {
		Myexception exceptionObj = new Myexception();
		try
		{
		  System.out.println("Inside try");
          throw exceptionObj;// throwing custom exception object of class Myexception using throw keyword
		}
		catch(Myexception e)// handling custom exception using catch which thrown from try block
		{
			System.out.print("Inside catch block because ");
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		System.out.println("Program Ended");
	}

}
