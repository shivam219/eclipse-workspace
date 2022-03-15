package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class checking_parathis {
	public static void main(String[] args) {

//		HashMap<Character, Character> map = new HashMap<>();
//
//		map.put('(', ')');
//
//		map.put('[', ']');
//
//		map.put('{', '}');
//
//		/* Test each expression for validity */
//		System.out.println("S");
//		Scanner scan = new Scanner(System.in);
//	
//		while (scan.hasNext()) {
//
//			String expression = scan.next();
//
//			System.out.println(isBalanced(expression, map) ? "true" : "false");
//
//		}
//
//		scan.close();
//
//	}
//
//	private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
//
//		if ((expression.length() % 2) != 0) {
//
//			return false; // odd length Strings are not balanced
//
//		}
//
//		ArrayDeque<Character> deque = new ArrayDeque<>(); // use deque as a stack
//
//		for (int i = 0; i < expression.length(); i++) {
//
//			Character ch = expression.charAt(i);
//
//			if (map.containsKey(ch)) {
//
//				deque.push(ch);
//
//			} else if (deque.isEmpty() || ch != map.get(deque.pop())) {
//
//				return false;
//
//			}
//
//		}
//
////		return deque.isEmpty();
//		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
//		while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length())
//			;
//		System.out.println(input.isEmpty());

//		while (sc.hasNext()) {
//			String input = sc.next().replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
//			System.out.println(input.isEmpty());
//		}

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			Stack<Character> stacky = new Stack<>();
			for (int i = 0; i < input.length(); i++) {
				if (!stacky.isEmpty()) {
					switch (input.charAt(i)) {
					case '}':
						if (stacky.peek() == '{') {
							stacky.pop();
						}
						break;
					case ']':
						if (stacky.peek() == '[') {
							stacky.pop();
						}
						break;
					case ')':
						if (stacky.peek() == '(') {
							stacky.pop();
						}
						break;
					default:
						stacky.push(input.charAt(i));
					}
				} else {
					stacky.push(input.charAt(i));
				}
			}
			System.out.println(stacky.isEmpty());
		}
	}
}
