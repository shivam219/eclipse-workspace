//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}this approach is good when you only need to deal value and counts
package string;

import java.util.HashMap;
import java.util.Map;

public class Write_programm_to_mini_windows_size {
	public static String findSubString(String str) {
		int n = str.length();
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		map2.putAll(map);
		String res = "";
		int j = 0;int base = 0;int count = 0;
		for(int i = 0; i<n;i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {}
			else {
				map.put(ch, 1);
				map2.put(ch, 1);
		}}
		int size = map.size();
		while (j < n) {
			char ch = str.charAt(j);
			if(map.containsKey(ch)) {
				count++;
				map.remove(ch);
			}
			if(count == size) {
				res= str.substring(base, j+1);
				System.out.println(res);
				base++; count = 0;
				j= base -1;
				map.putAll(map2);
			}	
			j++;
		}
		return res;
	}
	public static void main(String[] args) {
		String str = "aabcdbca";
		System.out.println("Smallest window containing all distinct" + " characters is: " + findSubString(str));
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		map.put('a', 2);
		map.put('b', 3);
		map.put('c', 4);
		if ((map.get(str.charAt(0))) > 1) {
			System.out.println("hii");
		}
		System.out.println(map);
		map1.putAll(map);
		System.out.println(map1);
	}
}

//		for (int i = 0; i < n; i++) {
//			if (mp.containsKey(str.charAt(i))) {
//				Integer a = mp.get(str.charAt(i));
//				mp.put(str.charAt(i), a + 1);
//			} else {
//				mp.put(str.charAt(i), 1);
//			}
//		}boyerler plat code