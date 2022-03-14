package interface_f;

//if any interface doesn't contain method know as maker interface
// jvm going to provide abilitty to marker interface
// example cloneable , serilizable interface
interface interr {
/// we need make customized for marker interface
	void m1();

	void m2();

	void m3();

	void m4();
//	 default void m7(){
//		System.out.println();
//	}
}

public class Inter_class_2 implements interr {
	public static void main(String[] args) {

		Test on = new Test();
		on.m1();
		on.m4();
	}

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub

	}
}

abstract class Adapter implements interr {
//	adapter class  is simple java class implements an interface with only implements
	public void m1() {
	}

	public void m2() {
	}

	public void m3() {
	}

	public void m4() {
		System.out.println("this there");
	}

}

class Test extends Adapter {
	public void m1() {
		System.out.println("this is m1 method of m1");
	}

	public void m2() {
		System.out.println();
	}

}
