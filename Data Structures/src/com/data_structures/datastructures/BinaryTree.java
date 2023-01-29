package com.data_structures.datastructures;

public class BinaryTree {
	static Child root = null;

	static void printInorder(Child root) {
		if (root == null)
			return;
		printInorder(root.left);
		System.out.print(root.key + " ");
		printInorder(root.right);
	}

	static void printPreorder(Child root) {
		if (root == null)
			return;
		System.out.print(root.key + " ");
		printPreorder(root.left);
		printPreorder(root.right);
	}

	static void printPostorder(Child root) {
		if (root == null)
			return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.key + " ");
	}

	public static void main(String[] args) {
		BinaryTree.root = new Child(10);
		BinaryTree.root.left = new Child(11);
		BinaryTree.root.right = new Child(12);
		BinaryTree.root.left.left = new Child(13);
		BinaryTree.root.left.right = new Child(14);
		System.out.print("INORDER TRAVERSAL :");
		BinaryTree.printInorder(root);
		System.out.println();
		System.out.print("PREORDER TRAVERSAL :");
		BinaryTree.printPreorder(root);
		System.out.println();
		System.out.print("POSTORDER TRAVERSAL :");
		BinaryTree.printPostorder(root);

	}

}

class Child {
	int key;
	Child left, right;

	public Child(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}
