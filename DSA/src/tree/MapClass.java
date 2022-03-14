package tree;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
	public static void main(String[] args) {
		HashMap ob = new HashMap<Integer, Integer>();
		Hashtable ht = new Hashtable<Integer, Integer>();
		HashMap hml = new LinkedHashMap<Integer, Integer>();
		TreeMap tm = new TreeMap<Integer, Integer>();
		String s[] = { "shviam", "deepad" };

		// ob.get(s)//inter key and get value

//			ob.put(1,( ob.get(1))+1);
	}

	static void characterCount(String inputString) {
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (mp.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				mp.put(c, mp.get(c) + 1);
			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				mp.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
