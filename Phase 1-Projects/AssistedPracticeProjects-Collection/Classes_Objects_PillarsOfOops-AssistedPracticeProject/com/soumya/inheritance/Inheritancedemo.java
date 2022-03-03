package com.soumya.inheritance;

class Person
{
	String personName;
	int age;
    String weight;
	String adharId;
	public Person(String personName, int age, String weight, String adharId) 
	{
		this.personName = personName;
		this.age = age;
		this.weight = weight;
		this.adharId = adharId;
	}
	
}
class Doctor extends Person // IS-A relationship i.e A doctor is a person
{
	String designation;
	double visitCharge;
	boolean isSurgent;
	public Doctor(String doctorName,int age,String weight,String adharId,String designation,double visitCharge,boolean isSurgent)
	{
	   	super(doctorName,age,weight,adharId);
	   	
	   	this.designation=designation;
	   	this.visitCharge=visitCharge;
	   	this.isSurgent=isSurgent;
	}
	public String getDoctorName()
	{
		return this.personName;
	}
	public int age()
	{
		return this.age;
	}
	public String weight()
	{
		return this.weight;
	}
	public String getAdharNumber()
	{
		return this.adharId;
	}
	public String getDesignation() 
	{
		return designation;
	}
	
	public double getVisitCharge() 
	{
		return visitCharge;
	}
	
	public boolean isSurgent() 
	{
		return isSurgent;
	}
	
	public String toString()// overriding toString() method for meaningful information
	{
		return "Doctor Info : [ Name: "+this.personName+", Adhar Number : "+this.adharId+" , Designation: "+this.designation+" , is a surgent : "+this.isSurgent+" , visit charge :"+this.visitCharge+" ]";
	}
	
	
}
public class Inheritancedemo {

	public static void main(String[] args) {
		
		Person person1 = new Doctor("Tom",30,"70 l.b.s","101215698","Neurologists",500.00,true);// 1st Doctor instance which is also a person
		Person person2 = new Doctor("David",40,"65 l.b.s","70235695","Cardiologists",1000.00,false);// 2nd Doctor instance which is also a person
		Person person3 = new Doctor("Nathan",28,"60 l.b.s","60235698","Dentist",800.00,true);// 3rd doctor instance which is also a person
        
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person1);
       
       
	}

}
