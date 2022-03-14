package question;

import question.Inner_Class.a.b;

public class Inner_Class {
	public static void main(String[] args) {
		Inner_Class ob = new Inner_Class();
		ob.show();
	}

	public void show() {
		Inner_Class ob = new Inner_Class();
		a ob1 = new Inner_Class.a();
		b.m2();
	}

	static class a {
		public void m1() {
			System.out.println(" in  a inner class m1 called ");
		}

		static class b {

			public static void m2() {
				System.out.println(" in  b inner class m2 called ");
			}
		}
	}
}

class excep {
	public void m1() {
		throw new  ArithmeticException("shivam");
//		System.out.println("sdf");
	}
	public static void main(String[] args) {
		System.out.println("shivam");
		excep ob = new excep();
		ob.m1();
	
	}
	
}







