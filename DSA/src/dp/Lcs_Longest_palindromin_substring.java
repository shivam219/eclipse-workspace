package dp;

public class Lcs_Longest_palindromin_substring {
	static String longestPalSubstr(String str) {
		int n = str.length();
		boolean dp[][] = new boolean[n][n];
		int maxLength = 1;
		for (int i = 0; i < n; ++i)
			dp[i][i] = true;
		int start = 0;
		for (int i = 0; i < n - 1; ++i) 
			if (str.charAt(i) == str.charAt(i + 1)) {
				dp[i][i + 1] = true;
				start = i;
				maxLength = 2;
			}
		for (int k = 3; k <= n; ++k) {

			// Fix the starting index
			for (int i = 0; i < n - k + 1; ++i) {
				// Get the ending index of substring from
				// starting index i and length k
				int j = i + k - 1;
				// jth index iff str.charAt(i+1) to
				// str.charAt(j-1) is a palindrome
				if (dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
					dp[i][j] = true;

					if (k > maxLength) {
						start = i;
						maxLength = k;
					}
				}
			}
		}
		for(int i = 0; i<n;i++) {
			for(int j =0; j<n;j++) {
				System.out.print("   "+dp[i][j]);}
			System.out.println();}
		return str.substring(start, start+maxLength);
	}

	public static void main(String[] args) {
	 String str = longestPalSubstr("geaeg");
	 System.out.println(str);
	}
}
