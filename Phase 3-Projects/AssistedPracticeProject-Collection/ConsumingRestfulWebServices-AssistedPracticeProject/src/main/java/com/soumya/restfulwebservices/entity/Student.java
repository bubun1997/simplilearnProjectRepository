package com.soumya.restfulwebservices.entity;

public class Student {
	
	private Long studentId;
	
	private String studentName;
	
	private int studentAge;
	
	private String studentLocation;

	public Student(Long studentId, String studentName, int studentAge, String studentLocation) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentLocation = studentLocation;
	}

	
	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentAge() {
		return studentAge;
	}


	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}


	public String getStudentLocation() {
		return studentLocation;
	}


	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentLocation=" + studentLocation + "]";
	}
	
	
	

}
