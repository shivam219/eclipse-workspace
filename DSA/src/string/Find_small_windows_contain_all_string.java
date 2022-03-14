package string;

import java.util.HashMap;
import java.util.Map;

public class Find_small_windows_contain_all_string {
	static String smallwindows(String str, char[] pat) {
//		Map<Character, Integer> map = new HashMap<>();
		int n = pat.length, j = 0;
		int m = str.length(), i = 0;
		int size = 0, idx = 0; String s = " ";
		int cnt =  0; int min = 0 , max= 0;
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map1 = new HashMap<>();
		map1.putAll(map);
		for (Character ch : pat) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		size = map.size();
		for(i = 0; i< m; ) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				if(map.get(ch)>1)// get check value is greater then 1
					map.put(ch, map.get(ch)-1);
				else 
					map.remove(ch);
			}
			size = map.size();
			
			if(size == 0 ) {
				s = str.substring(idx, i);
				max = s.length();
				if(min<max) min = max;
				System.out.println(min);
				map.putAll(map1);;
				i = cnt++; idx ++;
			}
			i++;
			size = map.size();
		}

		return "";
	}

	public static void main(String[] args) {
		String str = "this is a test ";
		char[] pat = { 't', 'i', 's', 't' };
		smallwindows(str, pat);

	}

}
