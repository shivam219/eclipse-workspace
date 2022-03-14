
class A {
	protected void m1(){
	System.out.println("A Class methd is called");
}}

class B  extends A{
	void m2(){
		System.out.println("in B");
	}
	
public static void main(String [] args){	
A a = new A();
a.m1();	

B b = new B();
b.m1();

A ab=  new B();
ab.m1();
ab.m2();


}
}