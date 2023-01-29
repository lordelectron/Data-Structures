package com.data_structures.datastructures;

import java.io.IOException;

public class arrayBinaryTree {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the number of permited levels assuming that the root is level zero : ");
//		int level = Integer.parseInt(in.readLine());
		Tree tree = new Tree();
		// Tree tree = new Tree(level);
		tree.Root('A');
		tree.set_Left('B', 0);
		tree.set_Right('C', 0);
		tree.set_Left('D', 1);
		tree.set_Right('E', 1);
		tree.set_Left('F', 2);
		tree.set_Right('G', 2);
		tree.print_Tree();
	}
}

class Tree {

	static int root = 0;
//	static int level;
//	static int numberOfNodes;
	static char[] child = new char[15];

//	Tree(int level) {
//		Tree.level = level;
//		numberOfNodes = (int) (Math.pow(2, level) + 1);
//	}

	public void Root(char key) {
		child[0] = key;
	}

	public void set_Left(char key, int root) {
		int t = (root * 2) + 1;
		if (child[root] == ' ') {
			System.out.printf("Can't set child at %d, no parent found\n", t);
		} else {
			child[t] = key;
		}
	}

	public void set_Right(char key, int root) {
		int t = (root * 2) + 2;

		if (child[root] == ' ') {
			System.out.printf("Can't set child at %d, no parent found\n", t);
		} else {
			child[t] = key;
		}
	}

	public void print_Tree() {
		for (int i = 0; i < 15; i++) {
			if (child[i] != ' ')
				System.out.print(child[i]);
			else
				System.out.print('-');
		}
	}
}