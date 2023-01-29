package com.data_structures.datastructures;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	static Node start = null;

	static void insert() throws NumberFormatException, IOException {
		Node ptr1 = Node.createNode();
		out.println("\nenter the data in the node :");
		ptr1.data = Integer.parseInt(in.readLine());
		if (start == null) {
			start = ptr1;
		} else {
			Node ptr2 = start;
			while (ptr2.next != null)
				ptr2 = ptr2.next;
			ptr2.next = ptr1;
			ptr2 = ptr1;
		}
	}

	static void display() {
		if (start == null)
			out.println("list is empty");
		else {
			Node ptr = start;
			while (ptr.next != null) {
				out.print(ptr.data + "-->");
				ptr = ptr.next;
			}
			out.print(ptr.data + "\n");
		}
	}

	static void delete() {
		if (start == null)
			out.println("list is empty");
		else {
			Node ptr = start;
			while (ptr.next.next != null) {
				ptr = ptr.next;
			}
			ptr.next = null;
			System.gc();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		while (true) {
			out.println("====================================================================");
			out.println("Enter 1 for entering inside the linked list at the end");
			out.println("Enter 2 for deleting the linked list at the end");
			out.println("Enter 3 for printing linked list ");
			out.println("Enter 4 for exiting");
			int choice = Integer.parseInt(in.readLine());
			out.println("====================================================================");
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}

class Node {
	int data;
	Node next;

	static Node createNode() {
		Node node = new Node();
		node.data = 0;
		node.next = null;
		return node;
	}
}
