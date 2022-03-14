package question;

import searching.main;

public class abstract_text {}
abstract class arith_fun {
	abstract  void add(int a, int b);
	abstract void division(int s, int h);
	abstract void m1(int s, int h);

}
abstract class add extends arith_fun {
	public static void main(String argu[]) {
		
	}
	public void add(int a, int b) {
		System.out.println(a - b);
	}
}
abstract class divsion extends add{
	
	public static void main(String[] args) {
	
	}

	
}

class usem1 implements a{
	public static void main(String[] args) {
		a ob  = new  a() {
			public void mi() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	public void mi() {
		// TODO Auto-generated method stub
		
	}
}


interface a {
	void mi();// public abtract
	default void ma() {
		
	}
	static void m2() {
		
	}
	///protect nod allow
}