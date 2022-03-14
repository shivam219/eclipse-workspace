package gui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (i < 10) {
				it.remove();
			}
		}
		System.out.println(numbers);
		
		LinkedList ob = new  LinkedList<>();
		ob.add("hii");ob.add("dsfsd");
		Iterator i2 = ob.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
			}
		ListIterator li = ob.listIterator();
		while (li.hasPrevious()) {
			System.out.println(i2.next());
		}
	}
}
