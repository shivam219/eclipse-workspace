package string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Rearrange_strint_into_char_such_that_no_adjucency_are_same {
	static String re(String s) {

		Map<Character, Integer> count = new HashMap<>();
		for (char c : s.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
		maxHeap.addAll(count.keySet());
		StringBuilder result = new StringBuilder();
		while(maxHeap.size()>1) {
			char current = maxHeap.remove();
			char next = maxHeap.remove();
			result.append(current);
			result.append(next);
			count.put(current , count.get(current)-1);
			count.put(next, count.get(next)-1);
			if(count.get(current)>0) {
				maxHeap.add(current);
			}
			if(count.get(next)>0) {
				maxHeap.add(next);
			}
			
		}
		if(!maxHeap.isEmpty()) {
			char last = maxHeap.remove();
			if(count.get(last)>1) {
				return "";
			}
			result.append(last);
		}

		
		return result.toString();
	}

	public static void main(String[] args) {
		String s = "aabc";
		re(s);
		System.out.println(re(s));
	}
}
