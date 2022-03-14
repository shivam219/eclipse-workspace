package tree;

public class Binary_to_linked_list {

	
	public static void main(String[] args) {
		Binary_to_linked_list tree = new Binary_to_linked_list();
		Node root = null;
		root = new Node(10);
		root.left = new Node(12);
		root.right = new Node(15);
		root.left.left = new Node(25);
		root.left.right = new Node(30);
		root.right.left = new Node(36);
		inOrder(root);
		
	}
	static void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		
		inOrder(root.right);
	}
	
//	create  linked of then get one buy one values create dobly linked lisst
static l  pre = null;
static l next=  null;
} 

class l{
	int data; 
	l pre , next;
	public l(int data) {
		this.data = data;
	}
}