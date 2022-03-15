package thread;

public class Threads_class {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.activeCount());
//		Thread.currentThread().setName("maina");
		// thread prority 1 to 10 1 is lowest one
//		Thread.currentThread().setPriority(10);
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().isAlive());
//		
//		for(int i = 3; i> 0 ;i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//			System.out.println(Thread.currentThread().getName());
//		}

		MyThread mythread = new MyThread();
		mythread.run(); // start end with end execution unit
//		mythread.start(); // start close with main thread 
		System.out.println(mythread.isAlive());
		System.out.println(mythread.getName());
		System.out.println(mythread.getPriority());
		System.out.println(Thread.activeCount());

		// user thread and Deamon thread
		// Deamon thread low prority thread that runs in background to perform
		// task like gerbage collection and jvm terminates itself when all user threads
		// non - deamon threads finish there excution
		mythread.setDaemon(true);
		System.out.println(mythread.isDaemon());

	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread--1");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Thread---1 is finished :)");
	}
	/*
	 * best approch to go with runnable is enable to extend other class also
	 * multithread process of exeuting multiple thread simulation on help
	 * utilization of cpu thread are independs they don't affect the other thread An
	 * exception in one thread will not interrupt other thread useful for serving
	 * multiple client, multiplayer
	 */

}