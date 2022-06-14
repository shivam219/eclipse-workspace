package exce;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class exe_heircary {
	static void m1() {
		main(null);
	}

	static Thread t;
	static Thread t2;

	public static void main(String[] args) {

		System.out.println("hello");

		t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(10 / 0);
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}

			}
		});
		
		t.setName("t1");
		t.start();
		System.out.println("main started t1");
		try {			
			System.out.println(10/0);
			} catch ( java.lang.ArithmeticException e) {
			System.out.println("Error catch ");
		}
		
		t2 = new Thread(new Runnable() {
			@Override
			public void run() {
					for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
				
			}
		});
		t2.setName("t2");
		t2.start();
		System.out.println("main started t2");
		System.out.println("main thread end");
	}
}
