package colletion_or_gerner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class Arry_list {
	// only vector is thread safe and additional freature
	// array list dynamical
	// not thread safe mean asychronuos 
	// List ==> ArrayList , LinkedList, Vecotor extends stack
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
//		a.forEach(e -> System.out.println(e)); // 1
//		a.removeIf(e -> e % 3 == 0);
//		a.removeIf(e -> e == 20);
//		Iterator it = a.iterator(); // 2
//		while (it.hasNext())
//			System.out.println(it.next());
		ListIterator lit = a.listIterator();
		while(lit.hasPrevious())
			System.out.println(lit.previous());
	
		
	}
}
