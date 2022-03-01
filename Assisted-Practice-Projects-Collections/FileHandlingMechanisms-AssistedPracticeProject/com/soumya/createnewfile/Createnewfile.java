package com.soumya.createnewfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Createnewfile {

	public static void main(String[] args) {
		
       File file = new File("Data.txt");// Creating File Object
       
       if(!file.exists())// checking whether given file exists or not
       {
    	   FileWriter fileWriterObject=null;
			try 
			{
				 file.createNewFile();// Creating new File Data.txt if already not exists
			     System.out.println("File Created...");
			     fileWriterObject = new FileWriter(file);// Creating Filewriter Object to write to the file Data.txt
			     fileWriterObject.write("Hello Soumyajit\nHow are you??\nI hope you are fine!!"); // Writing Data to the file Data.txt
			     System.out.println("Data written to the file successfully...");
			} 
			catch (IOException e) 
			{
				System.out.println("IoException caught");
			}
			finally
			{
				try
				{
					System.out.println("File resoureces are now closed");
					fileWriterObject.close();// Closing Filewriter resource
				} 
				catch (IOException e) 
				{
					System.out.println("IoException caught");
				}
				catch(NullPointerException npe)
				{
					System.out.println("Filewriter Object is not created");
				}
			    return;

			}
       }
       System.out.println("File already Exists !! ");
       
       
	}

}
