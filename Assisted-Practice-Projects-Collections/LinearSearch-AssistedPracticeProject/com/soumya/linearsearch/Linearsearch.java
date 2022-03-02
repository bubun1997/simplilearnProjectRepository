package com.soumya.linearsearch;

import java.util.Scanner;

public class Linearsearch
{

	public static void main(String[] args) {


		int arr[] = {30,10,40,20,new Integer("50"),10};
		
		System.out.print("Enter key for linear search : ");
		Scanner  scanner = new Scanner(System.in);
		
		int key =	scanner.nextInt();
		
		int result =linearSearch(arr, key);
		
		if(result == -1) {
				
				System.out.println("Element not found");
				return;
				
			}
			
				
			System.out.println("Element found at index "+result);
			
			
			
	}
	
		public static int   linearSearch(int[] arr,int key) {
			
				int len = arr.length;
				
				int index = -1;
			
			for (int i = 0; i < len; i++) 
			{
				
				if(arr[i] == key) { // if key found in given array
					
					index = i;   // index value will update
					break;
				}
				
				
			}
			
			return index;
			
		}
	
	

}