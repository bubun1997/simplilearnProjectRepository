package com.soumya.userfeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.userfeedback.entity.Feedback;
import com.soumya.userfeedback.service.FeedbackService;

@Controller
@RequestMapping("/yourfeedback.com/")
public class MyController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("/home")
	public String getFeedbackForm() {
		return "Home";
	}
	@GetMapping("/post/home")
	public String returnToFeedbackForm() {
		return "redirect:/yourfeedback.com/home";
	}
	
	@PostMapping("/post/feedback")
	public String postFeedback(Feedback feedback,Model model) {
		
		Feedback myfeedback = feedbackService.postFeedback(feedback);
		model.addAttribute("yourfeedback", myfeedback);
		return "Success";
		
		
	}

}
