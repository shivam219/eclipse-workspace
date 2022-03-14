package question;


public class method_signature {

	public static void main(String[] args) {
		int i = 10;
		float f = 10 / 299f;
		double d = 10 / 299f;
		System.out.printf("%d %f %f \n", i, f, d);
		System.out.println(f + " float ");
		System.out.println(d + " double");
//		System.out.println("033444816053511704");
//		System.out.println("033444814");
		byte num = -10;
		System.out.println(num >>> 1); // prints 1073741822
		System.out.println(10 + 20 + "shviam");
		System.out.println("shviam" + 10 + 20);
		/* precedence */
		System.out.println(10 * 20 + "shivam");
		System.out.println("shivam" + 10 * 20);

	}/** shivam */
	/* native */
}

class method_signature1{
	private void m1(int a, int b) {
		System.out.println(" int  int ");
	}
	private void m1(int a, float b) {
		System.out.println(" int  float ");
	}
	private void m1(float f, float b) {
		System.out.println(" float float ");
	}	
	private void m2(long a, int b) {
		System.out.println(" int   -int ");
	}	
	private void m2(int  a, long b) {
		System.out.println(" long long ");
	}	
	
	public static void main(String[] args) {
	method_signature1 ob = new method_signature1();
	ob.m1(10.f,10.0f);
	
	}
}

abstract class p {
	public static void  m1() {
		System.out.println("Static m1 parent");
	}
}

class c extends p {
	public static void  m1() {
		System.out.println("child m1 parent");
	}
	public static void main(String[] args) {
		
	}
}

class this_passing{
	String name = "shivam";
	
	public this_passing() {
	}
	public this_passing(int a) {
	}
	public this_passing(int a , int b) {
		this(10);
	}
	
	
	public void change(this_passing ob) {
		System.out.println(ob.name);
	}
	public void callChange() {
	change(this);
	}
	public static void main(String[] args) {
	this_passing ob = new this_passing();
	ob.callChange();
	}
	
	class a  {private void m1() {
		Object ob = new Object();
	System.out.println(ob instanceof a);
	}}
	class b extends a{} 
	class c extends b{}
	class d extends c{}
	
}

	