package contructor;

class p {
	int serial = 20;

	public p() {
		System.out.println("p in contructor");
	}

	public p(int a) {
		System.out.println("p in contructor");
	}
}

class c extends p {
	public c() {	 
		super();
		int a = 20;
		System.out.println("c  in contructor" + serial);
	}
	public c(int a) {
		super(20);
	}
}

public class Contructor_with_private {
	public static void main(String[] args) {
		p ob = new c();
		System.out.println("Programm End");
	}
}
