package linkedlistoo;
import java.util.Scanner;
class lin<T> {
	T data;
	lin right, left;
	public lin(T t) {
		this.data = t;
	}}
public class Singly_rev {
	lin head, tail = null;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		lin root = createRight();
	}
	private static String printLink(lin root) {
		if (root == null)
			return " End";
		if (root.right == null) {
			return root.data + " End";
		} else
			return root.data + " " + printLink(root.right);
	}
	private static <T> lin createRight() {
		T t;
		lin root = null;
		System.out.println("Enter data ");
		t = (T) sc.next();
		if (t.equals(-1) || t.equals("-1"))
			return null;
		root = new lin<>(t);
		System.out.println("Enter right");
		root.right = createRight();
		return root;
	}
}
