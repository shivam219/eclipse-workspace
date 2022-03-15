package sybca_assi;
class Rational {
	int a1;
	int a2;
	int b1;
	int b2;
	public Rational(String a, String b) {
		try {
			a1 = Integer.parseInt(a.substring(0, a.indexOf('/')));
			System.out.println(a1);
			b1 = Integer.parseInt(a.substring(a.indexOf('/') + 1));
			System.out.println(b1);
			a2 = Integer.parseInt(b.substring(0, b.indexOf('/')));
			b2 = Integer.parseInt(b.substring(b.indexOf('/') + 1));
		} catch (Exception e) {
			System.out.println("Wrong input!!!");
		}
	}

	public float add() {
		if (b2 != 0 && b1 != 0) {
			return ((a1 * b2) + (a2 * b1)) / (b1 * b2);
		}
		return -1;
	}

	public float multiplication() {
		if (b2 != 0 && b1 != 0) {
			return (a1 * a2) / (b1 * b2);
		}
		return -1;
	}

	public double division() {
		if (b2 != 0 && b1 != 0) {
			return (a1 * b2) / (a2 * b1);
		}
		return -1;
	}

	public float subtraction() {
		if (b2 != 0 && b1 != 0) {
			return ((a1 * b2) - (a2 * b1)) / (b1 * b2);
		}
		return -1;
	}
}

public class Practical1 {
	public static void main(String[] args) {
		Rational obj1 = new Rational("10/5", "1/5");
		System.out.println("After addition");
		System.out.println(String.format("%.5f", obj1.add()));
		System.out.println("After subtraction");
		System.out.println(String.format("%.5f", obj1.subtraction()));
		System.out.println("After multiplication");
		System.out.println(String.format("%.5f", obj1.multiplication()));
		System.out.println("After division");
		System.out.println(String.format("%.5f", obj1.division()));
	}
}