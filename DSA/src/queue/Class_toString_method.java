package queue;

import java.util.Scanner;

public class Class_toString_method {

	public static void main(String[] args) {
//		B ob= new B();	System.out.println(ob);
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.next();
	}
}

class B {
	String s = "shivam";

	@Override
	public String toString() {

		return s;
	}
}
