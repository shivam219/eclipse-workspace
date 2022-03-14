package linkedlist;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_iterator {
	public static void main(String[] args) {
		LinkedList<String> kk = new LinkedList<>();
		kk.add("cactus");
		kk.add( "lizard");
		kk.add( "chameleon");
		kk.add("mouse");
		kk.add("spider");
//		System.out.println(kk.remove(0) +    "\n"+kk.removeAll(kk)+"\n"+kk);
		 ListIterator<String> listIterate = kk.listIterator();
	        listIterate.next();
	        listIterate.next();listIterate.next();listIterate.next();
	        // Remove element returned by next()
	        listIterate.remove();
	        System.out.println("New LinkedList: " + kk);
//		int i = kk.indexOf("mouse");
//        System.out.println("First Occurrence of Dog: " + i); 
//		kk.addFirst("ship");
////		kk.addAll(kk);
//		System.out.println(kk);
////		Iterator<String> it= kk.listIterator();
////	    while(it.hasNext()) {
////	    	System.out.print(it.next());
////	    	System.out.print(", ");
////	    }
//	    Iterator <String> ko =kk.descendingIterator();
//	    while(ko.hasNext()) {
//	    	System.out.print(ko.next());
//	    	System.out.print(", ");
//	    }
		
		
	}
}
