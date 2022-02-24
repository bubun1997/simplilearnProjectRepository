package com.soumya.collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

class Employee
{
	private int empId;
	private String empName;
	Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public int getId()
	{
		return this.empId;
	}
	public String getName()
	{
		return this.empName;
	}
	public void getDetails()
	{
		System.out.println("Employee Id : "+this.empId+" , "+"Employee Name : "+this.empName);
	}
}

public class Testcollection {

	public static void main(String[] args) {
				
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(101,"Tom"));
		employeesList.add(new Employee(102,"David"));
		employeesList.add(new Employee(103,"Jack"));
		
		System.out.println("***Collection of Employee Details Using List***");
		
		for(Employee emp:employeesList)
			emp.getDetails();
		
		LinkedList<String> countryCollections = new LinkedList<String>();
		countryCollections.add("India");
		countryCollections.add("Usa");
		countryCollections.add("Russia");
		countryCollections.add("England");
		
		Iterator<?> itr;
        itr=countryCollections.iterator();
        
        System.out.println("***Collection of  countries***");
        
        while(itr.hasNext())
        	System.out.println(itr.next());
        
        Stack<Integer> evenNumbers = new Stack<Integer>();
        
        for(int i=1;i<=20;i+=1)
        {
        	if(i%2==0)
        		evenNumbers.push(i);
        	
        }
        System.out.println("***Collection of Even Numbers from 20 to 1 in reverse order**** ");
        
         while(!evenNumbers.empty())
        	System.out.println(evenNumbers.pop());
        
        
        Set<Integer> integerCollection = new HashSet<Integer>();
        integerCollection.add(102);
        integerCollection.add(2000);
        integerCollection.add(2565);
        integerCollection.add(-256);
        integerCollection.add(new Integer("2565"));//not added as set doesn't allows duplicate values

        itr=integerCollection.iterator();
        
        System.out.println("***collection of Integer Objects***");
        while(itr.hasNext())
        	System.out.println(itr.next());

        
        Map<Integer,String> employeeEntries = new HashMap<Integer,String>();
        
		for(Employee emp:employeesList)
		{
			employeeEntries.put(emp.getId(), emp.getName());	
		}
		
		Set<Entry<Integer,String>> empEntry =  employeeEntries.entrySet();
		
		System.out.println("****Collection of Employee Details using Map****");
		for(Entry<Integer,String> e:empEntry)
		{
			System.out.println("Employee Id : "+e.getKey()+" , "+"Employee Name : "+e.getValue());
		}
		



		


        
	}

}
