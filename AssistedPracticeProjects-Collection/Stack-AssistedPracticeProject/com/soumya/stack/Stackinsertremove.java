package com.soumya.stack;

public class Stackinsertremove
{ 
    	static final int MAX = 1000; 
    	int top; 
    	int a[] = new int[MAX];  
  	     boolean isEmpty() 
    	{ 
        		return (top < 0); 
    	} 
  	   Stackinsertremove() 
    	{ 
        		top = -1; 
    	} 
  	    boolean push(int x) 
    	{ 
        		if (top >= (MAX-1)) 
        		{ 
            			System.out.println("Stack Overflow"); 
            			return false; 
        		} 
        		else
        		{ 
            			a[++top] = x; 
            			System.out.println(x + " pushed into stack"); 
            			return true; 
        		} 
    	} 
       int pop() 
    	{ 
        		if (top < 0) 
        		{ 
            			System.out.println("Stack Underflow"); 
            			return 0; 
        		} 
        		else
        		{ 
            			int x = a[top--]; 
            			return x; 
        		} 
    	} 
    
    	public static void main(String args[])
        {
    		    Stackinsertremove s = new Stackinsertremove(); 
    		    System.out.println("***Pushing elements into the stack***\n");
        		s.push(25); 
        		s.push(100); 
        		s.push(-25); 
        		s.push(2);
        		s.push(100); 
        		System.out.println();
                System.out.println("***popping elements from the stack until stack is empty***\n");
                 while(! s.isEmpty())
        		    System.out.println(s.pop() + " Popped from stack"); 
    	}
} 	
