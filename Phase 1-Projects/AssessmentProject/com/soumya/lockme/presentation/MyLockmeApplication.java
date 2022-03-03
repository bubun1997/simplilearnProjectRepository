package com.soumya.lockme.presentation;

import java.util.List;
import java.util.Scanner;

import com.soumya.lockme.services.Services;
import com.soumya.lockme.services.MyServices;

public class MyLockmeApplication {

	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		Services myService = new MyServices();
		System.out.println("****Welcome to Locker application help desk by Soumyajit Banerjee****\n");
		
		
		
		first:while(true)
		{
			System.out.println("You must choose one of the options listed below : \n");
			System.out.println(" 1. Retrive file names in ascending order");
			System.out.println(" 2. Perform various business level operations on files\n\t A. Add a user specific file\n\t B. Delete a user specific file\n\t C. Search a user specific file\n\t D. Navigate back to main menu");
			System.out.println(" 3. Exit/close the application\n");
			System.out.println("---------------------------------------------------");
			  System.out.print("Enter your choice : ");
	          int mainChoice = scannerObj.nextInt();
	          scannerObj.nextLine();
              System.out.println();
	          switch(mainChoice)
	          {
	          	 case 1:
	          		     List<String> listOfFiles = myService.retriveFilesInAscendingOrder();
	          		     if(! listOfFiles.isEmpty())
	          		     {
	          		       for(String fileNames:listOfFiles)
	          		    	 System.out.println(fileNames);
	          		     }
	          		     else
	          		    	 System.out.println("Sorry, there are no files in the directory currently !!\n");
	          		     break;
	          	 case 2:
	          		    second:while(true)
	          		    {
	          		    	System.out.println("***You have the following options***");
	 	          		    System.out.print("\t A. Add a specific file\n\t B. Delete a specific file\n\t C. Search a specific file\n\t D. Navigate back to main menu\n");
	 	          		    System.out.print("Now Enter you choice : ");
	 	          		    String subChoice = scannerObj.nextLine().toLowerCase();
		          		    switch(subChoice)
		          		    {
		          		       case "a" : 
		          		    	         System.out.print("Enter file Name you want to add : ");
		          		    	         String fileName = scannerObj.nextLine();
		          		    	         myService.addFile(fileName);
		          		    	         break second;
		          		       case "b" :
		          		    	         System.out.print("Enter file name you want to delete : ");
		          		    	         fileName = scannerObj.nextLine();
		          		    	         myService.deleteFile(fileName);
		          		    	         break second;
		          		       case "c" :
		          		    	        System.out.println("Enter file you want to search : ");
		          		    	        fileName = scannerObj.nextLine();
		          		    	        boolean isAvailable = myService.searchFile(fileName);
		          		    	        
		          		    	        if(isAvailable)
		          		    	        	System.out.println("Your file is available");
		          		    	        else
		          		    	        	System.out.println("Sorry Your file is not available !! ");		
		          		    	        
		          		    	        break second;
		          		       case "d" :
		          		    	        myService.navigateBackToMainMenu();
		          		    	        continue first;
				          	   default : 
				          		       System.out.println("Please enter a valid  choice !! \n");
		          		    }
	          		    }
	          		    break;
	          	 case 3:
	          		   
	          		   myService.closeApplication();
	          		   break first;
	             default: 
	            	    System.out.println("Please enter a valid choice !! \n");
	            	    continue first;
	          }
	          break;
		}	
		System.out.println("****Thank You for using My Application****");

	}

}
