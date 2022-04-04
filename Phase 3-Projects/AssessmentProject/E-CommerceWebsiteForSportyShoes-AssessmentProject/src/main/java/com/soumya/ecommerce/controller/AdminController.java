package com.soumya.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.soumya.ecommerce.entities.Admin;
import com.soumya.ecommerce.entities.Product;
import com.soumya.ecommerce.entities.User;
import com.soumya.ecommerce.service.admin_service.AdminService;
import com.soumya.ecommerce.service.product_service.ProductService;
import com.soumya.ecommerce.service.user_service.UserService;

@Controller
@RequestMapping("/funckyshoes.com/Myadmin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/")
	public String getAdminLoginPage() {
		return "AdminLogin";
	}
	@GetMapping("/Admin/update")
	public String getAdminUpdatePage() {
		return "AdminUpdate";
	}
	@GetMapping("/add")
	public String getPageForAddingNewProduct() {
		return "NewProduct";
	}
	
	@GetMapping("/Admin/dashboard")
	public String getAdminDashboardPage(Model model,HttpSession session) {
		
		if(session.getAttribute("admin")!=null) {
			
			List<Object[]> listOfPurchase = userService.getAllPurchaseDetails();
			
			model.addAttribute("purchaselist", listOfPurchase );
			return "AdminDashboard";
		}
		return "redirect:/funckyshoes.com/Myadmin/";
		
	}
	@GetMapping("/registeredusers")
	public String getRegisteredUsersPage(Model model) {
		List<User> users = userService.getAllRegisteredUsers();
		model.addAttribute("users", users);
		
		return "RegisteredUsers";
		
		
	}
	
	@GetMapping("/Admin/registered/users")
	public String getAllRegisteredUsers() {
		
		return "redirect:/funckyshoes.com/Myadmin/registeredusers";
		
	}
	@GetMapping("/Admin/add/product")
	public String addProduct() {
		return "redirect:/funckyshoes.com/Myadmin/add";
	}
	
	@GetMapping("/admin/update")
	public String updateAdmin() {
		
		return "redirect:/funckyshoes.com/Myadmin/Admin/update";
	}
	
	@PostMapping("/admin/login")
	public String adminLogin(Admin admin,HttpServletRequest request,HttpSession session) {
		  
		Admin myAdmin = adminService.getAdmin(admin);
		System.err.println(session.getAttribute("user")!=null);
		
		if(myAdmin != null) {
			session.setAttribute("admin", myAdmin);
			System.out.println("validated");
			return "redirect:/funckyshoes.com/Myadmin/Admin/dashboard";
		}
		return "redirect:/funckyshoes.com/Myadmin/";
		
	}
	
	@PostMapping("/Admin/update/credentials")
	public String setNewAdminCredentials(Admin admin) {
	     
		adminService.updateAdmin(admin);
		return "redirect:/funckyshoes.com/Myadmin/";
	}
	
	@PostMapping("/new/product")
	public String addNewProduct(Product product,Model model) {
		productService.saveProduct(product);
        
		List<Product> listOfProducts = productService.getAllProducts();
		model.addAttribute("productlist", listOfProducts);
		return "redirect:/funckyshoes.com/Myadmin/Admin/dashboard";
	}
	
	@GetMapping("/Admin/admin/logout")
	public String adminLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/funckyshoes.com/Myadmin/";
	}
	

}
