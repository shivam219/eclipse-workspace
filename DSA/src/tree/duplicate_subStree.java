package tree;

import java.util.HashSet;

public class duplicate_subStree {

	static char MARKER = '$';

	// This function returns empty string if tree
	// contains a duplicate subtree of size 2 or more.
	public static String dupSubUtil(Node root, HashSet<String> subtrees) {
		String s = "";
 		if (root == null)
			return s + MARKER;
		String lStr = dupSubUtil(root.left, subtrees);
		if (lStr.equals(s))
			return s;
		String rStr = dupSubUtil(root.right, subtrees);
		if (rStr.equals(s))
			return s;
		s = s + root.val + lStr + rStr;
		// If current subtree already exists in hash
		// table. [Note that size of a serialized tree
		// with single node is 3 as it has two marker
		// nodes.
		if (s.length() > 3 && subtrees.contains(s))
			return "";

		subtrees.add(s);
		return s;

	}

	public static String dupSub(Node root) {
		HashSet<String> subtrees = new HashSet<>();
		return dupSubUtil(root, subtrees);
	}

	public static void main(String args[]) {
		Node root = new Node('A');
		root.left = new Node('B');
		root.right = new Node('C');
		root.left.left = new Node('D');
		root.left.right = new Node('E');
		root.right.right = new Node('B');
		root.right.right.right = new Node('E');
		root.right.right.left = new Node('D');
		String str = dupSub(root);
		if (str.equals(""))
			System.out.print(" Yes ");
		else
			System.out.print(" No ");
		printPre(root);
	}
	
	static void printPre(Node no2) {
		if (no2 == null)
			return;
		printPre(no2.left);
		System.out.print(" " + (char) no2.data);
		printPre(no2.right);

	}
}
