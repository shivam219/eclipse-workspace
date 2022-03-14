package hackerrank;

import java.util.Scanner;

public class valid_email {
//	"^[a-zA-Z]\\w{7,29}$"
//	\^............... The beginning of a line
//	\$............... The end of a line
//	\w .............. A word character
//	\X{n,m}..... X, at least n but not more than m times
//	public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String regex = "^[\\w_\\-\\.]+[@]+[a-z]+[\\.][a-z]{2,3}$";

		System.out.println("hello");
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String email = scan.nextLine();

			System.out.println(email.matches(regex) ? "valid" : "Invalid");
		}

	}

}