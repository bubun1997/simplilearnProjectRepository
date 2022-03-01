package com.soumya.threadsynchronization;

import java.util.Scanner;
class Theater
{
	private int numberOfSeats=100;
	
	public  synchronized void bookSeats(String name) //synchronized method , all thread will execute this method one by one on the same instance of Theater class
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Hello "+name+" enter Number of Seats you want to book : ");
		int numberOfSeats = sc.nextInt();
		System.out.println("Processing your request....");
		try {
		Thread.sleep(3000);}
		catch(Exception e) {}
		if(this.numberOfSeats>=numberOfSeats) {
		   this.numberOfSeats = this.numberOfSeats-numberOfSeats;
		   System.out.println(numberOfSeats+" booked for you ");
		   System.out.println(this.numberOfSeats+" seats are left");
		   return;
		}
		System.out.println("Sorry not enough seats !!");
		System.out.println(this.numberOfSeats+" seats are left");
	}
}
class Customer implements Runnable
{
	private Theater theater;
	private String customerName;
	Customer(Theater theater,String customerName)
	{
		this.theater = theater;
		this.customerName = customerName;
	}
	public void run()
	{
	  this.theater.bookSeats(this.customerName);	
	}
}
public class Threadsynchronization {

	public static void main(String[] args) {
		
		System.out.println("***Welcome to my Theater***");
		Theater myTheater = new Theater();
		
		Runnable customer1 = new Customer(myTheater,"Tom");
		Runnable customer2 = new Customer(myTheater,"David");
		Runnable customer3 = new Customer(myTheater,"Sara");
		
		Thread myThread2 = new Thread(customer2);
		Thread myThread1 = new Thread(customer1);
	    Thread myThread3 = new Thread(customer3);
	    
	    myThread3.start();
	    myThread1.start();
	    myThread2.start();
				

          
	}

}
