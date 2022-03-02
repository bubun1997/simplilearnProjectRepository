package com.soumya.encapsulation;

class Student// Tightly Encapsulated class
{
	private String studentName;
	private int studentAge;
	private int rollNumber;
	
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
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + "]";
	}
	public String getStudentInfo()
	{
		return "Roll number : "+this.rollNumber+" , Name : "+this.studentName;
	}
	
	

}
public class Encapsulationdemo {

	public static void main(String[] args) {
		
            Student student1 = new Student();// creating 1st student instance
            Student student2 = new Student();// creating 2nd student instance
            
            // setting values for each properties of 1st Student instance
            student1.setRollNumber(10);
            student1.setStudentAge(20);
            student1.setStudentName("Ravi");
            
         // setting values for each properties of 2nd Student instance
            student2.setRollNumber(12);
            student2.setStudentAge(18);
            student2.setStudentName("Mohit");
            
            // getting 2nd Student information
            System.out.println(student2.getStudentInfo());
            
            // getting 1st Student information
            System.out.println(student1.getStudentInfo());

            
            

	}

}
