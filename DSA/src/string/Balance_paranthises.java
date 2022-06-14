package string;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class Balance_paranthises {
	static boolean balanced(String str) {
		Deque<Character> stack = new ArrayDeque<Character>();
		// traversing the expression
		if (str.length() % 2 != 0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				// push the element in the stack
				stack.push(x);
				continue;
			}
//}
			if (stack.isEmpty())
				return false;
			char ck;
			switch (x) {
			case ')':
//				String expire = "([{}])";
				ck = stack.pop();
				if (ck == '{' || ck == '[')
					return false;
				break;
			case '}':
				ck = stack.pop();
				if (ck == '(' || ck == '[')
					return false;
				break;
			case ']':
				ck = stack.pop();
				if (ck == '(' || ck == '{')
					return false;
				break;

			}

		}

		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		System.out.println("this is program to regex solution");
		String expr = "({[]})";

		// Function call
		if (balanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String pattern = "w+{10}";
//		Pattern p1= Pattern.compile(pattern);
//		
//		boolean b= Pattern.matches(pattern, str);
//		System.out.println(b);
//		System.out.println(str);
//		Deque<Integer> q = new ArrayDeque<>();
//		q.push(1);
//		q.push(2);
//		q.push(3);
//		q.push(4);
//		System.out.println(q.poll());
//		Stream m = q.stream();
//		m.forEach(e -> System.out.println(m));

	}
}
