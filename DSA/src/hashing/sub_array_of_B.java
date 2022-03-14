package hashing;

import java.util.ArrayList;

public class sub_array_of_B {

	public static void main(String[] args) {
		sub_array_of_B ob = new sub_array_of_B();
		int[] arr = { 1, 2, 3, 2, 3, 1 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int n : arr) {
			al.add(n);
		}
		System.out.println(ob.solve(al,2));
	}

	public int solve(ArrayList<Integer> A, int B) {
		if (B == 0) {
			return 0;
		}
		int n = A.size();
		for (int i = 0; i < n - 1; i++) {
			int val1 = A.get(i);
			int odd = 0;
			if (val1 % 2 != 0) {
				++odd;
			}
			subArray(A, i + 1, odd, B);
		}
		return sub;
	}

	static int sub = 0;

	public void subArray(ArrayList<Integer> A, int l, int odd, int B) {
		for (int i = l; i < A.size(); i++) {
			int val1 = A.get(i);
			if (val1 % 2 != 0) {
				++odd;
			}
			if (odd == B) {
				sub++;
			}
			
		}
	}
}
