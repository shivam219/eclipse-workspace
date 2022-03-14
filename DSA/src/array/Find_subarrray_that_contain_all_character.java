package array;

import java.util.HashMap;

public class Find_subarrray_that_contain_all_character {

	// all distinct characters
	public static String findSubString(String str) {
		int n = str.length();

		// Count all distinct characters.
		int dist_count = 0;
		HashMap<Character, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(str.charAt(i))) {
				Integer a = mp.get(str.charAt(i));
				mp.put(str.charAt(i), a + 1);
			} else {
				mp.put(str.charAt(i), 1);
			}
		}
		dist_count = mp.size();
		int size = Integer.MAX_VALUE;
		String res = "";

		// Now follow the algorithm discussed in below
		for (int i = 0; i < n; i++) {
			int count = 0;
			int visited[] = new int[256];
			for (int j = 0; j < 256; j++)
				visited[j] = 0;
			String sub_str = "";
			for (int j = i; j < n; j++) {
				if (visited[str.charAt(j)] == 0) {
					count++;
					visited[str.charAt(j)] = 1;
				}
				sub_str += str.charAt(j);
				if (count == dist_count)
					break;
			}
			if (sub_str.length() < size && count == dist_count) {
				res = sub_str;
				size = res.length();
			}
		}
		return res;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "aabcbcdbca";
		System.out.println("Smallest window containing all distinct" + " characters is: " + findSubString(str));
	}
}
