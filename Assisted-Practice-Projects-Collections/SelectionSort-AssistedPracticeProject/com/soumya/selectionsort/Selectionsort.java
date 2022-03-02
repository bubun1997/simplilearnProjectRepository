package com.soumya.selectionsort;

import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
	
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
    	
        int[] arr1 = {20,25,15,12,26,-26,-5,0,1,100};  
        Scanner sc = new Scanner(System.in);

        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1)  
            System.out.print(i+" ");  
         
        System.out.println();
        System.out.print("Enter element to be searched : ");
		int key = sc.nextInt();
	    int res = Arrays.binarySearch(arr1, key);
	    
	    if(res<0)
	    {
	    	System.out.println("Element not found");
	    	return;
	    }
	    System.out.println("Element found at index : "+res);  
    }  
}  
