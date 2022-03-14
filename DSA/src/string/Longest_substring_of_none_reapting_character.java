package string;

public class Longest_substring_of_none_reapting_character {
	public static int longestUniqueSubsttr(String str) {
		String test = "";
		int mlen = -1;		// Result
		if (str.isEmpty()) {	// Return zero if string is empty
			return 0;
		}
		else if (str.length() == 1) {		// Return one if string length is one
			return 1;
		}
		for (char c : str.toCharArray()) {
			String current = String.valueOf(c);

			// If string already contains the character
			// Then substring after repeating character
			if (test.contains(current)) {
				test = test.substring(test.indexOf(current) + 1);
			}
			test = test + String.valueOf(c);
			mlen = Math.max(test.length(), mlen);
		}

		return mlen;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("The input string is " + str);

		int len = longestUniqueSubsttr(str);
		System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
	}

}
