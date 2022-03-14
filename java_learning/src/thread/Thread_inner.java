package thread;

public class Thread_inner {
	public static void main(String[] args) {
			Thread_inner ob = new Thread_inner();
			ob.m1();
	}
	public void m1() {
		Thread t = new Thread();
		t.start();
	}
}

abstract class tr implements Runnable{
	public void start(){
		run();
	}
}
class demo{
	public static void main(String[] args) {
		System.out.println("Demo");		
		Runnable  r = ()->{
			System.out.println("Rannable");
		};
		
	}
}

