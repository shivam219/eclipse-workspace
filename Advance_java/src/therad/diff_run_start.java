package therad;

import java.io.IOException;

/*
 *thread naming 
 *thread.currentThread().getName(); main
 *for child
 *thread-- priority
 * 1   to  10
 * min     max 
 *Thread.MIN_PRIORITY
 *Thread.MAX_PRORITY
 *Thead.NORM_PRORITY
 *Thread sedular will give priority on base whilc  alllocating processor
 *Tread push 
 *yld, join, sleep
 *it no support prooer
 */
public class diff_run_start extends Thread {
	@Override
	public void run() {
		System.out.println("sdfds");
		return;
	}

	public static void main(String[] args) throws InterruptedException {
		diff_run_start r1 = new diff_run_start();
		r1.start();// if not override then default interface execute having empty implements
		System.out.println("sdv");
		System.out.println(r1.getName());
		Thread.currentThread().join();
//	r1.start();
		System.out.println(r1.isAlive());
		r1.setName("shivam");
		System.out.println(r1.getName());
		System.out.println(Thread.currentThread().getPriority());// default only 5
//	Thread.currentThread().yield();
//	System.out.println(Thread.currentThread().getId());

	}
}

class runnablee implements Runnable {
	public void run() {
		System.out.println("runnable integer is exceute");
	}
}

class run_ {
	public static void main(String[] args) {
		runnablee ob = new runnablee();
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("runnable integer is exceute");

			}
		};
		Runnable r2 = () -> {
			System.out.println("call me when  i am way up");
		};

	}
}

class t  extends Thread{ 
	@Override
	public void run() {
		System.out.println("child");
		for(int i =0; i<10 ;i ++) {
			System.out.println("10 child");	
			}
	}
}
class sleeping extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread sleeping");
		t r1 = new t();
		r1.start();
//		r1.join(); // r1 wait until main complete 
		Thread.currentThread().join(); // main has wait until main complete - deadlock
		for(int i =0; i<10 ;i ++) {
		System.out.println("10 time");	
		}
		System.out.println("main");
	}
}
