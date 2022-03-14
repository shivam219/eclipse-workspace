package muliti_treding;

public class Multi_Lambda {
	public static void main(String[] args) {
		Runnable ob = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("hello world");
				try {Thread.sleep(1000);} catch(Exception e) {}
			}

		};
		Runnable obb = () ->

		{
			for (int i = 0; i <= 5; i++) {
				System.out.println("hii world");
				try { Thread.sleep(1000)	;}catch (Exception e) {} 
			}

		};
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(obb);
		t1.start();
		try { Thread.sleep(10)	;}catch (Exception e) {} 
		t2.start();
	}
}