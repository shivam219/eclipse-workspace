package muliti_treding;

class A extends Thread {
	public void run() { // there we only use run() method in Multithreading
		for (int i = 0; i <= 5; i++) {
			System.out.println("hii");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class B extends Thread {
	public void run() { // there we only use run() method in Multithreading
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class Multithreading {
	public static void main(String[] args) {
		A s = new A();
		B ss = new B();
		s.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			
		}
	
		ss.start();

	}
}
