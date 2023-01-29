package com.datastructures.problems;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchoolProblem {
	static Student head = null;

	static void sortList() {
		Student current = head, index = null;
		long temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = current.next;
				while (index != null) {
					if (current.rollNumber > index.rollNumber) {
						temp = current.rollNumber;
						current.rollNumber = index.rollNumber;
						index.rollNumber = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	static void removeDuplicateRollNumber() {
		Student current = head, index = null, temp = null;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				temp = current;
				index = current.next;
				while (index != null) {
					if (current.rollNumber == index.rollNumber) {
						temp.next = index.next;
					} else {
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	static void addStudent(BufferedReader in, int maxData, int i) throws IOException {
		Student student = Student.createStudent();
		out.println("Enter the data for student number " + (i + 1) + " : ");
		out.print("Name : ");
		student.name = in.readLine().toUpperCase();
		out.print("Roll Number : ");
		student.rollNumber = Long.parseLong(in.readLine());
		out.print("department : ");
		student.department = in.readLine().toUpperCase();
		out.print("Marks : ");
		student.marks = Integer.parseInt(in.readLine());
		out.println("****************************************");
		if (head == null)
			head = student;
		else {
			Student ptr = head;
			while (ptr.next != null)
				ptr = ptr.next;
			ptr.next = student;
			ptr = student;
		}
		sortList();
		removeDuplicateRollNumber();
	}

	static void passDisplayList() {
		Student ptr = head;
		System.out.println(
				"=========================================================================================================================================================================\n");
		out.printf("||%20s%20s||", "NAME", " ");
		out.printf("%20s%20s||", "ROLL NUMBER", " ");
		out.printf("%20s%20s||", "DEPARTMENT", " ");
		out.printf("%20s%20s||", "MARKS", " ");
		out.println(
				"\n=========================================================================================================================================================================\n");
		while (ptr.next != null) {
			if (ptr.marks >= 40) {
				out.printf("||%20s%20s||", ptr.name, " ");
				out.printf("%20s%20s||", ptr.rollNumber, " ");
				out.printf("%20s%20s||", ptr.department, " ");
				out.printf("%20s%20s||", ptr.marks, " ");
				out.println(
						"\n=========================================================================================================================================================================\n");
			}
			ptr = ptr.next;
		}
		if (ptr.marks >= 40) {
			out.printf("||%20s%20s||", ptr.name, " ");
			out.printf("%20s%20s||", ptr.rollNumber, " ");
			out.printf("%20s%20s||", ptr.department, " ");
			out.printf("%20s%20s||", ptr.marks, " ");
			out.println(
					"\n=========================================================================================================================================================================\n");
		}
	}

	static void failDisplay() {
		Student ptr = head;
		System.out.println(
				"=========================================================================================================================================================================\n");
		out.printf("||%20s%20s||", "NAME", " ");
		out.printf("%20s%20s||", "ROLL NUMBER", " ");
		out.printf("%20s%20s||", "DEPARTMENT", " ");
		out.printf("%20s%20s||", "MARKS", " ");
		out.println(
				"\n=========================================================================================================================================================================\n");
		while (ptr.next != null) {
			if (ptr.marks <= 40) {
				out.printf("||%20s%20s||", ptr.name, " ");
				out.printf("%20s%20s||", ptr.rollNumber, " ");
				out.printf("%20s%20s||", ptr.department, " ");
				out.printf("%20s%20s||", ptr.marks, " ");
				out.println(
						"\n=========================================================================================================================================================================\n");
			}
			ptr = ptr.next;
		}
		if (ptr.marks <= 40) {
			out.printf("||%20s%20s||", ptr.name, " ");
			out.printf("%20s%20s||", ptr.rollNumber, " ");
			out.printf("%20s%20s||", ptr.department, " ");
			out.printf("%20s%20s||", ptr.marks, " ");
			out.println(
					"\n=========================================================================================================================================================================\n");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		out.print("\nenter the maximum number of students : ");
		int maxData = Integer.parseInt(in.readLine());
		for (int i = 0; i < maxData; i++)
			addStudent(in, maxData, i);
		out.println("                                                                   data entry completed");
		out.println(
				"=========================================================================================================================================================================\n");
		out.println(
				"\n\n========================================================PASSED STUDENTS ARE===========================================================================\n");
		passDisplayList();
		out.println(
				"\n\n========================================================FAILED STUDENTS ARE============================================================================\n");
		failDisplay();
	}
}

class Student {
	String name;
	long rollNumber;
	String department;
	int marks;
	Student next;

	static Student createStudent() {
		Student student = new Student();
		student.name = null;
		student.rollNumber = 0;
		student.department = null;
		student.marks = 0;
		student.next = null;
		return student;

	}
}