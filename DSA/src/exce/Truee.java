package exce;
public class Truee {
	public static void main(String[] args) {
		try {
//			System.out.println(10/0);
		} finally {
			System.out.println("ss");
		}
		int s = call();
		System.out.println(s);
	}
	private static int call() {

		try {
			System.out.println("s");
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			
		}
	}
	
}
