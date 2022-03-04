package com.soumya.lockme.presentation;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.soumya.lockme.services.Services;
import com.soumya.lockme.services.MyServices;

public class MyLockmeApplication {

	public static void main(String[] args) {
		
		Services myService = new MyServices(); //creating MyService class instance to provide various kind services to the user
		System.out.println("****Welcome to Locker application help desk by Mr.Soumyajit Banerjee****\n"); // Displaying name of the application alongwith the developer name
		
		
		
		first:while(true)
		{
			Scanner scannerObj = new Scanner(System.in); // Creating Scanner class instance from user to take user input
             
			// Displaying Interface of the application to the User
			System.out.println("You must choose one of the options listed below : \n");
			System.out.println(" 1. Retrive file names in ascending order");
			System.out.println(" 2. Perform various business level operations on files\n\t A. Add a user specific file\n\t B. Delete a user specific file\n\t C. Search a user specific file\n\t D. Navigate back to main menu");
			System.out.println(" 3. Exit/close the application\n");
			System.out.println("---------------------------------------------------");
			System.out.print("Enter your choice : ");
			int mainChoice = 0;
			  try {
				   mainChoice = scannerObj.nextInt(); // Reading users choice
			  }
			  catch(InputMismatchException i)
			  {
				  System.err.println("Please enter an integer value !!");
				  continue first;
			  }
	          scannerObj.nextLine();
              System.out.println();
	          switch(mainChoice)
	          {
	          	 case 1:
	          		     List<String> listOfFiles = myService.retrieveFilesInAscendingOrder(); // Retrieving file names in ascending order
	          		     
	          		     if(! listOfFiles.isEmpty())
	          		     {
	          		    	 System.out.println("***Your Files are listed below in ascending order***");
	          		    	 for(String fileNames:listOfFiles)
	          		    		 System.out.println(fileNames); // Displaying files in ascending order one by one
	          		    	 System.out.println();
	          		     }
	          		     else
	          		    	 System.err.println("Sorry, there are no files in the directory currently !!\n");
	          		     break;
	          	 case 2:
	          		    second:while(true)
	          		    {
	          		    	//Displaying SubMenu interface to the user
	          		    	System.out.println("***You have the following options***");
	 	          		    System.out.print("\t A. Add a specific file\n\t B. Delete a specific file\n\t C. Search a specific file\n\t D. Navigate back to main menu\n");
	 	          		    System.out.print("Now Enter you choice : ");
	 	          		    String subChoice = scannerObj.nextLine().toLowerCase(); // Reading Users choice
		          		    switch(subChoice)
		          		    {
		          		       case "a" : 
		          		    	         System.out.print("Enter file Name you want to add : ");
		          		    	         String fileName = scannerObj.nextLine(); // Reading file name from the user which is to be added
		          		    	         boolean result = myService.addFile(fileName); // calling addFile() method to add specific file provided by the user
		          		    	         if(! result) {
		          		    	        	 System.err.println("File already exists!!\n");
		          		    	        	 break second;
		          		    	         }
		          		    	         System.out.println("File added successfully...\n");
		          		    	         break second;
		          		       case "b" :
		          		    	         System.out.print("Enter file name you want to delete : ");
		          		    	         fileName = scannerObj.nextLine(); // Reading file name from the user which is to be deleted
		          		    	         result = myService.deleteFile(fileName); // calling deleteFile() method inorder to delete the file provided by the user
		          		    	         
		          		    	         if(!result)
		          		    	        	 System.err.println("File Not Found !!\n");
		          		    	         else
		          		    	        	 System.out.println("Your file has been deleted successfully\n");
		          		    	         System.out.println();
		          		    	         break second;
		          		       case "c" :
		          		    	        System.out.print("Enter file you want to search : ");
		          		    	        fileName = scannerObj.nextLine(); // Reading file name from the user which is to be searched
		          		    	        boolean isAvailable = myService.searchFile(fileName); // calling searchFile() method inorder to search the file provided by the user
		          		    	        
		          		    	        if(isAvailable)
		          		    	        	System.out.println("Your file is available\n");
		          		    	        else
		          		    	        	System.err.println("Sorry Your file is not available !!\n ");		
		          		    	        
		          		    	        break second;
		          		       case "d" :
		          		    	   		// Navigating to the main menu
		          		    	        myService.navigateBackToMainMenu(); 
		          		    	        continue first;
				          	   default : 
				          		       System.err.println("Please enter a valid  choice !! \n");
		          		    }
	          		    }
	          		    break;
	          	 case 3:
	          		    // Closing the application
	          		   myService.closeApplication(); 
	          		   break first;
	             default: 
	            	    System.err.println("Please enter a valid choice !! \n");
	            	    continue first;
	          }
		}	
		System.out.println("****Thank You for using My Application****");

	}

}
