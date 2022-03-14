package collection;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class list {
	public static void main(String[] args) {
		
		ArrayList<Integer> li1 =  new ArrayList<Integer>();
//		ArrayList<Integer> li3 =  new ArrayList<Integer>();
//		LinkedList<Integer> li3 = new LinkedList<Integer>();
//		Vector<Integer> li3 = new Vector<Integer>();
//		Queue family		
//		ArrayDeque<Integer> li3 = new ArrayDeque<Integer>();
//		PriorityQueue<Integer> li3 = new PriorityQueue<Integer>();
//		Set family		
//		HashSet<Integer> li3 = new 	HashSet<Integer>();
//		LinkedHashSet<Integer> li3 = new 	LinkedHashSet<Integer>();
		TreeSet<Integer> li3 = new TreeSet<Integer>();
		
		
		li1.add(10);
		li1.add(11);
		li1.add(12);
		li1.add(13);
		li1.add(14);
		System.out.println(li1);
		li3.add(10);
		li3.add(11);
		li1.removeAll(li3)
		;
		System.out.println(li1);
		
	}
}
