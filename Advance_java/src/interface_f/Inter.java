package interface_f;

interface AA {
	public void m1();

	public void m2();
}

abstract public class Inter implements AA {
	public final strictfp synchronized void m1() {
		System.out.println();
	}

	public static void main(String[] args) {

	}
}

class inter2 extends Inter {
	public void m2() {

	}
}
