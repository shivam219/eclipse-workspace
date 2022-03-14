package o_o_p;

enum abcc {
	INSTANCE, F;

	int i;
static int j =10;
	private abcc() {
		System.out.println("ss");
	}

	public void show() {
		System.out.println(i);
	}// is special type of class having private constructors
	public static void main(String[] args) {
		System.out.println("s");
	}
}

public class Singletom_clas {
	public static void main(String[] args) {
		abcc obj1 = abcc.INSTANCE;
		obj1.i = 5;
		obj1.show();

		abcc obj2 = abcc.INSTANCE;
		obj2.i = 6;
		obj1.show();

//		Runnable r1 = () -> {
//			Abc ob2 = Abc.getInstance();
//		};
//		Runnable r2 = () -> {
//			Abc ob2 = Abc.getInstance();
//		};
//		Thread t1 = new Thread(r1);
//		t1.start(); // boweler plat code
//		Thread t2 = new Thread(r2);
//		t2.start();// boweler plat code

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Abc ob1 = Abc.getInstance();
			}
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Abc ob2 = Abc.getInstance();
			}
		});
		t2.start();

	}
}

//have create static instance (object) of classs for singleton 
class Abc {
	static Abc obj;
	int i;
	public static synchronized Abc getInstance() { // num -- java 1.5
		if (obj == null) { // only single object creating emission is allowed
			synchronized (Abc.class) {
				if (obj == null)
					obj = new Abc();

			}
			System.out.println("object is create");
			return obj;
		}
		
		return obj;
	}

	public Abc() {
	}

}
