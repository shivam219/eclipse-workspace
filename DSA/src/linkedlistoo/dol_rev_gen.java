package linkedlistoo;

import java.util.Scanner;
class ln<T> {
	T data;
	ln pre, next;

	public ln(T data) {
		this.data = data;
	}
}

public class dol_rev_gen {
	static ln head;//-dobly linked for previuse root send to next left
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ln root = CreateLink(head);
		System.out.println(printlink(root));
		ln pre = lenlin(root);
		System.out.println(printlnRev(pre));

	}

	private static String printlnRev(ln root) {
		if (root == null)
			return null;
		if (root.pre == null)
			return root.data + " End ";
		return root.data + " " + printlnRev(root.pre);
	}

	private static ln lenlin(ln root) {
		if (root == null)
			return null;
		else if (root.next == null)
			return root;
		return lenlin(root.next);
	}

	private static String printlink(ln root) {
		if (root == null)
			return "End";
		if (root.next == null)
			return root.data + " End";
		else
			return root.data + " " + printlink(root.next);
	}

	private static <T> ln CreateLink(ln head) {
		ln root = null;
		T t;
		System.out.println("Enter data ");
		t = (T) sc.next();
		if (t.equals(-1) || t.equals("-1"))
			return null;
		root = new ln<>(t);
		root.pre = head;
		head = root;
		root.next = CreateLink(head);
		return root;
	}
}