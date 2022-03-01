// ********* Program to demonstrate Implicit and Explicit Typecasting *********

package com.soumya.typecasting;

public class Typecasting {

	public static void main(String[] args) {
		//Implicit Typecasting
		
		 byte byteValue1=123;
		 int intValue1=byteValue1; //Implicit Typecasting from byte to int
		 long longValue1=intValue1; //Implicit Typecasting from int to long
         float floatValue1=longValue1; //Implicit Typecasting from long to float
         double doubleValue1=floatValue1; //Implicit Typecasting from float to double
         
         System.out.println("****Implicit Typecasting****");

         System.out.println("bytevalue1= "+byteValue1);//123
         System.out.println("intvalue1= "+intValue1);//123
         System.out.println("longValue1= "+longValue1);//123
         System.out.println("floatvalue1= "+floatValue1);//123.0
         System.out.println("doublevalue1= "+doubleValue1);//123.0
         
         System.out.println("-----------------------------------");
         //Explicit Typecasting
         
         double doubleValue2=120.235;
         float floatValue2=(float)doubleValue2;//Explicit Typecasting from double to float
         long  longValue2=(long)floatValue2;//Explicit Typecasting from float to long
         int intValue2=(int)longValue2;//Explicit Typecasting from long to int
         byte byteValue2=(byte)intValue2;//Explicit Typecasting from int to byte
         
         System.out.println("****Explicit Typecasting****");

         System.out.println("bytevalue2= "+byteValue2);//120
         System.out.println("intvalue2= "+intValue2);//120
         System.out.println("longvalue2= "+longValue2);//120
         System.out.println("floatvalue2= "+floatValue2);//120.235
         System.out.println("doublevalue2= "+doubleValue2);//120.235

	}

}
