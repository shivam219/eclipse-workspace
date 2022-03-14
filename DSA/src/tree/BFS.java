package tree;
import java.util.ArrayList;
import java.util.Scanner;
public class BFS {
	static Scanner sc = new Scanner(System.in);
	static Node root = null;
private  ArrayList<Integer> leftView(Node ro,boolean flag) {
	if(ro==null){ return null  ;}
	if(flag) 
		System.out.println(ro.data); ar.add(ro.data);
//	leftView(ro.left, false);
	 leftView(ro.right, true);
	return null;	
}
//List<Integer> ar2 = new<Integer>();
static ArrayList<Integer> ar =  new ArrayList<Integer>();
	public static void main(String[] args) {
//		[1,2,3,null,5,null,4]
		Node ro = new Node(1);
		ro.left = new Node(2);
//		ro.left.left = new Nod(1);
//		ro.left.right = new Nod(5);
//		ro.left.right.left = new Nod(5);
		ro.right = new Node(2);
//		ro.right.right= new Nod(2);//--ri
//		ro.right.left.left = new Nod(2);
//		root = createTree();
		BFS ob= new BFS();
//		ob.printLevelOrder();
	
		ob.leftView(ro,true);
		System.out.println(ar);
	}
	static Node createTree() {
		Node root = null;
		System.out.println("Enter data");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new Node(data);
		System.out.println("Enter left " + data);
		root.left = createTree();
		System.out.println("Enter right " + data);
		root.right = createTree();
		return root;
	}void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			CurLevel(root, i);
		}
	int height(Node root) {
		if (root == null)
			return 0;
		else {
			int Lhit = height(root.left);
			int Rhit = height(root.right);
			if (Lhit > Rhit)
				return (Lhit + 1);
			else
				return (Rhit + 1);
		}
	}
	void CurLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			CurLevel(root.left, level - 1);
			CurLevel(root.right, level - 1);
		}
	}
	
	
}