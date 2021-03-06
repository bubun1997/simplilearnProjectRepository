package com.soumya.userfeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.userfeedback.entity.Feedback;
import com.soumya.userfeedback.service.FeedbackService;


@RestController
@RequestMapping("/yourfeedback.com/")
public class MyRestController {
	
	@Autowired
	FeedbackService  feedbackService;
	
	@PostMapping("/post/feedback/api")
	public Feedback postFeedback(@RequestBody Feedback feedback) {
		
		return feedbackService.postFeedback(feedback);
		
	}
	
	

}
