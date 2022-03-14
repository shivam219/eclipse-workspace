package tree;

import java.util.Stack;

public class find_sum_of_node_rootToleaf {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		k = 8;
		rootToSum(root);
		
	}

	static Stack<Integer> s = new Stack<Integer>();
	static int sum = 0 ,k;
	public static void rootToSum(Node root) {
		if(root==null)return;
		
		sum = sum+root.data;
		s.push(root.data);
		if(sum==k)
			System.out.println(s);
		if(sum>k)return ;/*more efficient*/
		rootToSum(root.left);
		rootToSum(root.right);
		sum = sum-root.data;
		s.pop();
	}

}
