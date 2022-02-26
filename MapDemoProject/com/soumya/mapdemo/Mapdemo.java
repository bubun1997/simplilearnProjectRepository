package com.soumya.mapdemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Mycomparator implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
	   if(i1>i2)
		    return -1;
	   else if(i1<i2)
		   return 1;
	   else 
		   return 0;
		   
	}
}
public class Mapdemo {

	public static void main(String[] args) {
		Map<Integer,String> mapDemo1 = new HashMap<Integer,String>();// All the objects will be stored in hashtable based on hashcode of keys
		
		mapDemo1.put(1, "one");
		mapDemo1.put(2, "Two");
		mapDemo1.put(3, "Three");
		mapDemo1.put(new Integer("3"), "New Three");//here as key is duplicated so it will replace the old value with the new value which is associated with this key

		Set<Map.Entry<Integer,String>> entrySet = mapDemo1.entrySet();
		
		Iterator<Map.Entry<Integer,String>> itr=entrySet.iterator();
		
		System.out.println("***Printing key and values base on hashcode values of keys***");
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+"....."+entry.getValue());
		}
		
		Map<Integer,String> mapDemo2 = new TreeMap<Integer,String>(new Mycomparator()); // All the objects will be inserted based on our own customized sorting order provided by comparator object 
		
		mapDemo2.put(1, "one");
		mapDemo2.put(2, "Two");
		mapDemo2.put(3, "Three");
		mapDemo2.put(new Integer("3"), "New Three");//here as key is duplicated so it will replace the old value with the new value which is associated with this key
        
		entrySet=mapDemo2.entrySet();
		itr=entrySet.iterator();
		
		System.out.println("***Printing key and values base on decreasing order of keys***");
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+"....."+entry.getValue());
		}
	}
}
