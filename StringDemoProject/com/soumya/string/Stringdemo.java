package com.soumya.string;


public class Stringdemo {

	public static void main(String[] args) {
		 System.out.println("*****Strings demo******");
         String str1 = new String("Hello");
         String str2 = new String("Hii");
         
         String str3 = str1.toUpperCase();
         String str4 = str2.concat(" How are You?");
         
         System.out.println("String 1 = "+str1);
         System.out.println("String 2 = "+str2);

         System.out.println("String 3 = "+str3);
         System.out.println("String 4 = "+str4);
         
         
         System.out.println("-------------------");
         
         System.out.println("---Converting string to stringbuffer---");
         StringBuffer sb1 = new StringBuffer(str3);
         StringBuffer sb2 = new StringBuffer(str4);
         StringBuffer sb3 = sb2;

         System.out.println("Stringbuffer 1 :"+sb1);
         System.out.println("Stringbuffer 2 :"+sb2);
         System.out.println("Stringbuffer 2 :"+sb3);

         sb1.append(" World");
         System.out.println("StringBuffer 1 after appending : "+sb1);
         sb2.delete(4, sb2.length());    
         System.out.println("Stringbuffer 3 after deleting some characters : "+sb3);
         System.out.println("Stringbuffer 2 after deleting some characters : "+sb2);

          sb3.reverse();
          System.out.println("StringBuffer 3 after reversing : "+sb3);
          System.out.println("StringBuffer 2 after reversing : "+sb2);
           
          System.out.println("--------------------------");
          System.out.println("---Converting string to stringbuilder---");
          
          StringBuilder sbl1 = new StringBuilder(str1);
          StringBuilder sbl2 = new StringBuilder(str2);
          
          System.out.println("StringBuilde 1 : "+sbl1);
          System.out.println("StringBuilder 2: "+sbl2);
          
          sbl1.append(" world");
          sbl2.reverse();
          
          System.out.println("StringBuilder 1 after appending : "+sbl1);
          System.out.println("StringBuilder 2 after reversing : "+sbl2);


          
          

        
	}

}
