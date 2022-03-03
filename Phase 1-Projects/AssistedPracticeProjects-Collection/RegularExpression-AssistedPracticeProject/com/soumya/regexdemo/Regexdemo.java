package com.soumya.regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexdemo {

	public static void main(String[] args) {
		
		System.out.println("***Verify your mobile number***");
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Mobile Number : ");
        String mobileNumber = sc.nextLine();
       
        
        Pattern patternObj = Pattern.compile("[789][0-9]{9}");
        Matcher matcherObj = patternObj.matcher(mobileNumber);
        
        if(matcherObj.find()&&matcherObj.group().equals(mobileNumber))
               System.out.println("Valid Mobile Number");
        else
        	   System.out.println("Invalid Mobile Number");
        
	}

}
