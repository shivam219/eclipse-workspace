class gp{
	static public void  m1(int i) {// implicitly converted to int a[]
		System.out.println(i + "pareent");
	}
}

class p extends gp {
	static public void  m1(int i) {// implicitly converted to int a[]
		System.out.println(i + "pareent");
	}
}
class c extends p {
	static public void  m1(int  i) {
		System.out.println(i +" child");
	}
}
class cl{
	public static void main(String[] args) {
		c ob = new c();
		c.m1(20);
		((p)ob).m1(10);
		((gp)ob).m2(20);			
		
	}
}