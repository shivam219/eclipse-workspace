package therad;

public class Thread_test extends Thread {
	@Override
	public void run() {
		System.out.println("hii");
	}

	@Override
	public synchronized void start() {
		this.run();

	}

	public static void main(String[] args) {
		Thread_test t = new Thread_test();
		t.start();
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