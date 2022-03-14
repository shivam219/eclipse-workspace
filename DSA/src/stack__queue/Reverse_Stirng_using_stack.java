package stack__queue;

import java.util.Stack;

public class Reverse_Stirng_using_stack {
	String s = "shivam";

	public static void main(String[] args) {
		Reverse_Stirng_using_stack ob = new Reverse_Stirng_using_stack();
		String s1 = new String("abcd");
		Stack<String> s2 = new Stack<String>();
		String s = Rev(s1, s2);
		System.out.println(s);
	}

//local dataype contains address of m 
	public static String chage(String m) {
		m = new String("suraj");
		return m;
	}

	public static String Rev(String s1, Stack<String> st) {
		int n = s1.length() - 1;
		String s = "";
		int i = 0;
		while (i <= n) {
			st.push(String.valueOf(s1.charAt(i)));
			i++;
		}
		i = 0;
//		 boolean anyNonEmpty = !map.values().stream().allMatch(List::isEmpty);
		for (; i <= s1.length() - 1; i++) {
			String t = st.pop();
			s += t;
		}
		return s;
	}
}
