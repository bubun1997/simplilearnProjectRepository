package com.soumya.laptop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.soumya.Student.Student;

@Entity
@Table(name="laptops")
public class Laptop {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laptopId;
	
	private String laptopName;
	
	@ManyToOne
	private Student student;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", student=" + student + "]";
	}
	
	

}
