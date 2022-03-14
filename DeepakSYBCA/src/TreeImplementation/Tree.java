package TreeImplementation;

import java.util.Scanner;

public class Tree {
	
	
	 static Scanner sc=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Node root=createtree();
		sc=new Scanner(System.in);

	   Node root= createtree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		
		
	}
	
	static Node createtree() {
		
		Node root=null;
		System.out.println("enter data :");
		int data=sc.nextInt();
		
		if(data==-1) return null;
		root=new Node(data);
		System.out.println("enter left for "+data);
		root.right=createtree();
		System.out.println("enter right for "+data);
		root.right=createtree();
		
		return root;
		
	}
	
    static void inOrder(Node root) {
    	if(root==null) return ;
    	inOrder(root.left);
    	System.out.print(root.data+" ");
    	inOrder(root.right);
    }
    static void preOrder(Node root) {
    	if(root==null) return;
    	System.out.print(root.data+" ");
    	preOrder(root.left);
       	preOrder(root.right);
    }
    static void postOrder(Node root) {
    	if(root==null) return;
    	postOrder(root.left);
    	postOrder(root.right);
    	System.out.print(root.data+" ");
    }
}

class Node{
	Node left,right;
	
	 int data;
	public Node(int data) {
		this.data=data;
	}
}
