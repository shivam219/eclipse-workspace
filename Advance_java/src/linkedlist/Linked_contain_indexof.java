package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_contain_indexof {
	public static void main(String[] args) {

		LinkedList<String> ss = new LinkedList<String>();// String [] k = new String [3];
		ss.add("dog");
		ss.add("cat");
		ss.add("fish");
		ss.add("parrot");
		ss.set(1, "mocquito");
		if (ss.contains("dog")) {
			System.out.println("it contain" + " dog");
			System.out.println(ss.contains("dog"));
			Iterator<String> it= (Iterator) ss.clone()	;
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		}
		int ind = ss.indexOf("Dog");
		System.out.println(ind);
		try {
			for (int i = 0; i <= ss.size(); i++) {
			}

		} catch (Exception e) {
			System.out.println(e);
	}
	}}
