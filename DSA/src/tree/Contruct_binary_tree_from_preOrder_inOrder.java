package tree;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Contruct_binary_tree_from_preOrder_inOrder {
	static Node no = null;

	public static void main(String[] args) {
		int pre[] = { 0, 1, 3, 4, 2, 5 };
		int in[] = { 3, 1, 4, 0, 5, 2 };
		no = treee(pre, in);
		printPre(no);

	}
	static void printPre(Node no2) {
		if (no2 == null)
			return;
		printPre(no2.left);
		System.out.print(" " + no2.data);
		printPre(no2.right);

	}
	static HashMap<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();// child class color turn to light greeen
	static Node treee(int pre[], int in[]) {
		for (int i = 0; i < in.length; i++) {
			m.put(in[i], i);
		}
		Node s = maketree( pre, 0, in.length - 1);
		return s;
	}
	static int preIndex = 0;

	static Node maketree( int pre[], int start, int end) {
		if (start > end)
			return null;
		int cur = pre[preIndex++];// can put in node
		Node nod = new Node(cur);
		if (start == end)
			return nod;
		int idx = m.get(cur);
		nod.left = maketree(pre, start, idx - 1);
		nod.right = maketree( pre, idx + 1, end);
		return nod;
	}
}
