package tree;

public class Height_of_tree {
	public static void main(String[] args) {

	}

	int height(Node root) {
		if (root == null)
			return 0;
		int x = height(root.left);
		int y = height(root.right);
		return (Math.max(x, y) + 1);
	}
}