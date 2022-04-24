package com.soumya.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/home")
	public String getHomePage() {
		
		return "Home";
	}
	
	@PostMapping("/send/name")
	public String greetUser(@RequestParam("name") String name,Model model) {
		
		
		model.addAttribute("name",name);
		
		return "Greet";
		
	}
	
	@GetMapping("send/home")
	public String getHomePageFromAfterGreet() {
		
		return "redirect:/home";
	}

}
