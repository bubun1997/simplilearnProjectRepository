package com.soumya.mergesort;

import java.util.Arrays;
import java.util.Scanner;

public class Mergesort
{
	
	void merge(int arr[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		
		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
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
		int arr[] = {12,5,6,18,19,0,-2};
        Scanner sc = new Scanner(System.in);
		System.out.println("Given Array");
		printArray(arr);

		Mergesort ob = new Mergesort();
		ob.sort(arr, 0, arr.length - 1);// sorting via merge sort

		System.out.println("\nSorted array");
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
