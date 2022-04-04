package com.soumya.userfeedback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="feedback" , length = 255)
	private String feedBack;

	public Feedback() {
		super();
	}

	public Feedback(int feedbackId, String firstName, String lastName, String feedBack) {
		super();
		this.feedbackId = feedbackId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.feedBack = feedBack;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	@Override
	public String toString() {
		return "UserFeedback [feedbackId=" + feedbackId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", feedBack=" + feedBack + "]";
	}
	
	
	
	
}
