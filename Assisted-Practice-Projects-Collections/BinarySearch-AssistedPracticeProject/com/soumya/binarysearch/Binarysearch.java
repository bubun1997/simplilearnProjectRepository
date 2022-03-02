package com.soumya.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {

		int arr[] = {3,6,9,10,10,13};

		int length = arr.length;

		int start = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter key for Binary search : ");
		int key = scanner.nextInt();
		
			//binarySearch(arr, start, key, length);  // custom binary logic
		
	    int  index =	Arrays.binarySearch(arr, key); // predefine binary logic
	     if(index<0) {
	    	 System.out.println("Element not found");
	    	 return;
	     }

			System.out.println("Element found at index "+index);
	}
	
	

public static void binarySearch(int[] arr, int start, int key, int length){

        int midValue = (start+length)/2;
        while(start<=length){

            if(arr[midValue]<key){

                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }

}

}
