package modifier_use;

public class Thiss {
	String  s = "deepak";
	public Thiss(String s) {
		this.s=s;
	System.out.println(this);
	}
	public static void main(String[] args) {
		Thiss ob = new Thiss("rama");	
		System.out.println(ob);
		Thiss ob2 = new Thiss("hii");	
		System.out.println(ob2);
	}

}

class A {
	A() {
		System.out.println("hello a");
	}

	A(int x) {
		this();
		System.out.println(x);
	}
}

class TestThis5 {
	public static void main(String args[]) {
		A a = new A(10);
	}
}