package com.soumya.throwkeyworddemo;

import java.util.ArrayList;
import java.util.Scanner;

class Voter
{
	public void vote() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		String name = sc.nextLine();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		if(age<18)
		{
			 throw new Exception(); // throwing an Exception explicitly by the programmer using throw keyword
			
		}
		else
		{
			System.out.println(name+" successfully voted !!");}
		}
	
}
public class Throwdemo {

	public static void main(String[] args) {
		
		Voter voter = new Voter();
		try 
		{
		  voter.vote();
		}
		catch(Exception e)// Handling the exception which is thrown explicitly by the programmer using throw keyword from vote() method of Voter class
		{
			System.out.println("Sorry, you are not eligible to vote");
		}
		System.out.println("Program Ended");
  	}

}
