package com.soumya.abstraction;

interface Bank
{
	double getDiscount();
	String getBankName();
}
class Hdfc implements Bank
{

	public double getDiscount() {
		return 0.05;
	}

	public String getBankName() {
		return "HDFC";
	}
	
}
class Sbi implements Bank
{

	
	public double getDiscount() {
		return 0.1;
	}

	public String getBankName() {
		return "SBI";
	}
	
}
public class Testabstraction {

	public static void main(String[] args) {
		
		Bank bank;
		String bankName=null;
		bank = new Sbi();
		bankName=bank.getBankName();//abstraction
        System.out.println(bankName+" is providing discount of : "+bank.getDiscount());//abstraction
        
        bank = new Hdfc();
		bankName=bank.getBankName();//abstraction
        System.out.println(bankName+" is providing discount of : "+bank.getDiscount());//abstraction


	}

}
