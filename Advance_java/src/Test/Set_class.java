package Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_class {
	public static void main(String[] args) {

//		@SuppressWarnings("unused")
		// set automatic sort and no duplicate element
//		Set<Integer> values = new HashSet<>();
//		values.add(5);
//		values.add(6);
//		values.add(4);
//		values.add(1);
////		hashSet<>() 
//		for (Object x : values) {
//			System.out.println(x);
//
//		}
//		System.out.println(values.add(5));
		// out:- false 
	
		Set<Integer> value = new TreeSet<>();
		
		value.add(5);
		value.add(6);
		value.add(4);
		value.add(1);
//		hashSet<>() 
		for (Object x : value) {
			System.out.println(x);
			
		}
		System.out.println(value.add(5));
		
		
	}
	

}
