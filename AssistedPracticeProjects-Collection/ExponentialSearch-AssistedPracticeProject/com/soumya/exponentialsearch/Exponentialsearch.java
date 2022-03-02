package com.soumya.exponentialsearch;


import java.util.Arrays;
import java.util.Scanner;

public class Exponentialsearch
{

	static int exponentialSearch(int arr[],int n, int x)
	{
		if (arr[0] == x)
			return 0;
	
		
		int i = 1;
		while (i < n && arr[i] <= x)
			i = i*2;
	
		return Arrays.binarySearch(arr, i/2,Math.min(i, n-1), x);
	}
	
	public static void main(String args[])
	{
		int arr[] = {5,8,9,12,16};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to be searched : ");
		int key = sc.nextInt();
		int result = exponentialSearch(arr,arr.length, key);
		
		System.out.println((result < 0) ?
		"Element is not present in array" :
		"Element is present at index " +result);
	}
}

