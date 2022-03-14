package string;

public class String_Rotation {
	static boolean areRotations(String str1, String str2) {
		// There lengths must be same and str2 must be
		// a substring of str1 concatenated with str1.
		System.out.println("hellow check rotation of string");
		System.out.println(((str1 +	str1).indexOf(str2) != -1));
		return (str1.length() == str2.length()) && ((str1 +	str1).indexOf(str2) != -1);
									// return 0 or -1 
//									// that convert 0 & 1s  to boolean by != -1
		
	}

	public static void main(String[] args) {
		String str1 = "AACD";
		String str2 = "ACDA";
		String a = "abc";
		String b = "cba";
		
//
//		if (areRotations(str1, str2))
//			System.out.println("Strings are rotations of each other");
//		else
//			System.out.printf("Strings are not rotations of each other");
		System.out.println((a+b).indexOf(b));// equal -> 0 | not equal -> -1

	}
}
