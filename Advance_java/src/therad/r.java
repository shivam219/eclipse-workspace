package therad;

public class r {
	public static void main(String[] args) {
		t ob = new t() {
			public void m1() {
				
				
			}
		};
		t ob1 = ()->{
			System.out.println("hii");
		};
		
		ob1.m1();
	}
}


@FunctionalInterface
interface t {
	public void m1();
}