package typecast;

public class Obejct_typecase {
	public static void main(String[] args) {
		Object o = new String("shivam");
		StringBuffer sb = new StringBuffer((String) o);
		System.out.println(sb);
		System.out.println(o == sb);

		Object oo = new String("shivam");
		String o1 = (String) oo;
		System.out.println(oo == o1);

	}
}

class bb {
	public void m1() {
		System.out.println("bb mi");
	}
}

class cc extends bb {
	public void m2() {
		System.out.println("bb mi");
	}

	public static void main(String[] args) {
		bb ob = new cc();
		((bb)ob).m1();
		// ((bb)cc).m2();
	}
}