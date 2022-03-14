package string;

import java.util.HashMap;
import java.util.Map;

public class Covert_romanToDecimal {
	public static int convertRomanToInteger(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (map.get(str.charAt(i)) >= map.get(str.charAt(i + 1))) {
				result = result + map.get(str.charAt(i));
			} else {
				result = result - map.get(str.charAt(i));
			}
		}
		result = result + map.get(str.charAt(str.length() - 1));
		return result;
	}
	public static void main(String[] args) {
		System.out.println("dfg");
		// String str = "IV";
		// String str = "XXIV";
		String str = "XC";
		int result = convertRomanToInteger(str);
		System.out.println(result);
	}
}
