package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Two_xor_equal_B {

	public static void main(String[] args) {
		int ar[] = { 3, 6, 8, 10, 15, 50 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int n : ar) {
			al.add(n);
		}
		;
		int B = 5;
//		System.out.println(solve(al, B));
	}

	static int xorPairCount(int arr[], int n, int x) {
		int result = 0; 
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int cur = x ^ arr[i];
			// If there exist an element in map m
			// with XOR equals to x^arr[i], that means
			// there exist an element such that the
			// XOR of element with arr[i] is equal to
			// x, then increment count.
			if (m.containsKey(cur))
				result += m.get(cur);
			// Increment count of current element
			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			} else {
				m.put(arr[i], 1);
			}
		}	return result;
	}
}
