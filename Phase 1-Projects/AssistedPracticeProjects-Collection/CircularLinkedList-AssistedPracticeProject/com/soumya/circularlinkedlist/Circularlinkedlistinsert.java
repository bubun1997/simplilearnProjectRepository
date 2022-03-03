package com.soumya.circularlinkedlist;

class Node
{
	int data;
	Node next;

	Node(int d)
	{
		data = d;
		next = null;
	}
}

public class Circularlinkedlistinsert
{
	Node head;

	Circularlinkedlistinsert() { head = null; }

	void sortedInsert(Node new_node)
	{
		Node current = head;

		if (current == null)
		{
			new_node.next = new_node;
			head = new_node;

		}

		else if (current.data >= new_node.data)
		{

			
			while (current.next != head)
				current = current.next;
			current.next = new_node;
			new_node.next = head;
			head = new_node;
		}

		else
		{

			while (current.next != head &&current.next.data < new_node.data)
				current = current.next;
			new_node.next = current.next;
			current.next = new_node;
		}
	}

	void printList()
	{
		if (head != null)
		{
			Node temp = head;
			do
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}

	public static void main(String[] args)
	{
		Circularlinkedlistinsert list = new Circularlinkedlistinsert();

		// Creating the linkedlist
		int arr[] = new int[] {15,13,12,17,19,6,100,98,0,-5};
		int len = arr.length;
		/* start with empty linked list */
		Node temp = null;

		System.out.println("Original list : ");
          for(int x:arr)
        	  System.out.print(x+" ");
          System.out.println();
		for (int i = 0; i < len; i++)
		{
			temp = new Node(arr[i]);
			list.sortedInsert(temp);
		}
		
		System.out.println("After sorting : ");
		list.printList();
	}
}

