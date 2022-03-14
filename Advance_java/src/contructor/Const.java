
package contructor;

class Outer{
	int num1;
	int num2;
	int num3;
	public Outer() {
		num1=50;
		num2=100;
		System.out.println("In construcoter");
	}
	public Outer(int n) {
		num1=n;
		num1=n;
	}
	public Outer (double d,int n) {
		num1=(int)d;
		num2=n;
	}
	public Outer (double d) {
		num1=(int)d;
		
	}
}
public class Const {
	public static void main(String[] args) {

		Outer ob= new Outer(7.3);
		System.out.println(ob.num1);
		
	}
}
