package com.soumya.exceptionhandler;

class Myexception extends Exception
{
	private String exceptionMessage;
	Myexception(String exceptionMessage)
	{
		this.exceptionMessage = exceptionMessage;
	}
	public String toString()
	{
		return this.exceptionMessage+" an exception has been raised by Myexception class";
	}
}
public class Testexceptionhandler {

	public static void main(String[] args) {
		System.out.println("***Demonstrating Custom Exception Handler***");
		
		try {
			System.out.println("Inside try");
			System.out.println("Throwing Custom exception explicitly using throw");
		    throw new Myexception("Hello everyone");// throwing custom exception using throw keyword
		}
		catch(Myexception me)// Handling custom exception which is thrown from try block
		{
			System.out.println("Excaption is caught inside catch block");
			System.out.println(me);
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		System.out.println("Program Ended...");

	}

}
