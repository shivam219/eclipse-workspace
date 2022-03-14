package string;

public class kmp_mimium_character_add_last {
	public static void main(String[] args) {
	System.out.println(solve("abeb"));
	}

	public static int solve(String A) {
		int n = A.length();
		int c = 0;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			if (A.charAt(i) != A.charAt(j)) {
				c = i + 1;
				j = n - 1;
			} else if (A.charAt(i) == A.charAt(j)) {
				j--;
			}
			i++;
		}
		return c;
	}
}
