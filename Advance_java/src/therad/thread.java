package therad;

public class thread {
	public static void main(String[] args) {
		myThread t = new myThread();
		t.start();
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);

				}
			}
		};

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);

				}
			}

		});
		t2.start();
	}
}

class myThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}
	}
}