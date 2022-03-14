package dp;

//----way to convert arr to string
//String c_s1=new String(c2);
//System.out.println(c_s1);
import java.util.Arrays;

public class mcm_sramble_string {

	static int isScramble(String S1, String S2) {

		if (S1.length() != S2.length()) {
			return 0;
		}

		int n = S1.length();
		if (n == 0) {
			return 1;
		}
		if (S1.equals(S2)) {
			return 1;
		}
		char[] c1 = S1.toCharArray();
		char[] c2 = S2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		String c_s1 = new String(c1);
		String c_s2 = new String(c2);

		if (!c_s1.equals(c_s2)) {
			return 0;
		}

		for (int i = 1; i < n; i++) {
			if (isScramble(S1.substring(0, i), S2.substring(0, i)) == 1
					&& isScramble(S1.substring(i, n), S2.substring(i, n)) == 1) {
				return 1;
			}

			if (isScramble(S1.substring(n - i, n), S2.substring(0, i)) == 1
					&& isScramble(S1.substring(0, n - i), S2.substring(i, n)) == 1) {
				return 1;
			}
		}
		return 0;
	}

// Driver Code
	public static void main(String[] args) {
		String S1 = "abbbcbaaccacaacc";
		String S2 = "acaaaccabcabcbcb";

		if (isScramble(S1, S2) == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
