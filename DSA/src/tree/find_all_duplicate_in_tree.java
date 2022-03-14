package tree;

public class find_all_duplicate_in_tree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right= new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		System.out.println(inorder(root));
	}

	static String inorder(Node node) {
		if (node == null)
			return "";

		String str = "(";
		str += inorder(node.left);
		str += Integer.toString(node.data);
		str += inorder(node.right);
		str += ")";
		return str;
	}
}
