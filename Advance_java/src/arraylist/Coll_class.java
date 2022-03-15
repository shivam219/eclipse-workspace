package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Coll_class {
	/*
	 * collection is main class . Collection <== list <== ArrayList collection don't
	 * work with index no for this use list new ArrayList.
	 * 
	 * set is don't have duplicate elements if create set by implementing treeSet
	 * set<integer> ss = new TreeSet<>();
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
//		interface 				implement classs
		/*
		 * Collection ss = new ArrayList(); ss.add(1); ss.add(2); ss.add(3); ss.add(4);
		 * Iterator i = ss.iterator(); System.out.println(i);
		 * 
		 * while (i.hasNext()) { System.out.println(i.next()); }
		 */
//----------------------------------------------------------------
//		 list iterator
		/*
		 * List<Integer> ss = new ArrayList<Integer>(); ss.add(1);// index === 0
		 * ss.add(2);// index === 1 ss.add(3);// index === 2 ss.add(4);// index === 3
		 * ss.add(2); for (int i = 0; i < ss.size(); i++) {
		 * System.out.println(ss.get(i)); }
		 * 
		 * for (Object o : ss) {// cannot use int because its object
		 * 
		 * System.out.println(o);
		 * 
		 * }
		 * 
		 */
//-----------------------------------------------------------------	
//		Assign class 
		/*
		 * // * Coll_class on = new Coll_class() ; Object getclass = on; ((Coll_class)
		 * getclass).hii();
		 */

//		List<Integer> ss = new ArrayList<Integer>();
//		ss.add(1);// index === 0
//		ss.add(2);// index === 1
//		ss.add(3);// index === 2
//		ss.add(4);// index=== 3
//		ss.add(2);
//		Collections.sort(ss);
//		Collections.reverse(ss);
//		Collections.shuffle(ss);
//		for (Object o : ss) {
//			System.out.println(o);
//		}
//----------------------------------------------------------
		// Comparator Operator
		List<Integer> ss = new ArrayList<Integer>();
		ss.add(1);// index === 0
		ss.add(2);// index === 1
		ss.add(3);// index === 2
		ss.add(4);// index=== 3
		ss.add(2);
		Collections.sort(ss);
		Collections.reverse(ss);
		Collections.shuffle(ss);
		Collections.min(ss);
		Collections.max(ss);
		for (Object o : ss) {
			System.out.println(o);

		}

	}
}
