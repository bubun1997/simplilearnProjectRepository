// ***** Program to illustrate access of members declared with public access modifier **** //
// ***** we can access members declared with public access modifier globally i.e within the same package anywhere we can access and also outside of the package anywhere it can be accessible , there is no restriction **** //
package com.soumya.accessmodifier.pub2;

import com.soumya.accessmodifier.pub1.Publicclass;

public class Testpublic {

	public static void main(String[] args) {
		
	   Publicclass publicClassObj = new Publicclass();// creating Publicclass instance
	   
       System.out.println("I am a public variable of class Publicclass my value is = "+Publicclass.dataValue); // accessing public variable dataValue of class Publicclass outside of package within which it is declared
       publicClassObj.publicMethod(); // accessing public method publicMethod() of class Publicclass outside of the package within which it is declared
       
	}

}
