package tree;

public class find_largest_subtree_summ_int_tree {
	public static void main(String[] args) {
		  Node root = new Node(1);
		    root.left = new Node(-2);
		    root.right = new Node(3);
		    root.left.left = new Node(4);
		    root.left.right = new Node(5);
		    root.right.left = new Node(-6);
		    root.right.right = new Node(2);
		 
		subtreeUtil(root);
		System.out.println(max);

	}

	static int max = Integer.MIN_VALUE;

	public static void subtreeUtil(Node root) {
		if (root == null)
			return;
		int n = subtree(root);
		if(n>max) 
			max = n;
		if(root.left!=null && root.right!=null) {
			subtreeUtil(root.left);
			subtreeUtil(root.right);
		}
		
	}

	public static int subtree(Node root) {
		if (root == null)
			return 0;
		int  n = root.data;
		return n + subtree(root.left) + subtree(root.right);
	}

}
