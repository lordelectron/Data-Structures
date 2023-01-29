package com.data_structures.datastructures;

public class MaxHeapTree {

	public static void main(String[] args) {
		int treeArray[] = { 10, 8, 16, 1, 9, 15, 21 };

	}

}

class MaxHeapNode {
	int key;
	MaxHeapNode left, right;

	MaxHeapNode(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}
