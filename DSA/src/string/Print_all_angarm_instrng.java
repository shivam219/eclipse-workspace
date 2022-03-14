package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Print_all_angarm_instrng {
	static String prinall(String[] s) {
		Map<Integer, String> map = new HashMap<>();
		String s1[] = s;
		for (int i = 0; i < s.length; i++) {
			s[i] = sort(s[i]);
			map.put(i, s[i]);
		
		}
//		for (int j = 0; j < s.length; j++) {
//			if (map.get(j) != null) {
//				System.out.println(map.get(j));//cat
//			}
//		}
		Map<String, ArrayList<Integer>> reMap = new HashMap<>(map.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue)).values().stream()
				.collect(Collectors.toMap(item -> item.get(0).getValue(),
						item -> new ArrayList<>(item.stream().map(Map.Entry::getKey).collect(Collectors.toList())))));
		int si = reMap.size();
		for(int j = 0;j<si;j++) {
			
				System.out.println(reMap.get(j));
				
			
		}
		return null;
	}

	static String sort(String s) {
		char[] carr = s.toCharArray();
		Arrays.sort(carr);
		String reb = String.valueOf(carr);
		return reb;
	}

	public static void main(String[] args) {
		String wordArr[] = { "cat", "dog", "tac", "god", "act" };
		prinall(wordArr);

	}
}
