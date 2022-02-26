package com.soumya.array;

import java.util.Scanner;
public class Myarray {

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of your 1d array");
		int size = sc.nextInt();
		
		int[] oneDimensionalArray=new int[size];// 1d Array
		for(int i=0;i<oneDimensionalArray.length;i+=1)
		{
			System.out.print("Enter element "+(i+1)+" : ");
			oneDimensionalArray[i]=sc.nextInt();
		}
		System.out.println("***Your 1d array elements are***");
		
		for(int num:oneDimensionalArray)
			System.out.print(num+" ");
		
		int[][] twoDimensionalArray = {
				{2,5,6},
				{6,7},
				{5,8,9,100}
		
		};//2-d array
		System.out.println();
		System.out.println("***Your 2d array elements are***");

		for(int[] oneDimensionArray:twoDimensionalArray)
		{
			for(int num:oneDimensionArray)
				System.out.print(num+" ");
		}
		
		
	}

}
