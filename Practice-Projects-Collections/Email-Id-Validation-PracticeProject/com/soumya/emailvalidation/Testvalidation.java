package com.soumya.emailvalidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Emailverifier
{
	private List<String> arrayOfEmails = new ArrayList<String>();
	private final Pattern EMAILPATTERN = Pattern.compile("[a-zA-Z0-9][a-zA-Z-0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

	public void setEmail(int size)//Method for adding Email-Ids into the list after validation
	{
		int count=1;
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			if(count==size+1)
				break;
			System.out.print("Enter  Email-Id : ");
			String email = sc.nextLine();
			Matcher matcherObj = EMAILPATTERN.matcher(email);
			
			if(matcherObj.find() && matcherObj.group().equals(email))
			{
				boolean flag=false;
				for(String emails:arrayOfEmails)
				{
					if(email.equalsIgnoreCase(emails))
					{
						flag=true;
						break;
					}
				}
				if(!flag) {
				arrayOfEmails.add(email);
				count+=1;
				continue;
				}
				System.out.println("Email-Id already exists , please enter a new Email-Id !!");
				continue;
			}
			else
			{
				System.out.println("Please enter a valid Email-Id !!");
				continue;
			}
		}
		System.out.println("Email-Id of all the employees added successfully....");
	}
	public String validateEmail(String emailForVerification)// Method to verify whether the given Email-Id is available within the list of Email-Id's after validation
	{
		Matcher matcherObj = EMAILPATTERN.matcher(emailForVerification);
		String message = "";
		
		try {
			System.out.println("Processing your request....");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
        if(matcherObj.find() && matcherObj.group().equals(emailForVerification))
        {
        	boolean flag=false;
        	for(String email:arrayOfEmails)
        	{
        		if(email.equalsIgnoreCase(emailForVerification))
        		{
        			message="Your Email-Id is Validted successfully and found in the given list of emails";
        			flag=true;
        			break;
        		}
        		
        	}
        	if(!flag)
        		message="Your Email-Id is not present !!";
        }
        else
        	message="Sorry can't validate , Invalid Email-Id !!";
        
        return message;
       		
	}
	
}
public class Testvalidation {

	public static void main(String[] args) {
		System.out.println("***Verify your Email id***");
		
		Scanner sc=new Scanner(System.in);
		Emailverifier emailVerifierObj = new Emailverifier();
		
		System.out.print("Please Enter the number of Employees whose email-id you want to add : ");
		int numberOfEmails = sc.nextInt();
		
		emailVerifierObj.setEmail(numberOfEmails);//adding Email-Ids into the array after validation
		
		sc.nextLine();
		
		System.out.print("Enter the email you want to search from your list of email-id's : ");
        String userEmail=sc.nextLine();
		
        System.out.println(emailVerifierObj.validateEmail(userEmail));//verifying whether the given email-Id is presenet in the array of Email-Id's after validation
		

	}

}
