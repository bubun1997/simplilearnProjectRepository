package com.soumya.userfeedback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumya.userfeedback.dao.FeedbackDao;
import com.soumya.userfeedback.entity.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	FeedbackDao feedbackDao;
	
	@Override
	public Feedback postFeedback(Feedback myfeedBack) {
		
		return feedbackDao.save(myfeedBack);
	}

}
