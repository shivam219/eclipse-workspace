package colletion_or_gerner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Set_clas {
/*
 * set interface  is extends  collection interface
 * set - not indexed collection -- order not preseverd -- duplicate are not allowed
 * set to child 1 - HashSet-cls --> Linked
 * 	              - SortedSet-In -->TreeSet .. sorted 
 */
	public static void main(String[] args) {
		TreeSet<Double> tset = new TreeSet<>();
		tset.add(20.3);
		tset.add(210.3);
		tset.add(10.3);
		tset.add(30.3);
		tset.add(0250.3);
		System.out.println(	tset.ceiling(30.5)); // check weather any no is greater then this
	
		
	}
}
