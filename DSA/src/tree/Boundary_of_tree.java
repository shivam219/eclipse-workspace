package tree;

import tree.Diago2.Node;

public class Boundary_of_tree {
	Node root;

	void printLeaves(Node node) {
		if (node == null)
			return;

		printLeaves(node.left);
		if (node.left == null && node.right == null)
			System.out.print(node.data + " ");
		printLeaves(node.right);
	}

		void printBoundaryLeft(Node node) {
		if (node == null)
			return;
		if (node.left != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		} else if (node.right != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}	}

	void printBoundaryRight(Node node) {
		if (node == null)
			return;
		if (node.right != null) {
			printBoundaryRight(node.right);
			System.out.print(node.data + " ");
		} else if (node.left != null) {
			printBoundaryRight(node.left);
			System.out.print(node.data + " ");
		}
	}

	void printBoundary(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		printBoundaryLeft(node.left);
		printLeaves(node.left);
		printLeaves(node.right);
		printBoundaryRight(node.right);
	}

	public static void main(String args[]) {
		Boundary_of_tree tree = new Boundary_of_tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.left.right = new Node(4);
		tree.root.left.left.right.left = new Node(8);
		tree.root.left.right = new Node(6);
		tree.root.left.right.right = new Node(5);
		tree.root.right = new Node(7);
		tree.root.right.right = new Node(9);
		tree.root.right.right.right = new Node(12);
		tree.root.right.left = new Node(10);
		tree.root.right.left.right = new Node(11);
		tree.printBoundary(tree.root);
	}
}
