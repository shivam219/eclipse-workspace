package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class first_repaeting_number {

	public static int solve(ArrayList<Integer> al) {
		int n = al.size();

		Set<Integer> st = new HashSet<>();
		int ans = -1;
		for (int i = n - 1; i >= 0; i--) {
			int a = al.get(i);
			if (st.contains(a)) {
				ans = a;
//				break;
			} else {
				st.add(a);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		System.out.println(solve(al));

	}
}
