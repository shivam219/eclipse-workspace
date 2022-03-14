package thread;

public class Synchroznied_sd {
	/* definition- if multiple thread are operating single java object then synchronization 
	 * required
	 * 
	 * 
	 * if multiple thread try operating in single data then data inconstancy problem
	 * occur to over come this problem go with synchronized block and synchronized
	 * block
	 */
	public static void main(String[] args) throws Exception {
//		tt r1 = new tt("r1");tt r2 = new tt("r2");
//		Thread t1 = new Thread(r1);Thread t2 = new Thread(r2);
//		t1.setPriority(10); t1.start();
//		t2.setPriority(10); t2.start();
//		System.out.println("call");
		tt ob = new tt("tt");
		tt o2 = (tt) Class.forName("tt").cast(ob);
	}
}
class tt extends Thread { 
	void show() {
	System.out.println("name");
	}
	String name ="";
	public tt(String name) {this.name=name;}
	public synchronized void run() {
//		for(int i =1;i<=100;i++) {
//			System.out.println(name);
//		}
	}
	
}