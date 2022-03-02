package com.soumya.arrayrotation;

import java.util.Arrays;
import java.util.Scanner;

class Rotate
{
	void leftRotateArray(int[] arr,int numberOfRotations)// METHOD TO ROTATE 1-D ARRAY
	{
		int len=arr.length;
		for(int count=1;count<=numberOfRotations;count+=1)
		{
			for(int i=0;i<len;i++)
			{
				if(i==len-1)
					break;
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
		
	}
	void rotateArray(int[][] arr) // METHOD TO ROTATE 2-D ARRAY
	{
		int len=arr.length;
		int[][] x = new int[len][len];
		for(int i=0;i<len;i+=1)
		{
			for(int j=0;j<len;j+=1)
				x[i][j]=arr[j][i];
		}
		len=x.length;
		for(int i=0;i<len;i+=1)
		{
			for(int j=0;j<arr[i].length;j+=1)
			{
				arr[i][j]=x[i][j];
			}
		}
		
	}
}
public class Arrayrotation {

	public static void main(String[] args) {
         Rotate rotate = new Rotate();
         Scanner sc = new Scanner(System.in);
         System.out.println("***1-d array Rotation***");
         int[] oneDimensionalArray= {1,2,3,4,5,6,7};
         
         System.out.println("Before Rotating, 1-d Array Elements are : ");
         for(int elements:oneDimensionalArray)
        	 System.out.print(elements+" ");
         
         System.out.println();
         
         System.out.print("How many you want to rotate your 1-D array : ");
         int num=sc.nextInt();
         rotate.leftRotateArray(oneDimensionalArray, num);
         
         System.out.print("After Rotating, 1-d Array Elements are : ");
         for(int elements:oneDimensionalArray)
        	 System.out.print(elements+" ");
         System.out.println();
         System.out.println();

         System.out.println("***2-d array Rotation to make rows as columns and columns as rows***");
         int[][] twoDimensionalArray = {
        		 
        		 {2,3,5,6},{5,6,9,5},{7,8,9,2},{4,7,0,1}
         
         };
         System.out.println("Before Rotating, 2-d Array Elements are : ");
         for(int[] x1:twoDimensionalArray )
         {
        	 for(int elements:x1)
        		 System.out.print(elements+" ");
        	 System.out.println();
         }
         rotate.rotateArray(twoDimensionalArray);
         System.out.println("After Rotating, 2-d Array Elements are : ");
         for(int[] x1:twoDimensionalArray )
         {
        	 for(int elements:x1)
        		 System.out.print(elements+" ");
        	 System.out.println();
         }
        
	}

}
