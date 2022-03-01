package com.soumya.polymorphism;

class Adder
{
	public int getSum(int num1,int num2)//overloaded method
	{
		return num1+num2;
	}
	public int getSum(int num1,int num2,int num3)//overloaded method
	{
		return num1+num2+num3;
	}
	public double getSum(double num1,double num2)//overloaded method
	{
		return num1+num2;
	}
}
class Vehicle
{
	//overridden method
	public void display()
	{
		System.out.println("I am a vehicle");
	}
}
class Bus extends Vehicle
{
	public void display()// overriding diaplay method of vehicle class
	{
		System.out.println("I am a Bus");
	}
}
class Car extends Vehicle
{
	public void display()// overriding diaplay method of vehicle class
	{
		System.out.println("I am a Car");
	}
}
public class Polymorphismdemo {

	public static void main(String[] args) {
		
		System.out.println("***compile time ploymorphism***");
		Adder add = new Adder();
		System.out.println("sum = "+add.getSum(10, -5, 2));// calling getsum() method with three int arguments
		System.out.println("sum = "+add.getSum(20.36,230.64333));// calling getsum() method with two double arguments
		System.out.println("sum = "+add.getSum(5,3));// calling getsum() method with two int arguments
        
		System.out.println();
		System.out.println("***Run time polymorphism***");
		
		Vehicle vehicleObj;
		
		vehicleObj = new Bus();// Runtime polymorphism, as parent type reference Vehicle is holding child type object which is of type Bus
		vehicleObj.display();// Runtime polymorphism or dynamic method dispatch as display() method of Bus will be executed at runtime by Jvm 
		
		vehicleObj = new Car();// Runtime polymorphism, as parent type reference Vehicle is holding child type object which is of type Car
		vehicleObj.display();// Runtime polymorphism or dynamic method dispatch as display() method of car will be executed at runtime by Jvm

		

	}

}
