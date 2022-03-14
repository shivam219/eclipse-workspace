package muliti_treding;

public class synchronizedi extends Thread{
	aaa a = new aaa();
	bbb b = new bbb();
	public  void m1() {
		this.start();
		a.d1(b);
	}
	public void run() {
		b.d1(a);
	}
	public static void main(String[] args) {
		synchronizedi ob = new synchronizedi();
		ob.m1();
	}
}
class aaa {
	public synchronized void d1(bbb b) {
		System.out.println("thread 1 start execution of  d1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println("thread 1 trying to call B's last()");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside b last ()");
	}

	public static void main(String[] args) {

	}
}

class bbb {
	public synchronized void d1(aaa a) {
		System.out.println("thread 2 start execution of  d1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println("thread 2 trying to call B's last()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside b last ()");
	}

}