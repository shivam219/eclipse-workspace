package modifier_use;

class k {
	static k ins = new k();
	int i = 10;

	private k() {
		System.out.println("contructor");
	}

}

public class test { // top public defualt final abstract strictfp

	public static void main(String[] args) {
		System.out.println(k.ins + " " + k.ins.i);
		k.ins.i = 20;
		k ins2 = k.ins;
//	System.out.println(k.ins);
		System.out.println(ins2 + " " + ins2.i);

//		System.out.println(a);

	}

	class t { // addintion private protect static

	}
}
