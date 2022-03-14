package tree;

//Tree traversal in Java

class Node1 {

	int item;
	Node1 left, right; /// reference varible for class

	public Node1(int key) {
		item = key;
		left = right = null;
	}
}

public class Treel {
	// Root of Binary Tree
	Node1 root;

	Treel() {
		root = null;
		System.out.println("sviam" + root);
	}

	void postorder(Node1 node) {
		if (node == null)
			return;

		// Traverse left
		postorder(node.left);
		// Traverse right
		postorder(node.right);
		// Traverse root
		System.out.print(node.item + "->");
	}

	void inorder(Node1 node) {
		if (node == null)
			return;

		// Traverse left
		inorder(node.left);
		// Traverse root
		System.out.print(node.item + "->");
		// Traverse right
		inorder(node.right);
	}

	void preorder(Node1 node) {
		if (node == null)
			return;

		// Traverse root
		System.out.print(node.item + "->");
		// Traverse left
		preorder(node.left);
		// Traverse right
		preorder(node.right);
	}

	public static void main(String[] args) {
		Treel tree = new Treel();
		tree.root = new Node1(1);
		tree.root.left = new Node1(12);
		tree.root.right = new Node1(9);
		tree.root.left.left = new Node1(5);
		tree.root.left.right = new Node1(6);

		// System.out.println("Inorder traversal");
		// tree.inorder(tree.root);// sending root value

		// System.out.println("\nPreorder traversal ");
		// tree.preorder(tree.root);

		System.out.println("\nPostorder traversal");
		tree.postorder(tree.root);
	}
}