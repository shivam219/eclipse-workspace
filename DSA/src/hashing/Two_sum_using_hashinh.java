package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Two_sum_using_hashinh {
	public static void main(String[] args) {
		int ar[] = { 1, 3, 2 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int n : ar) {
			al.add(n);
		}
		
		int B = 4;
//		solve(al,B);
		List<Integer> a = Arrays.stream(ar).boxed().collect(Collectors.toList());
		System.out.println(diffPossible(a, B));

	}

	public static void solve(ArrayList<Integer> al, int b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int cur : al) {
			if (set.contains(b - cur)) {
				System.out.println(b - cur + " " + cur);
			}
			set.add(cur);
		}
	}

	public static int diffPossible(final List<Integer> list, int b) {
		HashSet<Integer> visited = new HashSet<Integer>();
		for (Integer number : list) {
			int aa = number + b;
			int cc = number - b;
			if (visited.contains(aa)) {
				return 1;
			}
			if (visited.contains(cc)) {
				return 1;
			}
			visited.add(number);
		}
		return 0;
	}
}
