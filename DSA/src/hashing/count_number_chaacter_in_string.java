package hashing;

import java.util.HashMap;

public class count_number_chaacter_in_string {
	public static void main(String[] args) {
		String str = "abcabcd";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch).intValue() +1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
