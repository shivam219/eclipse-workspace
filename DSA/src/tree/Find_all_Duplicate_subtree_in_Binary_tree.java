package tree;

import java.util.HashMap;

public class Find_all_Duplicate_subtree_in_Binary_tree {
	public static void main(String[] args) {
		Node root = null;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(2);
		root.right.left.left = new Node(4);
		root.right.right = new Node(4);
		printAllDups(root);
	}

	static HashMap<String, Integer> m;

	static String inorder(Node node) {
		if (node == null)
			return "";

		String str = "(";
		str += inorder(node.left);
		str += Integer.toString(node.data);
		str += inorder(node.right);
		str += ")";
		if (m.get(str) != null && m.get(str) == 1)
			System.out.print(node.data + " ");
		if (m.containsKey(str))
			m.put(str, m.get(str) + 1);
		else
			m.put(str, 1);
		return str;
	}
	static void printAllDups(Node root) {
		m = new HashMap<>();
		inorder(root);
	}
}
