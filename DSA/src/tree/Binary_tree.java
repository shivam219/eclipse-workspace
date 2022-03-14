package tree;

import java.util.Scanner;
import java.util.Stack;

public class Binary_tree {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
//		System.out.println("L-RT-R");
//		inOrder(root);
//		System.out.println("RT-L-R");
//		preOrder(root);
//		System.out.println("L-R-RT");
//		postOrder(root);
		StackP(root);
	}

	static Node createTree() {
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new Node(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		System.out.println("Enter right for " + data);
		root.right = createTree();
		return root;
	}

	static void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	static void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	static void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
//BFS
	public static void StackP(Node root) {
		if (root == null)
			return;
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while (curr != null || s.size() > 0) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}

	}
}

class Node {
	Node left, right;
	int data;
	char val;

	public Node(char data) {
		this.val = data;
	}

	public Node(int data) {
		this.data = data;
	}
}