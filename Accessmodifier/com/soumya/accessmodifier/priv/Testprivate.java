//**** PROGRAM TO ILLUSTRATE ACCESS OF MEMBERS DECLARED WITH PRIVATE ACCESS MODIFIER **** //
// **** We can access any private members of a class only within the same class , outside of that class we can't access **** //
package com.soumya.accessmodifier.priv;

class Priv
{
	static private int dataValue=10;
	private void privateMethod()
	{
		System.out.println("I am a private method from class Priv");
	}
	public void privateMemberAccess()
	{
		System.out.println("I am private varibale of class Priv my value is = "+dataValue);
		this.privateMethod();
	}
}
public class Testprivate {

	public static void main(String[] args) {
		Priv privObj = new Priv();
		
		//System.out.println(Priv.dataValue); Results in an error, as we are trying to access private field dataValue of class Priv outside of the class Priv
       // privObj.privateMethod(); Results in an error, as we are trying to access private instance method privateMethod() of class priv outside of the class Priv
	   
		//***** Way of Accessing Private members of a class ***** //
		privObj.privateMemberAccess();
		
	}

}
