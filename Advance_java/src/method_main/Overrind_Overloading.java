package method_main;

class Overr_overload {
	public void m1() {
		System.out.println("Property, Gold");
	}
	public void m2(int i) {
		System.out.println("Marry with one ");
	}
	public void m2(int i, int i1) {
		System.out.println("Marry with two ");
	}

}

public class Overrind_Overloading extends Overr_overload {
	public void m2() {
		System.out.println("Marry with XYZ");
	}

	public static void main(String[] args) {
		Overrind_Overloading ss = new Overrind_Overloading();
		ss.m1();
		ss.m2();
		ss.m2(10, 11);

	}
}