package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class a {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		System.out.println(st.peek());
		Queue<Integer> ar = new LinkedList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		System.out.println(ar.peek());

	}

}
