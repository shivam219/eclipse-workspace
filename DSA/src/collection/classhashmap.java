package collection;

import java.util.HashMap;

public class classhashmap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> ar = new HashMap<Integer, Integer>();
		ar.put(null, null);
		System.out.println(ar.put(null, 10));
		System.out.println(ar.put(null, null));
		System.out.println(ar);
	}
}
