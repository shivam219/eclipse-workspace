package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Largest_continue_sequence_zero_sum {
	public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
		Map<Integer, Integer> map = new HashMap<>();
		int left = 1, right = -1, cur = 0;
		map.put(0, -1);
		for (int i = 0; i < A.size(); i++) {
			cur += A.get(i);
			if (map.containsKey(cur)) {
				int l = map.get(cur) + 1;
				if (i - l > right - left) {
					left = l;
					right = i;
				}
			} else
				map.put(cur, i);
		}
		ArrayList<Integer> result = new ArrayList<>();
		if (left == -1)
			return result;
		for (int i = left; i <= right; i++)
			result.add(A.get(i));
		return result;
	}
	public static void main(String[] args) {
		Integer a[] =  {1 ,2 ,-2 ,4 ,-4};
		ArrayList<Integer> ar = new ArrayList<Integer>(); ar.add(1);ar.add(2);ar.add(-2); ar.add(2);ar.add(4);ar.add(-4);
	 System.out.println(	lszero(ar));
	}
}
