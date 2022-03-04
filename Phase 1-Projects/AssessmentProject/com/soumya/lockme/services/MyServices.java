package com.soumya.lockme.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyServices implements Services
{

	// Method to retrieve files in ascending order
	public List<String> retrieveFilesInAscendingOrder()
	{
		String[] fileArray = FILEOBJ.list(); // Getting array of file names from the directory 
		List<String> filesCollection = new ArrayList<String>(); // Creating ArrayList class instance
		
		for(String fileNames:fileArray)
			filesCollection.add(fileNames); // Adding names of the files to the collection object one by one
		
		Collections.sort(filesCollection); // Sorting all the file names alphabetically in ascending order
		
		System.out.println("Please wait...\n");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Oops something went wrong !!");
		}
		return filesCollection; // returning sorted collection instance in ascending order, to the user
	}
	
	// Method to add user Specific file
	public boolean addFile(String fileName)
	{
	   File myFile = new File("E:/myProjects/Virtualkey/myfilescollection/"+fileName); // Creating File class instance with the user provided file name
	   boolean result = false;
	   try {
		   	   System.out.println("Please wait....\n");
	           Thread.sleep(3000);
	           // Verifying whether file already exists or not
			   if(! myFile.exists())
			   {
					
						myFile.createNewFile(); // Adding file provided by the user to the directory
						result = true;
			   }
	  	}
		  catch(InterruptedException e)
		  {
			  System.err.println("Oops somrthing went wrong !!");
		  }
		  catch(IOException e)
		  {
			  System.err.println("Oops something went wrong !!");
	
		  }
	     return result; // returning result to the user
	}
	
	// Method to delete user specific file from the directory
	public boolean deleteFile(String fileName)
	{
		String[] fileArray = FILEOBJ.list();  // Getting array of file names from the directory 
		
		Arrays.sort(fileArray); // Sorting FIle names alphabetically in ascending order
		
		boolean result = false;
		
		int outcome = Arrays.binarySearch(fileArray, fileName); // Verifying whether user provided file is available in the directory or not
		
		try {
				System.out.println("Please wait....\n");
				Thread.sleep(5000);
		
				if(outcome>=0)
				{
					    File fileToBeDeleted = new File("E:/myProjects/Virtualkey/myfilescollection/"+fileName); // Creating File class instance with the user provided file name
						
					    fileToBeDeleted.delete(); // Deleting the user provided file from the directory
                       
					     result = true;
				}
		}
		catch(InterruptedException ie)
		{
			System.err.println("oops something went wrong...");
		}
		return result; // Returning result to the user
	}
	
	// Method to search user specific file in the directory
	public boolean searchFile(String fileName)
	{
		String[] fileArray = FILEOBJ.list(); // Getting array of file names from the directory 
		
		Arrays.sort(fileArray); // Sorting FIle names alphabetically in ascending order
		
		int outcome = Arrays.binarySearch(fileArray, fileName); // Verifying whether user provided file is available in the directory or not
		
		boolean result=false;
		
		try {
			
		     System.out.println("Please wait....\n");
		     Thread.sleep(3000);
		      if(outcome>=0)
		      {
				
				result = true;
		      }

		}
		catch(InterruptedException ie)
		{
			System.err.println("oops something went wrong...");

		}
		return result; // returning result to the user
	}
	
	public void navigateBackToMainMenu()
	{
		try {
			System.out.println("Please wait... Navigating to the main menu...\n");
			Thread.sleep(3000);
			return;
		}
		catch (InterruptedException e) {
			System.err.println("Oops something went wrong !!");
			return;
		}
	}
	
	public void closeApplication()
	{
		try {
			System.out.println("Closing your Application....\n");
			Thread.sleep(5000);
			return;
		}
		catch (InterruptedException e) {
			System.err.println("Oops something went wrong !!");
			return;
		}
		
	}
}
