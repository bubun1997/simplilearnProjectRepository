package com.soumya.ecommerce.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.soumya.ecommerce.entities.Product;
import com.soumya.ecommerce.entities.User;
import com.soumya.ecommerce.service.product_service.ProductService;
import com.soumya.ecommerce.service.user_service.UserService;

@Controller
@RequestMapping("/funckyshoes.com/")
public class UserController {
	
	private static int count = 0;
		
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String getHomePage() {
			return "UserLogin";
	}
	
	@GetMapping("/user/signin")
	public String getSignInPage() {
		return "UserSignin";
		
	}
	
	@GetMapping("/dashboard/add/product/{uid}/{pid}")
	public String addProductToUser(@PathVariable("uid")Long userId,@PathVariable("pid") Long productId) {

		User user = userService.getUserById(userId);
		System.out.println("added");
		Product product = productService.getProductById(productId);
		
		if(user!=null && product!=null) {
			
			user.addProduct(product);
			product.addUser(user);
			product.setDateOfPurchase(new Timestamp(new java.util.Date().getTime()));
			
			userService.saveUser(user);
			productService.saveProduct(product);
			
			count+=1;
			
		    return "redirect:/funckyshoes.com/dashboard/"+user.getUserId();

			

			
		}
		return null;
	}
	
	@GetMapping("/dashboard/{id}")
	public String getDashboard(@PathVariable("id")Long userId, Model model,HttpServletRequest request,HttpSession session) {
				
		if(session.getAttribute("user") != null) {
				List<Product> products = productService.getAllProducts();
				model.addAttribute("id", userId);
		
				model.addAttribute("products", products);
				
				if(count>1)
					model.addAttribute("flag", true);
				 
		//		model.addAttribute("flag", flag);
		
				return "UserDashboard";
		}
		
		return "redirect:/funckyshoes.com/";
        
	}
	
	@PostMapping("/user/signin/account")
    public String userSignIn(User user) {
		
		User myUser = userService.userLogin(user);
		if(myUser!=null) {
			return "redirect:/funckyshoes.com/";
		}
		userService.saveUser(user);
		return "redirect:/funckyshoes.com/";

	}
	
	@PostMapping("/user/login/account")
	public String userLogin(@Valid User user,BindingResult result,HttpServletRequest request,HttpSession session) {
		  
		if(result.hasErrors()) {
			return "redirect:/funckyshoes.com/";
		}
		
		User myUser = userService.userLogin(user);
		if(myUser != null) {
			session.setAttribute("user", myUser);
			count+=1;

		    return "redirect:/funckyshoes.com/dashboard/"+myUser.getUserId();
		}
	
		return "redirect:/funckyshoes.com/";
		
	}
	
	@GetMapping("/dashboard/user/logout")
	public String userLogout(Model model,HttpServletRequest request,HttpSession session) {

		
		
		session.invalidate();
		
//		session = request.getSession(false);
//		System.err.println("Session in Logout after invalidating -> {} : "+session);
        
		count = 0;
		return "redirect:/funckyshoes.com/";
	}
	
	

}
