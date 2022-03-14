package tree;

import java.util.LinkedList;
import java.util.Queue;

//import java.util.ArrayList;

//import java.util.ArrayList;

public class Mirror_of_tree {
	public static void main(String[] args) {
//		java.util.ArrayList<Integer> s = new java.util.ArrayList<Integer>();
		Node root = new Node('A');
		root.left = new Node('D');
		root.right = new Node('C');
		root.left.left = new Node('B');
		root.left.right = new Node('D');
		root.right.right = new Node('E');
		printPre(root);
		mirror(root);
		System.out.println("ss");
		printPre(root);
		BFS(root);
	}

	static void printPre(Node no2) {
		if (no2 == null)
			return;
		printPre(no2.left);
		System.out.print(" " + (char) no2.val);
		printPre(no2.right);

	}

	static void mirror(Node root) {
		if (root == null)
			return;
		mirror(root.left);
		mirror(root.right);
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		return;
	}

	static void BFS(Node root) {
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		while (root != null) {
			Node temp  = qu.poll();
			System.out.print(" "+temp.data);
			if(temp.left!=null) {
				qu.add(temp.left);
			}
			if(temp.right!=null) {
				qu.add(temp.right);
			}
		}
	}
}
