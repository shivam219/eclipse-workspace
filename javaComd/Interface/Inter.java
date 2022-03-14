interface A {
	 public void m1();
}

public class Inter implements A{
	public void m1() {System.out.println("A is called");}
	
	public static void main(String[] args) {
	//m1();
	Inter ob = new Inter();
	ob.m1();
	//ob.m2();// unsetifide linking error
	}
	public native void m2();
}
