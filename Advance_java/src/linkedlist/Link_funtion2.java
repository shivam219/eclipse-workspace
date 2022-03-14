package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Link_funtion2 {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		link.add("goolge");
		link.add("microsoft");
		link.add("apple");
		link.add("jio");
		ListIterator<String> listIterate = link.listIterator();
		while (listIterate.hasNext()) {  /// return true not 1 
			System.out.print(listIterate.next());
			System.out.print(",   ");
		}
		System.out.println("\n");		/// return true not 1 
		while (listIterate.hasPrevious()) {
			System.out.print(listIterate.previous());
			System.out.print(" ,   ");
		}
	}
}
