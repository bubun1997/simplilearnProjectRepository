// **** PROGRAM TO ILLUSTRATE ACCESS OF MEMBERS DECLARED  WITH DEFAULT ACCESS MODIFIER **** //
// **** We can access any default members of a class only within the same package to which that class belongs outside of that package we can't access **** //
package com.soumya.accessmodifier.def;

class Def
{
	static int dataValue=10;
	void defaultMethod()
	{
		System.out.println("I am default method from class Def");
	}
}

public class Testdefault {

	public static void main(String[] args) {
		
		System.out.println("I am a default variable of class Def my value is = "+Def.dataValue);// Accessing datavalue variable of class Def having default access modifier within the same package
       
		Def defObj = new Def(); // creating an Instance of Def class to call instance method testDefault()
       
		defObj.defaultMethod(); // Accessing instance method defaultMethod() of class Def having default accessmodifier within the same package
	}

}
