package o_o_p;

import java.io.IOException;

abstract class hello {
	 String M1() throws InterruptedException {
		System.out.println("In A");
		return null;

	}

	abstract void m2();
}

public class Poly extends hello {
	static int add(int a, float c) {System.out.println("in and char");
		return a + (int)c;
	}

	static int add(int a,int b) {
		return a + b;
	}
	
	Object m1() {

//		super.M1();
		System.out.println("In Main");
		return null;

	}

	synchronized String m3() {
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Poly.add(0, 10));// ambiguity
//		System.out.println(Poly.add(20, "Shivam"));// ambiguity
		// ambiguity -- situation when para , name , data type same

		Poly ob = new Poly();
		ob.m1();
//		case 1
		/*
		 * Covariant return type:- When overrind methode in child clas having parant -
		 * child relation in return type(like _ void) of method is known covarint by
		 * default child class method is executed
		 */
//		case 2
//		child class overrided method have larger access bility

//		case 3 
		/*
		 * user super.m1(); to override parent method
		 */
//		case 4
		/*
		 * final - no one can override private - private accessibility only to base clas
		 * static - cannot be override
		 */
//		case 5
		// Abstract method also need to override

//		case 6
		/*
		 * If parent class overided having parent throws exception then child class
		 * should have same or child class exception
		 */
	}

	void m2() {
		// TODO Auto-generated method stub

	}

}