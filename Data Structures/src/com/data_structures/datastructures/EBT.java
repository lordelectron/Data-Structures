package com.data_structures.datastructures;

public class EBT {

	static InternalNode2 root = new InternalNode2(1);

	static void printInorder(InternalNode2 root) {
		if (root == null) {
			return;
		}

		else {
			printInorder(root.left);
			System.out.print(root.key + "	");
			printInorder(root.right);
		}

	}

	static void addExternal(InternalNode2 root) {
		if (root == null)
			return;
		else if (root.key == -1)
			return;
		if (root.left == null)
			root.left = new InternalNode2(-1);
		else
			addExternal(root.left);
		if (root.right == null)
			root.right = new InternalNode2(-1);
		else
			addExternal(root.right);

	}

	public static void main(String[] args) {
		root.left = new InternalNode2(2);
		root.right = new InternalNode2(3);
		root.left.left = new InternalNode2(4);
		System.out.println("INORDER :	");
		printInorder(root);
		System.out.println("\n=================================\n");
		addExternal(root);
		System.out.println("INORDER :	");
		printInorder(root);
	}
}

class InternalNode2 {

	int key;
	InternalNode2 left, right;

	InternalNode2(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}