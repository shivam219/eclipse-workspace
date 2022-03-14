package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_clear_removeif {	

	public static void main(String[] args) {
		LinkedList <String> animals = new LinkedList<>();
		animals.add("chameleone");
		animals.add("ant");
		animals.add("shrimp");
		animals.add("snack");
		animals.add("crow");
		System.out.println("i know insects"+animals);
		animals.clear();
		System.out.println("I don't know insects" +animals);
	}
}
//Iterator <String> ss = animals.listIterator();
//while(ss.hasNext()) {
//	System.out.println(ss.next());
//}
//System.out.println(ss);
//Iterator <String> sss = animals.iterator();
//System.out.println(sss);