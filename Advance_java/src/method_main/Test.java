package method_main;

public class Test {
	// calculating sum using strictfp modifier
	public strictfp double sum() {
		double num1 = 10 + 10;

		double num2 = 20 + 20;
		System.out.println(num1 + num2);
		return (num1 + num2);

	}

	public static strictfp void main(String[] args) {
		Test t = new Test();

		System.out.println(t.sum());
	}
}