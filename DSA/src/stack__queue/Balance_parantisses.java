package stack__queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balance_parantisses {
	static boolean areBracketsBalanced(String x) {
		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < x.length(); i++) {
			char xx = x.charAt(i);
			if (xx == '(' || xx == '[' || xx == '{') {
				stack.push(xx);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char ch;
			switch (xx) {
			case ')':
				ch = stack.pop();
				if (ch != ')')
					return false;
				break;

			case '}':
				ch = stack.pop();
				if (ch != '}')
					return false;
				break;
			case ']': {
				ch = stack.pop();
				if (ch != ']')
					return false;
				break;
			}
			}
		}
		return (stack.isEmpty());
	}

	public static int  solve(String A) {
		Deque<Character> st = new ArrayDeque<Character>();
		for(int i = 0; i<A.length();i++) {
			char x = A.charAt(i);
			if(x=='(') {st.push(x);continue;}
			if(st.isEmpty()) {return 0;}
			switch (x) {
			case ')': char ch = st.pop();
					if(ch!='(') {
						return 0;
					}
				break;

			default:
				break;
			}
		}
		return 1;

	}

	public static void main(String[] args) {
		String expr = "(()((((()(";
		System.out.println(solve(expr)==1?"Balance":"Not");
		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

}
