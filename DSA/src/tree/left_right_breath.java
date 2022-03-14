package tree;

import java.util.LinkedList;
import java.util.Queue;

public class left_right_breath {
	public static void main(String[] args) throws InterruptedException {
//		[1,2,3,null,5,null,4]
		/*
		 * sample one Node ro = new Node(2); ro.left = new Node(3); ro.left.left = new
		 * Node(4); ro.left.right = new Node(6); ro.left.right.left = new Node(5);
		 * ro.right = new Node(7); ro.right.right= new Node(2); ro.right.left = new
		 * Node(8);
		 */
//		Node ro = new Node(1);
//		ro.left = new Node(2);
//		ro.left.left = new Node(3);
//		ro.left.right = new Node(4);
//		ro.left.right.left = new Node(8);
//		ro.left.right.left.left = new Node(6);
//		ro.left.right.left.right = new Node(7);
//		ro.right = new Node(7);
//		ro.right.right= new Node(2);
//		ro.right.left = new Node(8);
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.right = new Node(7);
		root.right.left = new Node(5);
//		printLeftView(root, true);
//		--proper working code
		System.out.println("left view");
		leftview(root);		
//		System.out.println();
//		System.out.println("breath view");
//		breath(root);
//		System.out.println();
//		System.out.println("right view");
//		rightview(root);
//		----------------
		topview(root, true, false, 1);
		
	}

//	 perfectly working code -- left view
	static void leftview(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 1; i <= n; i++) {
				Node tep = q.poll();
				if (i == 1) 
				System.out.print(tep.data +" - ");
				if (tep.left != null) 
					q.add(tep.left);
				if (tep.right != null)
					q.add(tep.right);
				
			}
		}
	}
	static void rightview(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 1; i <= n; i++) {
				Node tep = q.poll();
				if (i == 1) 
					System.out.print(tep.data +" - ");
				if (tep.right != null)
					q.add(tep.right);
				if (tep.left != null) 
					q.add(tep.left);
				
			}
		}
	}
// breath first search 
static void breath(Node root) {
	if (root == null)
		return;
	Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	while (!q.isEmpty()) {
		int n = q.size();
		for (int i = 1; i <= n; i++) {
			Node tep = q.poll();
			System.out.print(tep.data + " - ");
			if (tep.left != null) {
				q.add(tep.left);
			}
			if (tep.right != null) {
				q.add(tep.right);
			}
		}
	}
}
/// top - view -- needed some impovemetw
static void topview(Node root, boolean flag1,boolean flag2,int i) {
	if (root == null)
		return;
	if (flag1) {
		System.out.print(root.data + " - ");
	}
	if(flag2) {
		System.out.println(root.data);
	}
	if (root.left == null && root.right == null)
		return;
	topview(root.left, true,false, i++);
	topview(root.right, false,true ,i++);
}
static void topv(Node root,boolean flag, int i) {
	if (root == null)
		return;
	if (flag) {
		System.out.print(root.data + " - ");
	}
	if (root.left == null && root.right == null)
		return;
	topv(root.left, true,i+1);
	if(1==i) {
	topvR(root.right, false);}
}
static void topvR(Node root, boolean flag) {
	
	if (root == null)
		return;
	if (flag) {
		System.out.print(root.data + " - ");
	}
	if (root.left == null && root.right == null)
		return;
	topvR(root.right, true);
}

/// not gives proper result
	static void printLeftView(Node root, boolean flag) {
		if (root == null)
			return;
		if (flag) {
			System.out.print(root.data + " - ");
		}
		if (root.left == null && root.right == null)
			return;
		printLeftView(root.left, true);
		printLeftView(root.right, false);
	}
}
