// **** Program to illustrate access of members declared with protected access modifier **** //
// ***** We can access protected member of a class anywhere within the same package to which that class belongs and outside of the package within it's subclassess that too by the subclass reference if it is an instance member **** //
package com.soumya.accessmodifier.proc2;

import com.soumya.accessmodifier.proc1.Protectedclass;

class Subprotectedclass extends Protectedclass
{
	public void accessProtectedMembers()
	{
		System.out.println("I am protected member of class Protectedclass my value is = "+dataValue);
		this.protectedMethod();
	}
}
public class Testprotected {

	public static void main(String[] args) {
		
		Protectedclass protectedClassObj = new Protectedclass();//creating Protectedclass instance
		Subprotectedclass subProtectedClassObj = new Subprotectedclass();//creating Subprotectedclass instance
		
		// **** Accessing protected members through the superclass/originalclass reference  within which it is declared ****
		
		// System.out.println(Protectedclass.dataValue); Results in an error as we are trying to access the protected static variable datavlaue of class Protectedclass outside of the package and not within in any of its subclass.
		// protectedClassObj.protectedMethod(); Results in an error as we are trying to access protected instance method protectedMethod() of class Protecteclass outside of the package and not within any of its subclass.
		
		// **** Accessing protected members through the subclass reference ***** 
		
		// System.out.println(Subprotectedclass.dataValue); //Results in an error as we are trying to access the protected static variable datavlaue of class Protectedclass outside of the package and not within in any of its subclass.
	    // subProtectedClassObj.protectedMethod(); Results in an error as we are trying to access protected instance method protectedMethod() of class Protecteclass outside of the package and not within any of its subclass.
		
		// ********** Way of accessing protected members of a class ******** //
		 
		 subProtectedClassObj.accessProtectedMembers();
		
	}

}
