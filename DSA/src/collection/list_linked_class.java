package collection;

import java.util.LinkedList;

public class list_linked_class {
	public static void main(String[] args) {
		LinkedList<Integer> ld = new LinkedList<Integer>();
		ld.add(12);
		ld.add(10);
		ld.add(13);
		ld.add(14);
		ld.add(15);
		System.out.println(ld.indexOf(10));
//		System.out.println(ld);
	}
}
