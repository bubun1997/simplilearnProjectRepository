package com.soumya.readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) {
		
		BufferedReader bufferReaderObject=null;
		try 
		{
			FileReader fileReaderObject = new FileReader("Data.txt");// Creating Filereader object for communicating with the given file
		    bufferReaderObject = new BufferedReader(fileReaderObject);// Creating Bufferedreader object on the given Filereader instance to read form the file
			String data = bufferReaderObject.readLine();// Reading 1st Line of the file
			System.out.println("***Printing File contents***");
			boolean flag=false;
			while(data!=null)
			{
				flag=true;
				System.out.print(data+" ");// Printing content of the file on the same line
				data = bufferReaderObject.readLine();// Reading file content line by line
			}
			System.out.println();
			if(!flag)
			{
				System.out.println("File is empty...");
				return;
			}
			System.out.println("Total File content has been Read successfully....");
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File is missing , can't read");
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
				bufferReaderObject.close();// closing Bufferedreader resource
			} 
			catch (IOException e) 
			{
				System.out.println("IoException is caught");
			}
			catch(NullPointerException npe)
			{
				System.out.println("BufferedReader Object is not created");
			}
		}

	}

}
