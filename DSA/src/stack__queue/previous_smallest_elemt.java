package stack__queue;

import java.util.ArrayList;
import java.util.Stack;

public class previous_smallest_elemt {
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		ArrayList<Integer> B = new ArrayList<>();
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.size(); ++i) {
			while (!st.isEmpty() && arr.get(i) <= st.peek()) {
				st.pop();
			}
			if (st.isEmpty()) {
				B.add(-1);
			} else {
				B.add(st.peek());
			}
			st.add(arr.get(i));
		}

		return B;

	}public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,3,1,3};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int n : arr) {
			A.add(n);
		}
		System.out.println(prevSmaller(A));
		
	}
}
