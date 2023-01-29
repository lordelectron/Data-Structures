package com.data_structures.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchTree {
	static BSTNode root = null;

	static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

//	static BSTNode BSTinsertion(BSTNode root, int key) {
//		if (root == null)
//			root = new BSTNode(key);
//		else if (root.key > key)
//			root.left = BSTinsertion(root.left, key);
//		else if (root.key <= key)
//			root.right = BSTinsertion(root.right, key);
//		return root;
//
//	}

	static BSTNode BSTinsertion(BSTNode root, int key) {
		if (root == null) {
			root = new BSTNode(key);
			return root;
		}
		BSTNode curr = root;
		BSTNode parent = null;
		while (curr != null) {
			parent = curr;
			if (key < curr.key)
				curr = curr.left;
			else
				curr = curr.right;
		}
		BSTNode newNode = new BSTNode(key);
		if (key < parent.key)
			parent.left = newNode;
		else
			parent.right = newNode;
		return root;
	}

	static void printInorder(BSTNode root) {
		if (root == null)
			return;
		printInorder(root.left);
		System.out.print(root.key + " ");
		printInorder(root.right);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int arr[] = { 10, 8, 16, 1, 9, 15, 21 };
		for (int key : arr) {
			root = BSTinsertion(root, key);
		}
		System.out.print("INORDER TRAVERSAL :");
		printInorder(root);
	}
}

class BSTNode {

	int key;
	BSTNode left, right;

	BSTNode(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}
