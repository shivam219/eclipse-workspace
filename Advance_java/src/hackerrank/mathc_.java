package hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class mathc_ {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String value = sc.nextLine();
//		BigInteger v = new BigInteger(value);
//		String cndi = sc.nextLine();
//		BigInteger c = new BigInteger(cndi);
//		System.out.println(v.add(c));
//		System.out.println(v.multiply(c));
//		256bit ascii table 1 255 1 ! 2$ 
		char a = 92; // 65 - A - 91 //97 - a 
		System.out.println(a);
		for (int i = 0; i <= 256; i++) {
			a = (char) i;
			System.out.print(a+" ");
		}
	}

}
