package com.data_structures.datastructures;

public class ThreadedBinaryTree {
	static Child root = null;
	static int inorder[] = new int[50];
	static int size = 0;

	static void printInorder(Child root) {
		if (root == null)
			return;
		printInorder(root.left);
		inorder[size] = root.key;
		size++;
		System.out.print(root.key + " ");
		printInorder(root.right);
	}

	static void printArray() {
		for (int i = 0; i < size; i++)
			System.out.print(inorder[i] + " ");
	}

	public static void main(String[] args) {
		ThreadedBinaryTree.root = new Child(10);
		ThreadedBinaryTree.root.left = new Child(11);
		ThreadedBinaryTree.root.right = new Child(12);
		ThreadedBinaryTree.root.left.left = new Child(13);
		ThreadedBinaryTree.root.left.right = new Child(14);
		System.out.print("INORDER TRAVERSAL :");
		ThreadedBinaryTree.printInorder(root);
		System.out.println();
		ThreadedBinaryTree.printArray();
//		System.out.print("PREORDER TRAVERSAL :");
//		BinarySearchTree.printPreorder(root);
//		System.out.println();
//		System.out.print("POSTORDER TRAVERSAL :");
//		BinarySearchTree.printPostorder(root);

	}

}

class Child2 {
	int key;
	Child left, right;
	boolean rightThread = true;

	public Child2(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}
