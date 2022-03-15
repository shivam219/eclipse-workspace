package array;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class var_args {
	public var_args() {
	}

	String str;
	float f;
	double b;

	public static void main(String[] args) {
		String str2;
		var_args ob = new var_args();
		System.out.println(ob.str);
		System.out.println(ob.f);
		System.out.println(ob.b);
		ob.m1(10);
		int ar2[][] = new int[4][];
		ob.m1(20);
		ob.m1(ar2);
		int[] ar1 = new int[4];
		ob.m1(ar1, ar1);
	}

	void m1(int... x) {
		System.out.println("called m1 int...x ");
	}

	void m1(int[]... x) {
		System.out.println("called m1 int[]...x ");
	}
}

class arr {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<Integer>();//not allowed remove operation
		CopyOnWriteArraySet<Integer>set = new CopyOnWriteArraySet<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		set.add(10);
		set.add(20);
		set.add(70);
		set.add(50);
		System.out.println(set);
		System.out.println(al);
		Iterator t= al.listIterator(2);
		while(t.hasNext()) {
			System.out.println(t.next());
			t.remove();// no allowed
		}
		
	}
}
