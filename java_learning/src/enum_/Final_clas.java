package enum_;

class F {
	private int view;
	private int income;
	static F f;

	final void money() {
		income = (int) (0.50 * view);
	}
	void m1 () {
	System.out.println("T");}
}

public class Final_clas extends F {
//	void money() {  cannot override
//	income = (int) (0.50 * view);
//	}
	public static void main(String[] args) {
		f = new F();
		f.m1();
		
		
	}
}
