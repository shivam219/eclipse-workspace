package linkedlistoo;
import java.util.Scanner;
class link {
	int data;
	link right, left;
	public link(int t) {
		this.data = t;
	}
}
public class dol_sort_int {
	static Scanner sc = new Scanner(System.in);
	static link head;// help to store previous node to left of next node
	public static void main(String[] args) {
		link root = createLink(head);
		System.out.println(printLink(root));
		sortList(root);
		System.out.println(printLink(root));
//		---Reverse OF Inter
		link pre = lenlin(root);
		System.out.println(printlnRev(pre));
//		---End of REverse
	}
	public static link lenlin(link root) {//give give lass eleted
		if(root ==null) return null;
		else if(root.right==null) return root;	
		return lenlin(root.right);
	}
	public static int lenlist(link root) {//
		int count = 1;
		while(root!= null||root==null) {
			if(root.right==null) {
				break;}
			count++;
			root= root.right;
		}
		return count;
	}
	public static String printlnRev(link root) {
		if(root==null)return null;
		if(root.left==null){
			return root.data+"End";
		}
		return root.data +" "+printlnRev(root.left);
		
	}
	public static void sortList(link head) {
		link current = head, index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = current.right;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.right;
				}
				current = current.right;
			}
		}
	}

	static String printLink(link root) {
		if (root == null)
			return " End";
		if (root.right == null) {
			return root.data + " End";
		} else
			return root.data + " " + printLink(root.right);
	}
// it for dobly - ended
	 static link createLink(link pre) {
		int t;
		link root = null;
		System.out.println("Enter data ");
		t = sc.nextInt();
		if (t == -1)
			return null;
		root = new link(t);
		root.left = pre;
		pre = root;
		System.out.println("Enter right");
		root.right = createLink(pre);
		return root;
	}
// it for singly- ended
	 static link createLink() {
			int t;
			link root = null;
			System.out.println("Enter data ");
			t = sc.nextInt();
			if (t == -1)
				return null;
			root = new link(t);
			System.out.println("Enter right");
			root.right = createLink();
			return root;
		}
	 /// for node like link
	public static String printLink(Nod root) {
		if(root==null)return null;
		if(root.right==null) return root.data +"End";
		return root.data + " "+ printLink(root.right);
	}
}
