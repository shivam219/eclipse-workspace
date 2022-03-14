package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_check {
	public static void main(String[] args) {
		Set<Integer> ss = new HashSet<>();
		ss.add(1);
		ss.add(2);

		Iterator<Integer> iterate = ss.iterator();
		System.out.print("HashSet using Iterator: "+iterate);
		
		while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
            
	}}

}
