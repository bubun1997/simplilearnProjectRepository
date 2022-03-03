package com.soumya.diamondproblemresolve;

interface First
{
	void display();// overridden method
}
interface Second
{
	default void display()// overridden method
	{
		System.out.println("Inside Second interface default display method");
	}
}
interface Third
{
	default void display()// overridden method
	{
		System.out.println("Inside Third interface default display method");
	}
	
}
class Test implements First,Second,Third
{
	public void display()// overriding method
	{
		System.out.println("Inside Test class display method");
		Third.super.display();// calling Third interface display method from Test class display method
	}
}
public class Diamondproblem {

	public static void main(String[] args) {
		
          First firstIntefaceReference = new Test();
          firstIntefaceReference.display();// Test class display method is executed by jvm at runtime through First interface reference
          
          System.out.println("------------------------");
          
          Second secondIntefaceReference  = new Test();
          secondIntefaceReference.display();// Test class display method is executed by jvm at runtime through Second interface reference
          
          System.out.println("------------------------");

          Third thirdIntefaceReference  = new Test();
          thirdIntefaceReference.display();// Test class display method is executed by jvm at runtime through Third interface reference
	}

}
