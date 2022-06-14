package therad;

class Thread22 extends Thread {
	@Override
	public void run() {
		for (int i = 11; i < 20; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
public class Thread_test extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Thread_test t1 = new Thread_test();	
		t1.start();
		Thread22 t2 = new Thread22();
		t2.start();
	}

}

class mi {
	public static void m1() {
		System.out.println("shivam");
		main(null);
	}

	public static void main(String[] args) {
		m1();
	}
}