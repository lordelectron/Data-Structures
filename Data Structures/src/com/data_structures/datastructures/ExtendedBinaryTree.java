package com.data_structures.datastructures;

public class ExtendedBinaryTree {

	static InternalNode root = new InternalNode(1);

	static void printInorder(InternalNode root) {
		if (root == null) {
			root = new InternalNode(-1);
			System.out.print(root.key + " ");
		}

		else {
			printInorder(root.left);
			System.out.println(root.key);
			printInorder(root.right);
		}

	}

	static void printPostorder(InternalNode root) {
		if (root == null)
			return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.key + " ");
	}

	void printTree(InternalNode root) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root.left = new InternalNode(2);
		root.right = new InternalNode(3);
		root.left.left = new InternalNode(4);
		System.out.println("INORDER :	");
		printInorder(root);
		System.out.println("\nPOSTORDER	:	");
		printPostorder(root);

	}
}

class InternalNode {
	int key;
	InternalNode left, right;

	InternalNode(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}