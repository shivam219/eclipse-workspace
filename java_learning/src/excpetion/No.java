package excpetion;

import java.util.Scanner;

public class No {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = 0, b = 0, c = 0;
//
//		try {
//			a = sc.nextInt();
//			sc.nextLine();
//			b = sc.nextInt();
//			sc.nextLine();
//			System.out.println(a / b);
//		} catch (ArithmeticException | InputMismatchException e) {
//			if( e instanceof ArithmeticException  ) {
//				
//			}
//			else if( e instanceof InputMismatchException) {
//				
//			}
//		}
//-------------------- short-line

//		try (Scanner sc = new Scanner(System.in)) { // sc is destroy in minutese
//			System.out.println(sc.nextInt()/sc.nextInt());
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		} catch (InputMismatchException i) {// multiple catch is allowed
//			System.out.println(i.getClass().getName()); // printing olny single attribute --1
////			i.printStackTrace(); // for printing all related classe
//			System.out.println(i); //// printing olny single attribute  --------------------2
//		}

//---------------------find negative and zero------------------------
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt(), c = 0;
		if (n == 0 || p == 0) {
			System.out.println("java.lang.Exception: n and p should not be zero.");
		} else if (n < 0 || p < 0) {
			System.out.println("java.lang.Exception: n or p should not be negative.");
		} else {
			while (p-- > 0) {
				c = c + n;

			}
			System.out.println(c);
		}
	}

	public long power(int n, int p) throws Exception {
		long result;
		if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		}
		result = (long) Math.pow(n, p);
		return result;
	}
}
