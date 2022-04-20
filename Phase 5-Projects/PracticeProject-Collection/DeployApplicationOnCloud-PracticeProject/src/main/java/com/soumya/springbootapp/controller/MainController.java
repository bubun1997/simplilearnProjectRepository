package com.soumya.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/greet/{name}")
	@ResponseBody
	public String greetUser(@PathVariable("name") String name) {
		
		return "Hello "+name+" Welcome to Aws.....";
	}
	

}
