package collection;

import java.util.Stack;
import java.util.Vector;

public class list_vector_class {
	public static void main(String[] args) {
		Vector<Integer> vr = new Vector<Integer>();
		vr.add(100);
		vr.add(100);
		vr.add(100);
		vr.add(100);
		
		System.out.println(vr);
		Stack<Integer> ar = new Stack<Integer>();
		ar.push(10);
		ar.push(12);
		ar.push(13);
		ar.push(14);
		System.out.println(ar);
	}
}
