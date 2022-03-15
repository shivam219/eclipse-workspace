package hackerrank;

import java.util.regex.Pattern;

public class String_pattern {
	public static void main(String[] args) {
//		System.out.println("String pattern");
//		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
//		while (testCases-- > 0) {
//			String pattern = in.nextLine();
//			if (!pattern.isBlank()) {
//				try {
//					Pattern.compile(pattern);
//					System.out.println("Valid");
//				} catch (PatternSyntaxException e) {
//					System.out.println("Invalid");
//				}
//			} else {
//				System.out.println("Please enter value");
//				}
//		}
//		in.close();
//		System.out.println(Pattern.matches("[MS][a-z]{5}", "nica"));
		System.out.println(Pattern.matches("[amn]", "a"));
		// only math 1 value 
		System.out.println(Pattern.matches("[^amn]", "t"));
		// ^ == value no amn
		System.out.println(Pattern.matches("[a-zA-S]", "T"));
		// range a<=v && v=> Z
		System.out.println(Pattern.matches("[a-ds-u]", "b"));
		// rang v <= d a++ s <=u s++

		System.out.println(Pattern.matches("[MS] [a-z]  {5}",   "Monica"));
										//  true  false  0 to 5  012345
		
//		-------------------------------------------------
//		x ? x occures once or not at all
		System.out.println(Pattern.matches("[xyz]", "x"));
//		x+ x occurs once or more		
		System.out.println(Pattern.matches("[xyz]+", "xx"));
//		x* x occurs zero or more times
		System.out.println(Pattern.matches("[xyz]*", "x"));
//		"\\d" , only check for digit
		System.out.println(Pattern.matches("\\d", "1"));
//		"\\D" , only check for character
		System.out.println(Pattern.matches("\\D", "a"));
//											range == [] lengh == {}
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcsid"));
		
//		String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
		String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
//		public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;				
	}
}