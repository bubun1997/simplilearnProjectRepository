package com.soumya.doublylinkedlist;

public class Doublylinkedlisttraversal {

	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void push(int new_data) {
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;
		if (head != null)
			head.prev = new_Node;
		head = new_Node;
	}

	public void insertAfter(Node prev_Node, int new_data) {
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_Node.next;
		prev_Node.next = new_node;
		new_node.prev = prev_Node;
		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	void append(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
	}

	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {


		Doublylinkedlisttraversal dll = new Doublylinkedlisttraversal();
		
			dll.append(10);
			dll.push(23);
			dll.push(30);
			dll.push(56);
			dll.push(new Integer(20));

			dll.insertAfter(dll.head.next, 10);
			dll.printlist(dll.head);
			
			
			
			

	}

}