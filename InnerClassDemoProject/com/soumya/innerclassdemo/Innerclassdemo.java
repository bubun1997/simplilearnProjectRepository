package com.soumya.innerclassdemo;

class Outer
{
	private int data=10;
	public class Inner // Regular or Normal Inner class
	{
		private int data=20;
	   public void showData()
	   {
		   System.out.println("Inner data value : "+this.data);//20
		   System.out.println("Outer class data value : "+Outer.this.data);//10
	   }
	}
	public static class Staticnestedclass // Static nested class
	{
		public void display()
		{
			System.out.println("I am static nested class");
		}
	}
	
}
public class Innerclassdemo {

	
	public static void main(String[] args) throws InterruptedException {
          
		  // Regular or Normal Inner class
		  Outer outerObj = new Outer();
          Outer.Inner innerObj1 = outerObj.new Inner();//instantion of regular or normal inner class 
          innerObj1.showData();//accessing method showData of inner class
          
          // Static nested class 
          Outer.Staticnestedclass staticClassObj = new Outer.Staticnestedclass();//instantiation of static nested class
          staticClassObj.display();//accessing display method of static nested class 
          

	       class Methodlocal // Methodlocal Inner class
	       {
	    	   public void display()
	    	   {
	    		   System.out.println("I am a method local Inner class");
	    	   }
	       }
	       Methodlocal methodLocalObj = new Methodlocal();// instantiation of Method Local Inner class
	       methodLocalObj.display();// accessing display method of Method Local Inner class
            
	       // Anonymous Inner class
	       
	         Thread t=new Thread("MyThread")//instantiation of anonymous inner class which extends Thread class
	        		 {
	        	          public void run()
	        	          {
	        	        	  System.out.println(Thread.currentThread().getName()+" executed run() method");
	        	        	  
	        	          }
	        		 };

	         t.start();//starting thread MyThread
	}
}
