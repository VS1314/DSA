package com.vasanth.javaprograms.telusko.tree;

public class BinaryTree {

	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if (root == null)
			root = new Node(data);
		else if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);
		return root;
	}

	public void inOrder() {
		inOrderRec(root);
	}

	public void inOrderRec(Node root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.print(root.data + " ");
			inOrderRec(root.right);
		}
	}
	
	public void preOrder() {
		System.out.println();
		preOrderRec(root);
	}

	public void preOrderRec(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
}
