package com.datastructures.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Register {
	String stud[];
	static int cap;
	static int top;

	Register(int max) {
		cap = max;
		top = -1;
		stud = new String[cap];
	}

	void push(String s) {

		++top;
		stud[top] = s;
		System.out.println(s + " has been pushed in the register");
	}

	String pop() {
		String value;
		if (top == -1)
			return "$$";
		else {
			value = stud[top];
			--top;
			System.out.println(value + " has been poped in the register");
			return value;
		}
	}

	void display() {
		if (top == -1)
			System.out.println("REGISTER UNDERFLOW");
		else {
			for (int i = top; i >= 0; i--) {
				System.out.println("|	" + stud[i] + "|");
				System.out.println("-----------------------------");
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENTER THE MAXIMUM NUMBER OF ENTRIES : ");
		int max = Integer.parseInt(in.readLine());
		Register register = new Register(max);
		while (true) {
			System.out.println("ENTER 1 FOR PUSH");
			System.out.println("ENTER 2 FOR POP");
			System.out.println("ENTER 3 FOR DISPLAY");
			System.out.println("ENTER 4 FOR EXIT\n");
			System.out.print("ENTER YOUR CHOICE : ");
			int choice = Integer.parseInt(in.readLine());
			switch (choice) {
			case 1:
				if (top == cap - 1)
					System.out.println("REGISTER OVERFLOW");
				else {
					System.out.println("ENTER THE NAME OF STUDENT : ");
					String name = in.readLine();
					register.push(name);
				}
				break;
			case 2:
				register.pop();
				break;
			case 3:
				register.display();
				break;
			case 4:
				System.out.println("==============================THANK YOU=================================");
				System.exit(0);
				break;
			default:
				System.out.println("WRONG CHOICE");
				break;
			}
			System.out.println("========================================================================");

		}
	}

}
