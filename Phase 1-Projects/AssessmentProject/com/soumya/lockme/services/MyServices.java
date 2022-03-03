package com.soumya.lockme.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyServices implements Services
{
	
	public List<String> retriveFilesInAscendingOrder()
	{
		File  fileObj = new File("E:/myProjects/Virtualkey/myfilescollection/");
		String[] fileArray = fileObj.list();
		List<String> filesCollection = new ArrayList<String>();
		
		for(String fileNames:fileArray)
			filesCollection.add(fileNames);
		
		Collections.sort(filesCollection);
		
		return filesCollection;
	}
	
	public void addFile(String fileName)
	{
	    
		
	}
	
	public void deleteFile(String fileName)
	{
		
	}
	
	public boolean searchFile(String fileName)
	{
		return false;
	}
	
	public void navigateBackToMainMenu()
	{
		
	}
	
	public void closeApplication()
	{
		
	}
}
