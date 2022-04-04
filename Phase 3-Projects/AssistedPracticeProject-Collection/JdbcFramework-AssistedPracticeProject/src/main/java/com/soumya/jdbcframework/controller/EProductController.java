package com.soumya.jdbcframework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soumya.jdbcframework.dao.EProductDao;
import com.soumya.jdbcframework.entity.EProduct;

@Controller
@RequestMapping("/eproducts.com/")
public class EProductController {
	
	@Autowired
	private EProductDao dao;
	
	@GetMapping("/")
	public String getHomePage() {
		return "Home";
	}
	
	@GetMapping("/home")
	public String returnToHome() {
		return "redirect:/eproducts.com/";
	}
	
	@GetMapping("/getproducts")
	public String getAllProducts(Model model) {
		
		List<EProduct> products = dao.getAllProducts();
		
		model.addAttribute("products", products);
		return "productList";
		
		
		
	}

}
