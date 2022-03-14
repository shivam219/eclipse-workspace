package over;

class A {
	public void show() { //main class
		System.out.println("in A");
	}
}

class B extends A {
	
	public void show() {
		//super.show(); /// 1 goto superClass
		System.out.println("in B");///2 line
		super.show();
	}
}

public class Oer_rind {

	public static void main(String[] args) {
		B ob1 = new  B();
		ob1.show();
//		A ob2 = new  B();
//		ob2.show();
	
	
	
	}
}
