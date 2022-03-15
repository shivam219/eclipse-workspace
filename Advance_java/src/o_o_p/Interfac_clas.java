package o_o_p;

interface inter {
	int a = 20;
}

interface inter2 {
	int a = 20;

	public void m2();
	private void m3() {
	}

	default void m1() {

	}
}

public class Interfac_clas implements inter, inter2 {
	public static void main(String[] args) {
		System.out.println("This programm for interface");
	}

	
	public void m2() {
		

	}
}
