package tree;

import java.util.ArrayList;
import java.util.Stack;

import tree.Diago2.Node;

public class Boundary_trversal {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.left.right = new Node(4);
		root.left.left.right.left = new Node(8);
		root.left.right = new Node(6);
		root.left.right.right = new Node(5);
///left of root		
		root.right = new Node(7);
		root.right.right = new Node(9);
		root.right.right.right = new Node(12);
		root.right.left = new Node(10);
		root.right.left.right = new Node(11);
		
		Boudnary(root);
		System.out.println(ar);
	}

	public static void Boudnary(Node root) {
		leftview(root,1,true);
		System.out.println("dd");
		rightview(root.right,true);
		while(!s.isEmpty()) {
			ar.add(s.pop());
		}
	}
	static ArrayList<Integer> ar = new ArrayList<Integer>();
	public static void leftview(Node root ,int i,boolean flag) {
	if(root==null)return ;
	if(flag) {
	System.out.println(root.data);ar.add(root.data);
	}
	else {
		flag = false;
		if(root.left ==null && root.right==null) {
			System.out.println(root.data);ar.add(root.data);
		}	
	}
	leftview(root.left, i+1,flag);
	if(i==1)return ;
	leftview(root.right,i+1,false);
	
	}
	static Stack<Integer> s = new Stack<Integer>();
	public static void rightview(Node root,boolean flag) {
		if(root==null)return ;
		if(flag) {
		System.out.println(root.data);s.add(root.data);
		}
		else {
			flag = false;
			if(root.left ==null && root.right==null) {
				System.out.println(root.data);s.add(root.data);
			}	
		}
		rightview(root.right,flag);
		rightview(root.left,false);
	}
}
