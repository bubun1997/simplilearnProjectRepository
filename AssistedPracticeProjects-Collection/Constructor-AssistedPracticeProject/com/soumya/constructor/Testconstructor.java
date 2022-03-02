package com.soumya.constructor;

import java.util.Scanner;

class Employee
{
	private int emloyeeId;
	private String employeeName;
	
	public void getDetails()
	{
		System.out.println("Employee id : "+this.emloyeeId+" , "+"Employee Name : "+this.employeeName);
	}
}
class Student
{
	private int studentRollNumber;
	private String studentName;
	
	public Student(int studentRollNumber,String studentName)//Parameterized constructor
	{
		this.studentRollNumber=studentRollNumber;
		this.studentName=studentName;
	}
	public Student()//Non-parameterized constructor
	{
		System.out.println("This is a non-param constructor");
	}
	public void getDetails()
	{
		System.out.println("Student Roll Number : "+this.studentRollNumber+" , "+"Student Name : "+this.studentName);
	}
}
public class Testconstructor {

	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		
		Employee emp1 = new Employee();//calling Default constructor of class Employee provided by compiler
		
		emp1.getDetails();//0 null
		
		
		System.out.print("Enter Student1 Roll number : ");
		int rollNumber1 = scannerObj.nextInt();
		
		scannerObj.nextLine();
		
		System.out.print("Enter Student1 Name : ");
		String studentName1 = scannerObj.nextLine();
		
		
		System.out.print("Enter Student2 Roll number : ");
		int rollNumber2 = scannerObj.nextInt();
		
		scannerObj.nextLine();

		System.out.print("Enter Student2 Name : ");
		String studentName2 = scannerObj.nextLine();
		
		Student stud1 = new Student(rollNumber1,studentName1);//calling parameterized constructor of student class
		Student stud2 = new Student(rollNumber2,studentName2);//calling parameterized constructor of student class
		
		System.out.println("Student1 Info : ");
		stud1.getDetails();
		
		System.out.println("--------------------");
		
		System.out.println("Student2 Info : ");
        stud2.getDetails();
     
		System.out.println("--------------------");
		
		Student stud3 = new Student();//calling Non-parameterized constructor of student class
		stud3.getDetails();// 0 null

	}

}
