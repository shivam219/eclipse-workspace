package Fuction;

import java.util.Vector;

public class list {
	public static void main(String[] args) {
		// arraylist is not syncrhonized
		// double it size it full

		/// maintain the insert order
		// not synchronized
		// not support accessing element rendomly
		// iteretor us listItereator or LinkedList iterato
//		LinkedList<Integer> li = new LinkedList<Integer>();
//		li.add(100);
//
//		li.add(102);
//		li.add(1, 20);
//		li.addFirst(1);
//		li.removeIf(e-> e%2==0);

//		while (li.iterator().hasNext()) {
//			System.out.println(li.iterator().next());
//		}
//		li.forEach(e->System.out.println(e));
//		Iterator it = li.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		ListIterator it2 = li.listIterator();
//		while (it2.hasPrevious()) {
//			System.out.println(it2.previous());
//			System.out.println("s");
//		}
//-----------------------vector
		/*
		 * vetor is ysnchronized 
		 * maintaint insert order
		 * its thread safe
		 * vectory increase is it size by  doubling the array size
		 * it lagecy class
		 */
		
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		

	}
}
