package modifier_use;

public class boolean_if_check {
	public static boolean m1() {
		System.out.println("m1 called");
		return false;
	}

	public static boolean m2() {
		System.out.println("m2 called");
		return false;
	}

	public static void main(String[] args) {

		if (m1() | m2()) {
			System.out.println("execute");
		}
		System.out.println("**************");
		if (m1() && m2()) {
			System.out.println("execute");
		}
	}
}