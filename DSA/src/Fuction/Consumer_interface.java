package Fuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Consumer_interface {
	public static void main(String[] args) {
		/* two t and u */
		BiConsumer<String, Integer> emp1 = (eno, ename) -> new Emp(eno, ename);
		BiPredicate<Integer, Integer> isEqual = (n1, n2) -> n1 == n2;
		System.out.println(isEqual.test(10, 20));
		ArrayList<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp("aab", 2));
		emp.add(new Emp("aac", 1));
		emp.add(new Emp("aaa", 3));
		emp.add(new Emp("aab", 4));
		emp.add(new Emp("a", 5));
		System.out.println(emp);
		Collections.sort(emp, (e1, e2) -> (e1.id < e2.id) ? -1 : (e1.id > e2.id) ? 1 : 0);
		System.out.println(emp);
		
		emp.sort(null);
		Consumer<Integer> con = (t)->{System.out.println(t);};
		con.accept(2);
		
		
//	Comparable<T>
		
		/* sorting based on name Ascending */
//		Collections.sort(emp,(e1,e2)->e1.name.compareTo(e2.name));
//		System.out.println(emp);
		/* sorting based on name Descending */
//		Collections.sort(emp,(e1,e2)->e2.name.compareTo(e1.name));
//		System.out.println(emp);
//		emp.stream().sorted();

	}
}
