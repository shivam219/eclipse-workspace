package map;

import java.util.HashSet;
import java.util.Iterator;

public class Set_class {

	public static void main(String[] args) {
		HashSet<Integer> st = new HashSet<>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
//		for(Integer e : st) {
//			System.out.println(e);
//		}
//		for-each loop
		
		Iterator<Integer> it = st.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.hasNext());
		}
	}
}
