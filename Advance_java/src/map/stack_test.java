package map;

import java.util.Stack;

public class stack_test {

	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		st.add('a');
		st.add('b');
		st.add('c');
		Character peek =  st.peek(); // last element == peek 
		System.out.println(peek+"\n"+st);
	}

}
