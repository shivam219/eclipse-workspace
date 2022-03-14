package tree;

import java.util.LinkedList;
import java.util.Queue;
class No {
	int data;
	No left, right;
	public No(int item) {
		data = item;
		left = null;
		right = null;
	}
}
public class BFS_Queue {
	No root;
	void printLevelOrder() {
		Queue<No> queue = new LinkedList<No>();
		queue.add(root);
		while (!queue.isEmpty()) {
			No tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}}}
	public static void main(String args[]) {
		/* 
		 * creating a binary tree and entering the nodes
		 */
		BFS_Queue tree_level = new BFS_Queue();
		tree_level.root = new No(1);
		tree_level.root.left = new No(2);
		tree_level.root.right = new No(3);
		tree_level.root.left.left = new No(4);
		tree_level.root.left.right = new No(5);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.printLevelOrder();
	}
	
}
