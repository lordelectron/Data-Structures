package com.datastructures.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue {

	int Que[];
	int size;
	int front, rear;

	Queue(int mm) {
		size = mm;
		front = -1;
		rear = -1;
		Que = new int[size];
	}

	void addele(int v) {
		if (rear == size - 1) {
			System.out.println("QUE OVERFLOW");
		} else if (front == -1) {
			front = 0;
			rear = 0;
			Que[rear] = v;
			System.out.println(v + " has been insterted in the queue");
		} else {
			++rear;
			Que[rear] = v;
			System.out.println(v + " has been insterted in the queue");
		}
	}

	int delete() {
		int value;
		if (front == -1) {
			System.out.println("QUE UNDERFLOW");
			value = -9999;
		} else if (front == rear) {
			value = Que[front];
			front = -1;
			rear = -1;
		} else {
			value = Que[front];
			++front;
		}
		return value;
	}

	void display() {
		if (front == -1)
			System.out.println("QUE UNDERFLOW");
		else {
			for (int i = front; i <= rear; i++)
				System.out.print("| " + Que[i] + " |");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENTER THE MAXIMUM NUMBER OF ELEMENTS : ");
		int size = Integer.parseInt(in.readLine());
		Queue queue = new Queue(size);
		while (true) {
			System.out.println("ENTER 1 FOR ADDING ELEMENT");
			System.out.println("ENTER 2 FOR DELETING ELEMENT");
			System.out.println("ENTER 3 FOR DISPLAY");
			System.out.println("ENTER 4 FOR EXIT\n");
			System.out.print("ENTER YOUR CHOICE : ");
			int choice = Integer.parseInt(in.readLine());
			switch (choice) {
			case 1:
				System.out.println("ENTER THE ELEMENT : ");
				int ele = Integer.parseInt(in.readLine());
				queue.addele(ele);
				break;
			case 2:
				int value = queue.delete();
				if (value != -9999)
					System.out.println(value + " has been deleted from the queue");
				break;
			case 3:
				queue.display();
				break;
			case 4:
				System.out.println("==============================THANK YOU=================================");
				System.exit(0);
				break;
			default:
				System.out.println("WRONG CHOICE");
				break;
			}
			System.out.println("\n========================================================================");

		}

	}

}
