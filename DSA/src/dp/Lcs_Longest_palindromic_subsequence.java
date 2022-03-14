package dp;
//public int longestSubsequenceLength(final List<Integer> A) {}
public class Lcs_Longest_palindromic_subsequence {
	static int lcs(String X, String Y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (X.charAt(i - 1) == Y.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[n][m];
	}
	static void  palindrom(String x) {
		StringBuffer s  = new StringBuffer(x.toString());
		int l = lcs(x,s.reverse().toString(),s.length(),s.length());
		System.out.println(l);
		
		
	}
	public static void main(String[] args) {
		String x = "bebdeeedaddecebbbbbabebedc";
		palindrom(x);
		
	}
}
