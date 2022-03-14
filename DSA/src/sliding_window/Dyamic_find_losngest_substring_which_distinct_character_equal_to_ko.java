package sliding_window;

import java.util.*;

public class Dyamic_find_losngest_substring_which_distinct_character_equal_to_ko {

	public static void main(String[] args) {
		String str = ("aabccqrs");
		//             01234567 5- 0 ;
		int j = 0, i = 0, count = 0, k = 3;
		int cur = 0;
		int max = 0;
		char ch;
		Map<Character, Integer> map = new HashMap<>();
		while (j < str.length()) {
			ch = str.charAt(j);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
			count = map.size();
			if (count == k + 1) {
				map.remove(str.charAt(j));
				count = map.size();
				j--;
				cur = j - i;
				if (max < cur)
					max = cur;

				map.remove(str.charAt(i));
				i++;

			}

			j++;

		}
		System.out.println("maxium longest duplicat " + (max+1));
	}

}
