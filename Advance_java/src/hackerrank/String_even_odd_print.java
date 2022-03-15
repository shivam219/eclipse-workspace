package hackerrank;

import java.util.Scanner;

public class String_even_odd_print {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.print("Enter n time ");
//		int n = Integer.parseInt(sc.nextLine());
//		String s = "";
//		System.out.println("Enter String");
//		while (n-- >= 0) {
//
//			s = sc.nextLine();
//			// even value
//			for (int i = 0; i < s.length(); i += 2) {
//				System.out.print(s.charAt(i));
//			}
//			System.out.print(" ");
//			for (int j = 1; j < s.length(); j += 2) {
//				System.out.print(s.charAt(j));
//			}
//			System.out.println("\n");
//		}
//		sc.close();

		System.out.println("Enter no time ");
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		for (int ii = 0; ii < n; ii++) {
			String c = s[ii];
			for (int i = 0; i < c.length(); i += 2) {
				System.out.print(c.charAt(i));
			}
			System.out.print(" ");
			for (int j = 1; j < c.length(); j += 2) {
				System.out.print(c.charAt(j));
			}
			System.out.println();
		}

		sc.close();
	}

}
