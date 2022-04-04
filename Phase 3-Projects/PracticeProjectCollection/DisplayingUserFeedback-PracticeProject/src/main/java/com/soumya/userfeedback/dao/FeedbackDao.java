package com.soumya.userfeedback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soumya.userfeedback.entity.Feedback;

@Repository
public interface FeedbackDao extends JpaRepository<Feedback, Integer>{
	
    

}
