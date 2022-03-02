package com.soumya.quicksort;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Quicksort
{
		static void swap(int[] arr, int i, int j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		static int partition(int[] arr, int low, int high)
		{
			
			// pivot
			int pivot = arr[high];
			
			
			int i = (low - 1);
		
			for(int j = low; j <= high - 1; j++)
			{
				
				if (arr[j] < pivot)
				{
					i++;
					swap(arr, i, j);
				}
			}
			swap(arr, i + 1, high);
			return (i + 1);
		}
		
		
		static void quickSort(int[] arr, int low, int high)
		{
			if (low < high)
			{
				int pi = partition(arr, low, high);
		
				quickSort(arr, low, pi - 1);
				quickSort(arr, pi + 1, high);
			}
		}

//Function to print an array
		static void printArray(int[] arr, int size)
		{
			for(int i = 0; i < size; i++)
				System.out.print(arr[i] + " ");
				
			System.out.println();
		}
	
		public static void main(String[] args)
		{
			int[] arr = {12,10,15,13,-5,0,1};
            Scanner sc = new Scanner(System.in);

			int n = arr.length;
			
			System.out.println("Before Sorting : ");
			printArray(arr, n);

			quickSort(arr, 0, n - 1);
			System.out.println("Sorted array after quick sort : ");
			printArray(arr, n);
			
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

