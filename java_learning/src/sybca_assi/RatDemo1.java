package sybca_assi;

public class RatDemo1 {
	static public void main(String args[]) {
		RatNumber k = new RatNumber(3, 4);
		System.out.println(k);
	}
}

class RatNumber {
	int num; // The numerator
	int den; // The denominator

	public RatNumber(int x, int y) {
		num = x;
		den = y;
	}

	public String toString() {
		return "(" + num + "/" + den + ")";
	}
}
