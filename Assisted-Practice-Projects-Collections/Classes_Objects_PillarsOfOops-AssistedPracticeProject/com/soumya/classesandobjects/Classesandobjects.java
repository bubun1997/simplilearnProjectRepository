package com.soumya.classesandobjects;

class Mobile
{
	String brandName;
	String colour;
	String ramSize;
	String processorSize;
	double price;
	
	
	public Mobile(String brandName, String colour, String ramSize, String processorSize, double price) {
		this.brandName = brandName;
		this.colour = colour;
		this.ramSize = ramSize;
		this.processorSize = processorSize;
		this.price = price;
	}
	
	// getter method to get brand name of the laptop
	public String getBrandName() {
		return brandName;
	}
	// getter method to get colour of the laptop
	public String getColour() {
		return colour;
	}
	// getter method to get Ram size of the laptop
	public String getRamSize() {
		return ramSize;
	}
	// getter method to get processor size of the laptop
	public String getProcessorSize() {
		return processorSize;
	}
	// getter method to get price of the laptop
	public double getPrice() {
		return price;
	}

	// Overriding toString() method to genarate meaningful information abot Mobile Objects
	public String toString() {
		return "Mobile Biodata : [brandName=" + brandName + ", ramSize=" + ramSize + ", processorSize=" + processorSize + "]";
	}
	
	
}
public class Classesandobjects {

	public static void main(String[] args) {
		
		Mobile samsung = new Mobile("Samsung","Blue","4GB","Quad-Core",20000.00);// creating samsung instance
		Mobile oppo = new Mobile("Oppo-F9","Cyan","8GB","Octa-Core",23000.00); // creating oppo instance
		Mobile blackberry = new Mobile("Blackberry","Black","2GB","Dual-Core",12000.00); // creating blackberry instance
		Mobile realme = new Mobile("Realme-poco","Red","8GB","Octa-core",25000.00); // creating realme instance
		
		// Printing Information of different types of Mobile phones
		System.out.println(samsung);
		System.out.println(oppo);
		System.out.println(blackberry);
		System.out.println(realme);
         
		

		



	}

}
