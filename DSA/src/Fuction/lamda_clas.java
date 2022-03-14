package Fuction;

// no name -- no modifiere -- no return typelike void 
public class lamda_clas {
	public static void main(String[] args) {
		// create one class for implementing function
//		MyInterImpl o = new MyInterImpl();
//		o.sayhello(); 
		// Annonymous class
//		In i = new In() { 
//			@Override
//			public void sayhello() {
//				System.out.println("im clas");
//			}
//
//		};
//		i.sayhello();
//		// Lambda in Interface
//		In i2 = () -> {
//			System.out.println("this");
//		};
//		i2.sayhello();
		sum s = (a, b) -> a + b;
		// remove return type
		sum s1 = (a, b) -> {
			return a + b;
		};
		System.out.println();
		

		Runnable r = () -> {
			try {
				for (int i = 1 ; i<10; i++) {
					System.out.println("hello");
					Thread.sleep(1000);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread t = new Thread(r);
		t.start();
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
			System.out.println("this on annonymouse class");
				
			}
			
		};
		Thread t2 = new Thread(r2);
		t2.start();
		System.out.println(10/0);
		
		// by default all the thread are user if any exception occurs in main then
	}
	
}

///
