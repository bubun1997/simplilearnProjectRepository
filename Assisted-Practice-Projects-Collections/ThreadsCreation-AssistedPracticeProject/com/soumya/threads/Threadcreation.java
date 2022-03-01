package com.soumya.threads;

class Student extends Thread // Thread creation by extending Thread class
{
	private String studentName;
	Student(String name)
	{
		super(name);
		this.studentName=name;
	}
	public void run()
	{
		for(int i=1;i<=10;i+=1)
		  System.out.println(Thread.currentThread().getName()+" is executing run method");
		System.out.println(Thread.currentThread().getName()+" completed it's execution");
	}
	
}
public class Threadcreation {

	public static void main(String[] args) throws InterruptedException {
		 System.out.println("***Creation of Threads by extending Thread class***");
		 
         Student studentThread1 = new Student("Tom"); // Instantiating studentThread1
         Student studentThread2 = new Student("David");// Instantiating studentThread2
         
         studentThread1.start();// starting studentThread1
         studentThread2.start();// starting studentThread2
         
         studentThread1.join();
         studentThread2.join();
         
         System.out.println("***Creation of Threads by implementing Runnable Interface***");
         
         Runnable targetObject1 = new Runnable()// Instation of Anonymous Inner class Object which implements Runnable interface
        		 {
        	          public void run()
        	          {
        	        	  for(int i=1;i<=5;i+=1)
        	        		  System.out.println(Thread.currentThread().getName()+" is executing run()");
        	        	  System.out.println(Thread.currentThread().getName()+" completed it's execution");
        	          }
        		 };
        Runnable targetObject2 = new Runnable()// Instation of Anonymous Inner class Object which implements Runnable interface
        		{
		        	  public void run()
			          {
			        	  for(int i=1;i<=5;i+=1)
			        		  System.out.println(Thread.currentThread().getName()+" is executing run()");
			        	  System.out.println(Thread.currentThread().getName()+" completed it's execution");
			          }
        		};
        		
        		Thread runnableThread2 = new Thread(targetObject2,"Runnable-Thread2"); // Instatiation of runnableThread2 which targets the run method of targetObject2 Anonymous Inner class
        		Thread runnableThread1 = new Thread(targetObject1,"Runnable-Thread1"); // Instatiation of runnableThread1 which targets the run method of targetObject1 Anonymous Inner class

        		runnableThread2.start(); // starting runnableThread2
        		runnableThread1.start(); // starting runnableThread1
        		
        		// In all the cases we will get mixed Outputs as all the threads are running parallely....
         
         
	}

}
