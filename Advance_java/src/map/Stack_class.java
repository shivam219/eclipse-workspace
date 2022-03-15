package map;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");// " " is the delimiter here.
		while (st.hasMoreTokens()) {
			String s1 = st.nextToken();
			System.out.println(s1);
		}

		System.out.println("The loop has been ended");

		while (sc.hasNext()) {
			String input = sc.next();
			Stack<Character> stacky = new Stack<>();
			for (int i = 0; i < input.length(); i++) {
				if (!stacky.isEmpty()) { // n = 0 ==true !true - false , n = 1 == false - !false -true
					switch (input.charAt(i)) { // {{}- i == {
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
