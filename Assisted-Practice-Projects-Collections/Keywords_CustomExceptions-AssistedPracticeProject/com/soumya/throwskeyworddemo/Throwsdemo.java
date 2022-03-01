package com.soumya.throwskeyworddemo;

class Test
{
	static
	{
		System.out.println("Test class loaded and initialized");
	}
}
class Demo
{
	static
	{
		System.out.println("Demo class loaded and initialized");
	}
}
public class Throwsdemo {

	static void loadTestClass()throws ClassNotFoundException // throwing checked exception to the caller using throws keyword
	{
		Class.forName("com.soumya.throwskeyworddemo.Test");

	}
	static void loadDemoClass()throws ClassNotFoundException // throwing checked exception to the caller using throws keyword
	{
		Class.forName("Demo");

	}
	public static void main(String[] args) {
		System.out.println("***Loading  And Initializing Test class***");
		
		try 
		{
			loadTestClass();
		} 
		catch (ClassNotFoundException e) // handling the checked exception using catch block which is thrown using throws keyword from method loadTestClass() if Test class is not found at Runtime
		{
			System.out.println("Sorry , Test Class is not found");
			
		}
		finally 
		{
			System.out.println("Finally associated with Test class executed");
		}
		System.out.println();
		System.out.println("***Loading And Initializing Demo class***");
		
		try 
		{
			loadDemoClass();
		} 
		catch (ClassNotFoundException e) // handling the checked exception using catch block which is thrown using throws keyword from method loadDemoClass() if Demo class is not found at Runtime
		{
			System.out.println("Sorry , Demo Class is not found");
			
		}
		finally 
		{
			System.out.println("Finally associated with Demo class executed");
		}
        
		

	}

}
