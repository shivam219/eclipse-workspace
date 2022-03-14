package sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_duplicate_and_its_Count_using_map {
	public static void main(String[] args) {
		String str = "shivam choudhary";
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		// logic
		for (Character ch : chars) {

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		Set<Character> keys = map.keySet();
		for( Character ch : keys)
		{
			if(map.get(ch)> 1)
			System.out.println("character "+ ch + "repeating "+ map.get(ch)+"times");
			
		}
		System.out.println(map);
	}
}
