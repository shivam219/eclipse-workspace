package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to sort array ");
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n + 2];

		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		sc.close();
		Arrays.sort(s);
		for(String i : s) {
			System.out.println(i);
		}

	}
}
