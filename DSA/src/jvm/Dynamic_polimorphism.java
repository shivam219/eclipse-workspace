package jvm;

import java.util.ArrayList;

public class Dynamic_polimorphism {
	public static void main(String[] args) {
		ArrayList<Integer> aa = a.m1();
		System.out.println(aa);
		System.out.println("dfdsh");
		ArrayList<Integer> al = new ArrayList<Integer>(4);
		al.add(10);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(30);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		System.out.println(al);
	}
}

class a {
static	ArrayList m1() {
		return new ArrayList<Integer>(200);
	}
}