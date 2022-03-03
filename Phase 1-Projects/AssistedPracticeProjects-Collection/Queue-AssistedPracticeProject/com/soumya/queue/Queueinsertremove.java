package com.soumya.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queueinsertremove
{
	public static void main(String[] args) 
	{
        		Queue<String> locationsQueue = new LinkedList<String>();
        		
        		locationsQueue.add("Jaipur");
        		locationsQueue.add("Bengaluru");
        		locationsQueue.add("Delhi");
        		locationsQueue.offer("Kashmir");
        		locationsQueue.offer("Jalandhar");
        		
        		System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());// getting head element of the queue
        		String location = locationsQueue.remove();// removing head of queue
        		System.out.println(location+" is now removed from the Queue");// pritning head element of the queue
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());// printing size of the queue after removal
    }


}
