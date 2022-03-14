package annotation;

import java.util.ArrayList;
@FunctionalInterface
 interface As{
	void show();
		 
	 
 }
class A{
	void show() {

		System.out.println("this A");
	
	}
}
class B extends A{
	
//@Override
	@SuppressWarnings("unchecked") /// unchecked all warning
	void show() {
		ArrayList nn= new ArrayList();
		System.out.println("this B");
		
	}
	
}
class C{
	@Deprecated
	//@	NotNull
	
	void hii() {
		System.out.println("This C  ");
	}
}
public class Anotation {

	public static void main(String[] args) {
		A obj=new B(); // directly calling A is main but here we write @override that execute statement in B
		obj.show();
		B  ob=new B();
		ob.show();
	
		C chi=new C();
		chi.hii();
		
		
	}
	
	
}
