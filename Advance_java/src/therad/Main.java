package therad;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		MyThread thread1 = new MyThread();
		thread1.setName("Thread--1");
		System.out.println("ss");
		MyRunnable myrunnable = new MyRunnable();
		Thread thread2 = new Thread(myrunnable);
		thread2.setName("Thread--2");
		
//		thread1.setDaemon(true);
//		thread2.setDaemon(true); // if its user set as deamon then after end of main or any exeception occur 
		thread1.start();
//		thread1.join(); /// pause main thread until thread1 execution is completed 
		thread2.start();
		System.out.println(1/0);
	}
}
class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread--2");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
//				System.out.println(1 / 0);  // terminatre this thread by exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Threaf---2  finished :)");
	}
}
