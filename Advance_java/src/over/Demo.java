package over;
class Outer{
	
	int a;
	public void show() {
	System.out.println("outer class");	
	}

	class Inner{
		public void show() {
			System.out.println("inner");
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		Outer ob1 =new Outer();
		ob1.show();
		Outer.Inner ob2 =ob1.new Inner();
		ob2.show();
	}
}
