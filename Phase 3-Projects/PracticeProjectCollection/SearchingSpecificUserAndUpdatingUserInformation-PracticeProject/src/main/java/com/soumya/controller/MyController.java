package com.soumya.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.soumya.model.User;
import com.soumya.service.UserService;

@Controller
@RequestMapping("/user.com/")
public class MyController {
     
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/home",method = RequestMethod.GET)
	public String getHomePage() {
		return "Home";
	}
	
	
	@RequestMapping(path="/add",method = RequestMethod.GET)
	public String getaddUserPage() {
		return "Add";
	}
	
	@RequestMapping(path = "/success" , method = RequestMethod.GET)
	public String getSuccessPage(Model model) {
		model.addAttribute("mssg", "User is added");
		return "Success";
	}
	
	@RequestMapping(path="/retrieve",method = RequestMethod.GET)
	public String getRetrieveUserPage() {
		return "Retrieve";
	}
	
	@RequestMapping(path="/userdetails",method = RequestMethod.GET)
	public String getUserDetailsPage(@RequestParam("id") Long id , Model model) {
		
		if(id!=-1) {
			User user = userService.getUser(id);
			model.addAttribute("user", user);
			model.addAttribute("mssg", true);
            
			return "UserDetails";
		}
		model.addAttribute("mssg", false);

		
		return "UserDetails";
	}
	
	@RequestMapping(path="/edit",method = RequestMethod.GET)
    public String getUserEditPage(@RequestParam("id") Long userId, Model model)
    {
		model.addAttribute("id", userId);
		return "Edit";
    }
	
	@RequestMapping(path = "/get/edit/page/{id}" ,method = RequestMethod.GET)
	public String getEditPage(@PathVariable("id") Long userId) {
		
		return "redirect:/welcometo/user.com/edit?id="+userId;
	}
	
	@RequestMapping(path="/getconfirmpage",method= RequestMethod.GET)
	public String getConfirmationPage(Model model) {
		model.addAttribute("mssg", "User is updated");
		return "Confirmation";
	}
	
	
	@RequestMapping(path="/add/user",method = RequestMethod.POST)
	public String addUser(@Valid User user,BindingResult results) {
		
		if(results.hasErrors()) {
			return "redirect:/welcometo/user.com/add";
		}
		userService.addUser(user);
		return "redirect:/welcometo/user.com/success";
	}
	
	
	
	@RequestMapping(path="/edit/user",method = RequestMethod.POST)
	public String editUser(@Valid User user,BindingResult result) {
		
		if(result.hasErrors())
			return "redirect:/welcometo/user.com/edit?id="+user.getUserId();
		
		userService.updateUser(user);
		return "redirect:/welcometo/user.com/getconfirmpage";


	}
	
	@RequestMapping(path="/search/user",method = RequestMethod.POST)
    public String retrieveUser(@RequestParam("userid") Long userId , Model model) {
		  User user = userService.getUser(userId);
		  if(user!=null) {

			  return "redirect:/welcometo/user.com/userdetails?id="+user.getUserId();
		  }
		  
		  
		  return "redirect:/welcometo/user.com/userdetails?id="+-1;
	}
    
	
}
