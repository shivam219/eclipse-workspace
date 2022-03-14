package tree;

import java.util.Map;
import java.util.TreeMap;

public class Top_Bottom {
	static class pair {
		int dist, level;
		pair() {
		}
		pair(int i, int j) {
			dist = i;
			level = j;
		}
	}
	static TreeMap<Integer, pair> m = new TreeMap<>();
//	}// for bottom order just check  > to this <
	static void topView(Node root, int d, int l, TreeMap<Integer,pair> m) {
		if (root == null) return; 
		if ( m.get(d)==null||m.get(d).level < l) {
			m.put(d, new pair(root.data, l));
		}
		topView(root.left, d - 1, l + 1,m);
		topView(root.right, d + 1, l + 1,m);
	}
	static void printTopView(Node root) {
		topView(root, 0, 0,m);
		for (Map.Entry<Integer, pair> entry : m.entrySet()) {
			System.out.print(entry.getValue().dist + " ");
		}
	}
	public static void main(String args[]) {
		Node root = new  Node(1);//we cannot create innser class object in main method. we create exlipcitily a metod just to createing obkjct of inner class
		root.left = new  Node(2);
		root.right = new Node(3);
		root.left.right =new  Node(4);
		root.left.right.right = new  Node(5);
		root.left.right.right.right = new Node(6);
		System.out.println("Following are nodes in" + " top view of Binary Tree");
		printTopView(root);
	}

		
	
}