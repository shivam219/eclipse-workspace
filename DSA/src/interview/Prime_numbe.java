package interview;

import java.util.Scanner;

public class Prime_numbe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;

			}
			System.out.println(count == 2 ? "Primen number" : "NOt prime number");
		}

		else
			System.out.println("not prime number ");
	}
}
