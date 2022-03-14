package interview;

import static java.lang.Math.max;
import static java.lang.System.*;

public class exponent {
	public static void main(String[] args) {
		System.out.println(Math.exp(1));
		System.out.println(Math.exp(2));
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NaN);
		double d = Double.NaN;
		System.out.println(Double.isNaN(d));
		int year = 2004;
		if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
			System.out.println("leap year");
			System.out.println(year%400);
			System.out.println(year%100);
		}
		else
			System.out.println("leap year");
	}
	public int rev (int num) {
		int rev = 0;
		while(num!=0) {
			int lastDigit = num%10;
			rev = rev * 10 + lastDigit;
			num = num/10;
		}
		return 1;
	}
	static int rev = 0;
	public int revRecursion(int num) {
	 if(num==0) {return 0;}
	 else {
		 rev= rev * 10 + (num%10);
		 return revRecursion(num/10);
	 }
	 
	}
}

