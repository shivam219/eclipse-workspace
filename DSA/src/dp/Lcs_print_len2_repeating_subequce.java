package dp;

public class Lcs_print_len2_repeating_subequce {

	static  boolean isPalindrome(String str, int s, int e) {
		while (s < e) {
			if (str.charAt(s) != str.charAt(e))return false;
	
			s++;
			e--;
		}
		return true;
	}

	int anytwo(String A) {
		int t[] = new int[256];
		for (int i = 0; i < A.length(); i++) {
			t[A.charAt(i)]++;
			if (t[A.charAt(i)] > 3)
				return 1;
		}
		String str = "";
		for (int i = 0; i < A.length(); i++) {
			if (t[A.charAt(i)] > 1) {
				str = str + A.charAt(i);
			}
		}
		int k = str.length();
		if (isPalindrome(str, 0, k - 1)) {
			if (k % 2 == 0) {
				return 0;
			}
			return str.charAt(k / 2) == str.charAt(k / 2 - 1) ? 1 : 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		String s = "aabbbcc";
//		System.out.println(anytwo(s));
		Lcs_print_len2_repeating_subequce ob = new Lcs_print_len2_repeating_subequce();
		
		System.out.println(ob.anytwo(s));
	}

}
