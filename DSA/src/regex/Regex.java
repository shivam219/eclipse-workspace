package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("No of time :- ");
		int n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			System.out.println("Enter your Phone number: ");
			String phone = sc.next();

			String regex = "\\d{10}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phone);

			if (matcher.matches()) {
				System.out.println("Given phone number is valid");
			} else {
				System.out.println("Given phone number is not valid");
			}
		}
	}
}
