package string;

import java.util.HashMap;
import java.util.Map;

public class Small_windows_containt_all_characer {
	public static String minwindow(String s, String t) {
		if (s == null || t == null || s.isEmpty() || t.isEmpty())
			return "";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int i = 0, j = 0, count = map.size();
		int l = 0, r = s.length() - 1, min = s.length();
		boolean found = false;
		while (j < s.length()) {
			char ch = s.charAt(j++);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
				if (map.get(ch) == 0)
					count -= 1;
			}
			if (count > 0)
				continue;
			while (count == 0) {
				char st = s.charAt(i++);
				if (map.containsKey(st)) {
					map.put(st, map.get(st) + 1);
					if (map.get(st) > 0)
						count += 1;
				}
			}
			if ((j - i) < min) {
				l = i;
				r = j;
				min = j - i;
				found = true;
			}
		}
		return !found ? "" : s.substring(l - 1, r);
	}

	public static void main(String[] args) {
		String small = minwindow("this is test string tist", "tist");
		System.out.println(small);

	}
}
