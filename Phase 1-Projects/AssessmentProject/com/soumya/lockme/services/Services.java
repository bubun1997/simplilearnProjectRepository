package com.soumya.lockme.services;

import java.util.ArrayList;
import java.util.List;

public interface Services {
	
	List<String> retriveFilesInAscendingOrder();
	void addFile(String fileName);
	void deleteFile(String fileName);
	boolean searchFile(String fileName);
	void navigateBackToMainMenu();
	void closeApplication();

}
