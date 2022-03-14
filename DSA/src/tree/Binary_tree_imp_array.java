package tree;

public class Binary_tree_imp_array {
	public static void main(String[] args) {
		tree ob = new tree();
		ob.Root("A");
		ob.right("C", 0);
		ob.left("D", 1);
		ob.right("E", 1);
		ob.left("F", 2);
		ob.print_Tree();
	}
}
class tree {
	// Member variables of this class
	static int root = 0;
	static String[] str = new String[10];

	// Method 1
	// Creating root node
	public void Root(String key) {
		str[0] = key;
	}

	// Method 2
	// Creating left son of root
	public void left(String key, int root) {
		int t = (root * 2) + 1;
		if (str[root] == null) {
			System.out.printf("Can't set child at %d, no parent found\n", t);
		} else {
			str[t] = key;
		}
	}

	// Method 3
	// Creating right son of root
	public void right(String key, int root) {
		int t = (root * 2) + 2;
		if (str[root] == null) {
			System.out.printf("Can't set child at %d, no parent found\n", t);
		} else {
			str[t] = key;
		}
	}

	// Method 4
	// To print our tree
	public void print_Tree() {
		// Iterating using for loop
		for (int i = 0; i < 10; i++) {
			if (str[i] != null)
				System.out.print(str[i]);
			else
				System.out.print("-");
		}
	}
}
