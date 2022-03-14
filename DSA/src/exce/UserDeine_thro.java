package exce;

public class UserDeine_thro {
	public static RuntimeException m1(String str) {
		System.out.println(str);
		System.out.println("System in !!!");

		return new RuntimeException("ss");
	}

	public static void main(String[] args) {
		String str = "My name is shivam";
//		throw new UserDeine_thro().m1(str);
	}

}

class userDefine extends RuntimeException {
	public void m1() {
		System.out.println("called m1 after suepr ");
	}

	public userDefine(String str) {
		super(str);
		System.out.println("hiii");
		System.out.println("hiii");
		System.out.println("hiii");
		System.out.println("called ");
		m1();
		int a = 10;
		int b = 10;
		int c = 10;
		System.out.println((a + b) - c);

	}

	public static void main(String[] args) {
		String str = " user define by constructing ";
		throw new userDefine(str);
	}

}

class userThrow {

	public void addTwo(int val1, int val2) {

	}

	public static void main(String[] args) {
//		System.out.println(10/0);
		System.out.println(0 / 500);
		System.out.println("ss");
	}
}

class Calculation {
	int a;

	public Calculation(int a) {
		this.a = a;
	}

	public int add() {
		a = a + 10;
		try {
			a = a + 10;
			try {
				a = a * 10;
				throw new Exception();
			} catch (Exception e) {
				a = a - 10;
			}
		} catch (Exception e) {
			a = a - 10;
		}
		return a;
	}

	public static void main(String args[]) {
		Calculation c = new Calculation(10);
		int result = c.add();
		System.out.println("result = " + result);
		String s1 = "Sharma is a gooplayer";
		String s2 = new String("Sharma is a good player");
		s2 = s2.intern();// 
		System.out.println(s1 == s2);
		
		
	}
}