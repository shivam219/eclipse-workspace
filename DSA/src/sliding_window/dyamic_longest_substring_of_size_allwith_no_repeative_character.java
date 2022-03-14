package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class dyamic_longest_substring_of_size_allwith_no_repeative_character {
	public static void main(String[] args) {
		String str = "ababcohfgh";
//		String str1 = "ababcohfgh ";
		char ch;
		int i = 0, j = 0, cur = 0, max = 0, count = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (j < str.length()) {
			ch = str.charAt(j);
			if (map.containsKey(ch)) {
				j--;
				cur = j - i + 1;
				if (max < cur)
					max = cur;
				map.remove(str.charAt(i));
				i++;
				

			} else
				map.put(ch, 1);
			j++;
		}
		System.out.println(max);
	}
}
