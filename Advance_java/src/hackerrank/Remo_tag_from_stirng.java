package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Remo_tag_from_stirng {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("Programm To ");
//		int n = Integer.parseInt(sc.nextLine());
////		String pattern = "<(.+)>([^<]+)</\\1>";
//		String pattern = "^[<\\w>]+[</\\w>]$";
// //			
//		while (n-- > 0) {
//			String s = sc.nextLine();
//
//			if (s.matches(pattern)) {
//				System.out.println("Valid");
//			} else {
//				System.out.println("Invalid");
//			}
//		}

//------Non - Character word----------------------------------------------------------------
//		String regex = "\\w.*$";
//		int n = 0;
//		System.out.print("Enter No of time : -");
//		n = Integer.parseInt(sc.nextLine());
//		String[] in = new String[n];
//		// array ==lentgth() string ==lenght
//		for (int i = 0; i < in.length; i++) {
//			System.out.println("Enter value");
//			in[i] = sc.nextLine();
//		}
//		System.out.println("String non-character");
//		Pattern p = Pattern.compile(regex);
//		for (int i = 0; i < in.length; i++) {
//			Matcher m = p.matcher(in[i]); // it going to math
//			if (m.matches()) {
//				System.out.println(m.group());
//			}
//		}
		Scanner in = new Scanner(System.in);
		boolean matchFound = false;

		String line = in.nextLine();
		Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
		Matcher m = p.matcher(line);
		while (m.find()) {
			System.out.println(m.group(2));
		}

		System.out.println(Pattern.matches("<>",null ));
	}
}
