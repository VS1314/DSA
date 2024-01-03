package com.vasanth.javaprograms.bharat.trees;

public class BinarySearchTree {

	public BSTNode insertRecursive(BSTNode root, int data) {
		if (root == null) {
			return new BSTNode(data);
		}
		if (data < root.getData()) {
			root.setLeft(insertRecursive(root.getLeft(), data));
		} else if (data > root.getData()) {
			root.setRight(insertRecursive(root.getRight(), data));
		}
		return root;
	}

	public BSTNode insert(BSTNode root, int data) {
		return insertRecursive(root, data);
	}

	public void inOrder(BSTNode node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(" " + node.getData());
			inOrder(node.getRight());
		}
	}

	public void preOrder(BSTNode node) {
		if (node != null) {
			System.out.print(" " + node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	public void postOrder(BSTNode node) {
		if (node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(" " + node.getData());

		}
	}

	public int max(BSTNode root) {
		int max = 0;
		if (root != null) {
			int lMax = max(root.getLeft());
			int rMax = max(root.getRight());
			if (lMax > rMax) {
				max = lMax;
			} else {
				max = rMax;
			}
			if (root.getData() > max) {
				max = root.getData();
			}
		}
		return max;
	}

	public boolean search(BSTNode root, int data) {
		if (root == null) {
			return false;
		}
		if (root.getData() == data) {
			return true;
		}
		return search(root.getLeft(), data) || search(root.getRight(), data);
	}

	public int depth(BSTNode root) {
		if (root == null) {
			return 0;
		}
		int lDepth = depth(root.getLeft());
		int rDepth = depth(root.getRight());
		return (lDepth > rDepth) ? lDepth + 1 : rDepth + 1;
	}

	public int size(BSTNode root) {
		int lCount = root.getLeft() == null ? 0 : size(root.getLeft());
		int rCount = root.getRight() == null ? 0 : size(root.getRight());
		return lCount + rCount + 1;
	}

	public BSTNode find(BSTNode root, int data) {
		if (root == null) {
			return null;
		}
		if (data < root.getData()) {
			return find(root.getLeft(), data);
		} else if (data > root.getData()) {
			return find(root.getRight(), data);
		}
		return root;
	}

	public BSTNode findMin(BSTNode root) {
		if (root == null) {
			return null;
		} else if (root.getLeft() == null) {
			return root;
		} else {
			return findMin(root.getLeft());
		}
	}
	
	public BSTNode findMax(BSTNode root) {
		if (root == null) {
			return null;
		} else if (root.getRight() == null) {
			return root;
		} else {
			return findMax(root.getRight());
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		BSTNode root = tree.insert(null, 5);
		root = tree.insert(root, 3);
		root = tree.insert(root, 4);
		root = tree.insert(root, 2);
		root = tree.insert(root, 6);
		root = tree.insert(root, 7);
		root = tree.insert(root, 8);

		tree.inOrder(root);
		System.out.println();
		tree.preOrder(root);
		System.out.println();
		tree.postOrder(root);
		System.out.println();
		System.out.println(tree.max(root));
		System.out.println(tree.search(root, 1));
		System.out.println(tree.depth(root));
		System.out.println(tree.size(root));
		System.out.println(tree.find(root, 7));
		System.out.println(tree.findMin(root));
	}

}
