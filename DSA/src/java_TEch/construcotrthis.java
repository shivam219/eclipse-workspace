package java_TEch;
import java.util.ArrayList;
public class construcotrthis {
	public static void main(String[] args) {
	}
}
class pa {
	public pa() {
		System.out.println("Parent construn");
	}
	void m1() {
		System.out.println("Parent m1");
	}
}
class ch extends pa {
	public ch() {
		System.out.println("chil aconst");
	}
	public ch(int a) {
		this();
	}
	void m2() {
//		super.m1();
	}
	public static void main(String[] args) {
		ch ob = new ch();
		ob.m1();
		System.out.println(ob);
		System.out.println(ob.toString());
		ArrayList<Integer> ar = new ArrayList<Integer>();
		// ar.add(10); ar.add(40);ar.add(20); ar.add(30);
		System.out.println(ar);
		System.out.println(ar.toString());
	}
	public String toString() {
		return "deepak";
	}
}
class gg {
	int a = 10;

	void m1() {
		System.out.println("gp m");
	}
}
class pp extends gg {
	int a = 20;
}
class cc extends pp {
int a =10;
	void m2() {
		int j = this.a;
		System.out.println(j);
	}
	public cc() {
	System.out.println("ss");
	}
	public static void main(String[] args) {
		cc  ob = new cc();		
	}
}