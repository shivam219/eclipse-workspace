package stack;

import java.util.Stack;

public class Stack_2 {
	public static void main(String[] args) {
		Stack<Integer> top=new Stack<>();
		top.add(10);
		top.add(20);
		top.add(30);
		top.add(40);
		top.add(50);
		System.out.println(top);
		int aa=top.capacity();System.out.println(aa);
		System.out.println(top.peek());
		
	}
}
