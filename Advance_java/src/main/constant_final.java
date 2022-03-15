package main;

public class constant_final {
	static int a = 10; // in method area value increment
	public static void main(String[] args) {
		String a = new String("abc");
		String b = "abc";
		a = "abc";
		String c = "xyz";

		System.out.println(a.equals(b));
		System.out.println(a == b);
		a = "xyz";
		System.out.println(a==c);
//		String

	}

}
