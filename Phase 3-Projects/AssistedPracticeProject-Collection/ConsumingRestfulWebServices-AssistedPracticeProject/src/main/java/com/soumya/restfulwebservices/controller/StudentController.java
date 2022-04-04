package com.soumya.restfulwebservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.restfulwebservices.entity.Student;

@RestController
public class StudentController {
	
	@GetMapping("/get/all/students")
	public List<Student> getAllStudents(){
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1000L,"RAM",23,"DELHI"));
		students.add(new Student(1001L,"SHYAM",25,"KOLKATA"));
		students.add(new Student(1002L,"NAVEEN",22,"ROHTAK"));
		students.add(new Student(1003L,"KUNAL",23,"MUMBAI"));
		students.add(new Student(1004L,"ROSHNI",23,"CHANDIGARH"));
		
		return students;

	}

}
