package jvm;
import java.lang.reflect.*;
public class classs {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.Thread");
		Method[] m1 = c.getDeclaredMethods();

		for (Method m : m1) {
			System.out.println(m.getName());
		}
		classs ob = new classs();
		Class oc = Class.forName("B");
		classs ob2 = new classs();
		Class oc2 = Class.forName("B");
		System.out.println(oc == oc2);
	}
	int min() {
		return 1;
	}
}

class B {

	void m1() {
	}

	void m2() {
	}
}