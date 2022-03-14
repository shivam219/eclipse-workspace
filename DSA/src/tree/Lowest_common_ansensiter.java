package tree;

import tree.Diago2.Node;

public class Lowest_common_ansensiter {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(6);
		root.left.left.left= new Node(4);
		root.left.left.right = new Node(5);
		root.right = new Node(7);
//		root.right.right = new Node(9);
//		root.right.right.right = new Node(12);
//		root.right.left = new Node(10);
//		root.right.left.right = new Node(11);
		Node r = LCA(root,4,5);
		System.out.println(r.data);
	}

	public  static Node LCA(Node root,int r , int l) {
		if(root ==null)return null;
		if(root.data == r || root.data==l) {
			return root;
		}
		Node left = LCA (root.left,r,l);
		Node right= LCA (root.right,r,l);
		if(left!=null&& right!=null) {
			return root;
		}
		else return left!=null?left:right;
	}
}
