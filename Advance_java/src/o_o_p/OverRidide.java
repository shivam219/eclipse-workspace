package o_o_p;

class pa {
	static void m1() {
		System.out.println(" in m1 of parent ");
}}
public class OverRidide {
	static void m1() {
		System.out.println(" in m1 of child");
	}

	public static void main(String[] args) {
		OverRidide ob = new OverRidide();
		
	}
}


class p {									
	static public void  m1(int i) {// implicitly converted to int a[]
		System.out.println(i + "Child");
	}
}
class c extends p {
	static public void  m1(int  i) {
		System.out.println(i +" child");
	}
}
class demo{
	public static void main(String[] args) {
		c ob = new c();
		c.m1(20);
		((p)ob).m1(10);
		//((bb)ob).m2();	
		
		
	}
}
