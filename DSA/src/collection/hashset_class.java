package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset_class {
	public static void main(String[] args) {
		HashSet<Integer> hs=  new LinkedHashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		System.out.println(hs);
	}
}
