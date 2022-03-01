package com.soumya.updatefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Updatefile {

	public static void main(String[] args) {
		
		BufferedReader bufferReaderObject = null;
		BufferedWriter bufferedWriterObject = null;
		try
		{
			FileReader fileReaderObject = new FileReader("Data.txt");// Creating Filereader object for communicating with the given file
		    bufferReaderObject = new BufferedReader(fileReaderObject); // Creating Bufferedreader object on the given Filereader instance to read form the file
			
			String data = bufferReaderObject.readLine();// Reading 1st Line of the file
			String content = "";
			boolean flag=false;
			
			while(data!=null)
			{
				flag=true;
				content+=data+"-"; // appending old file content with the newly created content which is to be added to the file....
				data=bufferReaderObject.readLine();// Reading file content line by line
			}
			if(!flag)
			{
				System.out.println("Can't update empty file");
				return;
			}
			bufferedWriterObject = new BufferedWriter(new FileWriter("Data.txt"));// Creating Bufferedwriter object on the given Filewriter instance to write and update the file
			String[] arr = content.split("-");
			for(String str:arr)
			{
				bufferedWriterObject.write(str.replace("a", "b").toUpperCase());// writing to the file with the new content
				bufferedWriterObject.newLine();// Moving to the nextline of the file

			}
			System.out.println("File Updated successfully...");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File is missing ");

		}
		catch(IOException ie)
		{
			System.out.println("Ioexception is caught");
		}

		finally
		{
			try
			{
				System.out.println("File resoureces are now closed");
				bufferReaderObject.close(); // closing Bufferedreader resource
				bufferedWriterObject.close(); // closing Bufferedwriter resource
			}
			catch(IOException e)
			{
				System.out.println("Ioexception caught");
			}
			catch(NullPointerException npe)
			{
				System.out.println("Bufferedreader or bufferedwriter Object is not created");
			}
		}
	}

}
