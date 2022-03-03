package com.soumya.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fileoperations {

	static void append()
	{
		BufferedWriter bufferedWriterObject = null;
		Scanner sc = new Scanner(System.in);// Creating Scanner instance
		try {
			bufferedWriterObject = new BufferedWriter(new FileWriter("Names.txt",true));// creating BufferedWriter instance
			System.out.print("Enter how many names you want to append to the file : ");
			int num=sc.nextInt(),count=1;
			sc.nextLine();
			while(true)
			{
				if(count==num+1)
					break;
			     System.out.print("Enter Name "+count+" : ");
			     String name = sc.nextLine();// Reading Names from user
			     bufferedWriterObject.write(name);// Appending Names into the file entered by the user, one after the other 
			     bufferedWriterObject.newLine();// Line separator
			     count+=1;
			}
			bufferedWriterObject.flush();
			System.out.println("You have successfully appended new names to your existing file...");
		} 
		catch (IOException e) 
		{
			System.out.println("An IOException has occured");
		}
		finally
		{
			try {
				bufferedWriterObject.close();// Closing BufferedWriter Resource
			} catch (IOException e) {
				System.out.println("An IOException has occured");

			}
		}
	}
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);// Creating Scanner instance
        PrintWriter printWriterObj=null;
        BufferedReader bufferedReaderObj=null;
        try
        {
	        printWriterObj = new PrintWriter("Names.txt");//Creating PrintWriter instance 
			System.out.print("How Many Names you want to add into your File : ");
	        int num=sc.nextInt(),count=1;
	        sc.nextLine();
	        while(true)
	        {
	           if(count==num+1)
	        	   break;
	           System.out.print("Enter Name "+count+" : ");
	           String name=sc.nextLine();// Reading Names from user
	           printWriterObj.println(name);// Writing to the file the name which is entered by the user
	           count+=1;
	        }
	        printWriterObj.flush();
	        System.out.println("Your list of names has been added successfully....");
	        bufferedReaderObj=new BufferedReader(new FileReader("Names.txt"));// creating BufferedReader instance
	        System.out.println("Your List of Names are : ");
	        Thread.sleep(3000);
	        String names =  bufferedReaderObj.readLine();//Fetching 1st name from the file
	        while(names!=null)
	        {
	        	System.out.println(names);// printing  the names fetched from the file line by line  
	        	names= bufferedReaderObj.readLine();// Fetching names from the file line by line
	        }
	        System.out.print("Do you want to append some more names to your list?");
	        first:while(true) {
	        System.out.print("Press , Y or N : ");
	        String choice = sc.nextLine().toLowerCase();// Reading user's choice
	        
		        switch(choice)
		        {
		           case "y":append();// calling append method
		                    System.out.println("Your Updated List of Names are as follows: ");
		                    Thread.sleep(3000);
		                    bufferedReaderObj=new BufferedReader(new FileReader("Names.txt"));// creating BufferedReader instance
		                    names =  bufferedReaderObj.readLine();//Fetching 1st name from the file
		        	        while(names!=null)
		        	        {
		        	        	System.out.println(names);// printing  the names fetched from the file line by line 
		        	        	names= bufferedReaderObj.readLine();// Fetching names from the file line by line
		        	        }
		                    break first;
		           
		           case "n":System.out.println("Thank you");
		                    break first;
		                    
		           default:System.out.println("Please enter a valid choice !!");
		           
		        }
	        }
        }
        catch(IOException ie)
        {
        	System.out.println("An IOExcaption has occured");
        }
        catch(InterruptedException ie)
        {
        	System.out.println("An InterruptedException has occured");
        }
        catch(InputMismatchException ie)
        {
        	System.out.println("Enter a valid input !!");
        }
        finally
		{
			try {
				bufferedReaderObj.close();// Closing BufferedReader Resource
				printWriterObj.close(); // Closing PrintWriter Resource
			} 
			catch (IOException e) {
				System.out.println("An IOException has occured");

			}
			catch(NullPointerException npe)
			{
				System.out.println("NullpointerException has occcured");
			}
		}
	}

}
