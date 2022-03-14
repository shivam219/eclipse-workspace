package muliti_treding;

class Counter {
	int count;

	public void increment() {
		count++;
	}
}

public class Increamentint {
	public static void main(String[] args) throws Exception {
		Counter ob = new Counter();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i <= 200; i++) {
					ob.increment();

				}

			}
		});
		t1.start();
		t1.join();
		System.out.println("total counted value"+ob.count);
	}
	
	
}
