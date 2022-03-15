package therad;

class Aa implements Runnable {
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

class Bb implements Runnable {
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

public class Multi_Runnable {
	public static void main(String[] args) {
		Runnable s = new Aa();
		Runnable ss = new B();
		Thread t1=new Thread(s);
		Thread t2=new Thread(ss);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();

	}
}
