package stack__queue;

import java.util.Stack;

public class find_next_greater_number {
	public static int[] printNGE(int arr[]) {
		Stack<Integer> s = new Stack<>();
		int nge[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			/*
			 * if stack is not empty, then pop an element from stack. If the popped element
			 * is smaller than next, then a) print the pair b) keep popping while elements
			 * are smaller and stack is not empty
			 */
			if (!s.empty()) {
				while (!s.empty() && s.peek() <= arr[i]) {
					s.pop();
				}
			}
			nge[i] = s.empty() ? -1 : s.peek();
			s.push(arr[i]);
		}
		return nge;
	}
	
	public static void main(String[] args) {
		int[] arr = { 11, 22, 44, 8 };
		int nge[] = printNGE(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " --> " + nge[i]);

	}
}
