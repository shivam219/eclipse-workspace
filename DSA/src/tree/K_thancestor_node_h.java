package tree;

public class K_thancestor_node_h {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.left.left = new Node(4);
		root.left.right= new Node(3);
		root.left.right.left= new Node(1);
		root.left.right.right= new Node(2);
		root.right= new Node(11);
		System.out.println(an(root , new Node(1))?"\nThis are all node":"\n No nodes");
	}
	 static boolean an(Node root,Node t) {
		 if(root!=null) {
			 if(root.data == t.data)
				 return true;
			 if(an(root.left, t)||an(root.right, t)) {
				 System.out.print(root.data+ " ");return true;
			 }
		 }
		return false;
	}
}
