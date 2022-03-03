package com.soumya.finallyblockdemo;

public class Finallyblockdemo {

	public static void main(String[] args) {
		int[] arr= {2,3};
		try
		{
			System.out.println("inside try block");
			System.out.println(arr[2]);// here ArrayIndexOutOfBoundsException occurs at runtime
		}
		catch(IndexOutOfBoundsException ie)  // Handling  ArrayIndexOutOfBoundsException which occured inside try block
		{
			System.out.print("Inside catch block because ");
			System.out.println("You exceeded maximum index");
		}
		finally// This block executes always whether exception rised or not rised and whether handled or not handled
		{
			System.out.println("This finally block always execute");
		}
		System.out.println("Program ended");

	}

}
