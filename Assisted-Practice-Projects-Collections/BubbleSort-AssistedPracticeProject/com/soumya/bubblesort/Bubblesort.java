package com.soumya.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort 
{  
    static void bubbleSort(int[] arr) 
    {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
    	
                int arr[] ={10,8,60,-5,-2,120,0,1,56};  
                Scanner sc = new Scanner(System.in);

                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();
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