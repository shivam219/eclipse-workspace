package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZipZap_traversal {
	public static void main(String[] args) {
//		Node root = new Node(1);
//		root.left = new Node(2);
//		root.right = new Node(6);
		Node root = new Node(4);
		root.left = new Node(5);
		root.right = new Node(8);
//		root.left.left = new Node(3);
//		root.left.right = new Node(4);
//		root.right.right = new Node(7);
//		root.right.left = new Node(5);
		System.out.println("left view");
		ZikZak(root);
		System.out.println(ar);
		
	}
	static ArrayList<Integer> ar = new  ArrayList<Integer>();
	static void ZikZak(Node root) {
		if (root == null)
			return;
		Stack<Node> sL = new Stack<Node>();
		Stack<Node> sR = new Stack<Node>();
		boolean flag = true;
		Node temp = null;
		sL.add(root);
		while (!sL.isEmpty() || !sR.isEmpty()) { // return fals when data is in queue
			int n = Math.max(sL.size(), sR.size());
			for (int i = 1; i <= n; i++) {
				if (flag) {
					temp = sL.pop();
				} else
					temp = sR.pop();
//				System.out.print( " - "+temp.data );
			ar.add(temp.data);
				
				if (flag) {
					if (temp.left != null) {
						sR.add(temp.left);
					}
					if (temp.right != null) {
						sR.add(temp.right);
					}
				} else {
					if (temp.right != null) {
						sL.add(temp.right);
					}
					if (temp.left != null) {
						sL.add(temp.left);
					}
				}
			}
			if (flag)
				flag = false;
			else
				flag = true;
		}

	}
}