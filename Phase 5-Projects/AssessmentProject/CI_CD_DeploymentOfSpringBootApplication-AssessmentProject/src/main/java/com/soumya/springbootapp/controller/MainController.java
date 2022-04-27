package com.soumya.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.soumya.springbootapp.entity.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String getHomePage() {
		
		 return "Home";
		
		 
		 
	}
	
	@PostMapping("/send/details")
	public String getDetailsPage(@ModelAttribute("user")  User myUser) {
		
		return "Details";
	}
	
	
	
	
    
}
