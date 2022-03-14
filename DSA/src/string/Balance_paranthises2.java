package string;

import java.util.Stack;

public class Balance_paranthises2 {
	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.length() % 2 == 0) {
				char p = str.charAt(i);
				if (p == '{' || p == '[' || p == '(') {
					st.push(p);
				}
				if (st.isEmpty())
					return false;
				char check;
				switch (p) {
				case ')':
//					String expr = "([{}])";
					check = st.pop();

					break;
				case '}':
					check = st.pop();

					break;
				case ']':
					check = st.pop();

					break;

				}

			}
		}
		return (st.isEmpty());
	}

	public static void main(String[] args) {
System.out.println("check weather given string is balance or not");
System.out.println(isBalanced("{[]}}"));

	}
}
