package com.soumya.deletefile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Deletefile {

	public static void main(String[] args) {
		
          try 
          {
			if(Files.deleteIfExists(Paths.get("E:/myProjects/Filehandling/Data.txt")))// Deleting the file from the given path
			{
				System.out.println("File Deleted successfully");
				return;
			}
		    System.out.println("File already deleted");
		  } 
	       catch (IOException e) 
	       {
				 
				System.out.println("IOException caught");
		   }
	       finally
	       {
	        	System.out.println("All Resources are closed");
	
	        }
          
	}

}
