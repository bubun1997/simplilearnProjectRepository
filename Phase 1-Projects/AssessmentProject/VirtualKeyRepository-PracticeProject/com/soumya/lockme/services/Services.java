package com.soumya.lockme.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface Services {
	
	 File  FILEOBJ = new File("E:/myProjects/Virtualkey/myfilescollection/");

	List<String> retrieveFilesInAscendingOrder();
	
	boolean addFile(String fileName);
	
	boolean deleteFile(String fileName);
	
	boolean searchFile(String fileName);
	
	void navigateBackToMainMenu();
	
	void closeApplication();

}
