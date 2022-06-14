package cuncurrentColleciton;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class concurrhashmap {
	public static void main(String[] args) {
		Map<Character, LongAdder> occu = new Hashtable<Character, LongAdder>();
		Map<Character, LongAdder> occu2 = new Hashtable<Character, LongAdder>();
		String str = "abcd efgh abd ef";
		for (char ch : str.toCharArray()) {
			LongAdder longAdder = occu.get(ch);// if not then null
			if (longAdder == null) {
				longAdder = new LongAdder();// assign default value 0
			}
			longAdder.increment();
			occu.put(ch, longAdder);
		}
		System.out.println(occu);
		for (char ch : str.toCharArray()) {
			occu2.computeIfAbsent(ch, e -> new LongAdder()).increment();
		}
	}
}
