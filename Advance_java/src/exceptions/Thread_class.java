
//stack  jvm enternal thread 256 bit
// Stack is store run time data
// two type of thread 
//a) User define
//b) Daemon thread 
package exceptions;

class myclas extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

public class Thread_class {
	public static void main(String[] args) {
		myclas obj = new myclas();
		Thread t = new Thread(obj);
		t.setPriority(10);
		t.start(); /// call  run ()
		System.out.println(t.getName() + "\n" + t.getState());
		t.setName("Shivam");
		System.out.println(t.getPriority());
//		 t.setDaemon(true);
//		 System.out.println(t.isDaemon());
		 System.out.println(t.isAlive());
	}

}
