package com.datastructure.sorting;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RadixSort {

	public static void main(String args[]) throws IOException {
		int arr[] = null;
		fillArray(arr);
		int largest = largestCalculator(arr);
		int digits = numberOfDigits(largest);
	}

	static int largestCalculator(int[] arr) {
		int temp = arr[0];
		for (int j : arr) {
			if (j > temp)
				temp = j;
		}
		return temp;
	}

	static int numberOfDigits(int largest) {
		int count = 0;
		while (largest != 0) {
			count++;
			largest = largest / 10;
		}
		return count;
	}

	static void fillArray(int arr[]) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(in.readLine());
		arr = new int[size];
		out.println("ENTER THE ARRAY ELEMENTS");
		for (int i : arr)
			i = Integer.parseInt(in.readLine());

	}

}

class Node {
	int data;
	Node next;

//	Node createNode() {
//		Node node = new Node();
//		Node arr[] = new Node[10];
//		for (Node i : arr) {
//			i = null;
//		}
//		return node;
//
//	}
}
