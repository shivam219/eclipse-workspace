package java_TEch;

import java.util.ArrayList;

public class static_work {
	static void st() {
		System.out.println(B.add(10, 20));
		System.out.println("s");
		main(null);

	}

	int a = 10; // static
//	static {
//		st();
//	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		change(al);
		System.out.println(al);
	}

	public static void change(ArrayList<Integer> al) {
		al.add(100);
		
	}

	void m1() {
		int aa = a;
	}

}

class B {
	static int add(int a, int b) {
		return a + b;
	}
}