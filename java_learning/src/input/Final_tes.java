package input;

class A {
	public void show() {
		System.out.println("shi   i");
	}
}

class B extends A {
	public void show() {
		System.out.println("shii");
	}
}

public class Final_tes {

	public static void main(String[] args) {

		A ob = new B();
		ob.show();
        ob= new A();
        ob.show();
        
       String aa="shivam";
       aa= new String();
       int ii = 100;
       ii = (int ) String ();
	}

	private static int String() {
		// TODO Auto-generated method stub
		return 0;
	}

}
