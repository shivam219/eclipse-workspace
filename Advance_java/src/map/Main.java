package map;

import java.util.HashSet;
import java.util.Iterator;
public class Main
{
// 	public static void main(String[] args) {
		public static void main(String[] args) {
		int[] a = { 1, 4, 1, 3, 4, 1, 5 };
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+ " ");
		}
	}
}