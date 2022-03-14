package tree;

public class check_tree_is_subtree_of_another {
	public static void main(String[] args) {
		Node root = new Node('A');
		root.left = new Node('D');
		root.right = new Node('C');
		root.left.left = new Node('B');
		root.left.right = new Node('D');
		root.right.right = new Node('E');
		Node root2 = new Node('B');
		root.left = new Node('D');
		root.right = new Node('E');
		System.out.println(subtree(root, root2));
	
	}
	static boolean subtree(Node root , Node sub) {
		if(sub==null)return true;
		if(root==null)return false;
		if(identical(root,sub))
			return true;
		return (subtree(root.left, sub)|| subtree(root.right,sub));
	}
	 static boolean identical(Node root, Node sub) {
		 if(root==null && sub==null)return true;
		 if(root!=null && sub!=null) {
			 if(root.data==sub.data) {
				 return (identical(root.left, sub.left)&&identical(root.right, sub.left));
			 }
		 }
		return false;
	}
}
