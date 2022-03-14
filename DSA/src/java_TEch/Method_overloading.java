package java_TEch;

public class Method_overloading {
	public static void main(String[] args) {
		Method_overloading ob = new Method_overloading();
		ob.m1();
		System.out.println("s");
	}
	public static void main(String args, String s) {
		Method_overloading ob = new Method_overloading();
		ob.m1();
	}

	public void m1() {

	}

	public void m1(int a, int b) {

	}

	public void m1(String s, int a) {

	}
}
