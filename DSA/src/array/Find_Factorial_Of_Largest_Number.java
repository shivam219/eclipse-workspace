package array;

import java.math.BigInteger;

public class Find_Factorial_Of_Largest_Number {
	// 5 = 1*2*3*4*5
	int factorial(int f) {
		int o = 1;
		for (int i = 1; i <= f; i++)
			f = f * i;
		return o;
	}

	int factorial1(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial1(n - 1));
	}

	int factorial2(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial2(n - 1));
	}

	public static void main(String[] args) {

		BigInteger fact = BigInteger.valueOf(1);
		System.out.println(fact);
		for (int i = 1; i <= 8; i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		System.out.println(fact);
//		BigInteger f1 = BigInteger.valueOf(1);
//		for(int i=1;i<=8;i++) {
//			f1 = f1.multiply(BigInteger.valueOf(i));
//		}
//		System.out.println(f1);
		System.out.println(big(20));
	}
	/// biginteger return biginteger
	static BigInteger big(int n) {
		BigInteger f = new BigInteger("1");
		for(int i = 2 ; i<n;i++)
			f = f.multiply(BigInteger.valueOf(i));// covert default long value of 
		return f;
	}
}
