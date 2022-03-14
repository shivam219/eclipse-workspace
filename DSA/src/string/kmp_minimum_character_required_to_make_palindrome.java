package string;

public class kmp_minimum_character_required_to_make_palindrome {
	public static int[] computeLPS(String s, int[] lps) {
		int m = s.length();
		int len = 0;
		lps[0] = 0;
		int i = 1;
		while (i < m) {
			if (s.charAt(i) == s.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	public int solve(String a) {
		StringBuilder s = new StringBuilder(a);
		s = s.reverse();
		String str = a + "$" + s.toString();
		int[] lps = new int[str.length()];
		computeLPS(str, lps);
		return (a.length() - lps[str.length() - 1]);
	}

	public static int[] kmp(char[] arr) {
		int vis[] = new int[arr.length];
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[j]) {
				vis[i] = j + 1;
				j++;
			} else {
				if (j - 1 != -1) {
					j = vis[j - 1];
					i--;
				}
			}
		}
		return vis;
	}

	public static void main(String[] args) {
		String a = "abebaf";
		StringBuilder s1 = new StringBuilder(a);
		s1 = s1.reverse();
		String str1 = a + "$" + s1.toString();
		int lps31[] =kmp(str1.toCharArray());
		
		StringBuilder s = new StringBuilder(a);
		s = s.reverse();
		String str = a + "$" + s.toString();
		int[] lps = new int[str.length()];
		int lps3[] =computeLPS(str, lps);
		
		for(int n : lps31) {
			System.out.println(n);
		}
		System.out.println("second one");
		for(int n : lps3) {
			System.out.println(n);
		}
		
		
		
	}
}
