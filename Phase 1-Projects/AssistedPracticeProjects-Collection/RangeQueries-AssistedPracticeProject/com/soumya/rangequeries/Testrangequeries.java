package com.soumya.rangequeries;

import java.util.Scanner;

class Rangequery
{
	public int findSumOfElementsBetweenRange(int[] arr,int L,int R)
	{
		int sum=0;
		for(int i=L;i<=R;i+=1)
			sum+=arr[i]; // calculating sum between range L and R
		return sum; // Returning calculated sum between the range L and R
	}
}
public class Testrangequeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();// Reading array size from the user
		int[] arr = new int[size]; // Instantiating 1-d array with the specified size
		
		for(int i=0;i<size;i+=1)
		{
			System.out.print("Enter element "+(i+1)+" : ");
			int num=sc.nextInt();// Reading array elements from the user one by one
			arr[i]=num; // Adding element entered by the user into the array
		}
		
		while(true)
		{
			System.out.print("Enter min range : ");
			int L=sc.nextInt(); // getting min range
			System.out.print("Enter max range : ");
			int R=sc.nextInt(); // getting max range
			
			if(!(L>=0 && R<=size-1 && R>=L))
			{
				System.out.println("Invalid input !!");
				continue;
			}
			Rangequery range = new Rangequery();
			int sum = range.findSumOfElementsBetweenRange(arr,L,R);
			System.out.println("Sum between range "+L+" and "+R+" of the array is : "+sum); // Printing sum of the elements between the range L and R from the array
			break;
			
		}

	}

}
