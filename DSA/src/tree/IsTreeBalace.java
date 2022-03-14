package tree;

public class IsTreeBalace {
	public static void main(String[] args) {
		
	}
	static int f;
	int height(Node root) {
		if (root == null)
			return 0;
		int x = height(root.left);
		int y = height(root.right);
		return (Math.max(x, y) + 1);
	}
int isBalanced(Node root) {
		f = 1;
		height(root);
		return f;
	}
}
