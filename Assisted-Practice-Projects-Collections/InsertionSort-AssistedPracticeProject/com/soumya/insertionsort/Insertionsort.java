package com.soumya.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort 
{
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) 
		{
			int key = arr[i];
			int j = i - 1;

			
			while (j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = {2,5,1,-6,0,20,15,19,100,99,-10,-10};
        Scanner sc = new Scanner(System.in);

        System.out.println("Array before Insertion sort : ");
		printArray(arr);

		Insertionsort ob = new Insertionsort();
		ob.sort(arr); // sorting via insertion sort

        System.out.println("Array after Insertion sort : ");
        printArray(arr);
        
        System.out.print("Enter element to be searched : ");
		int key = sc.nextInt();
	    int res = Arrays.binarySearch(arr, key);
	    
	    if(res<0)
	    {
	    	System.out.println("Element not found");
	    	return;
	    }
	    System.out.println("Element found at index : "+res);
	}
}