package dp;

public class Lcs_Print_longest_common_subsequce {
	static void lcs(String X, String Y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (X.charAt(i - 1) == Y.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}}
		int i = n;
		int j = m;
		StringBuffer s = new StringBuffer();
		while (i > 0 && j > 0) {
			if (X.charAt(i - 1) == Y.charAt(j - 1)){
				s.append(X.charAt(i-1));	
				i--;
				j--;
			}
			else if (dp[i - 1][j] > dp[i][j - 1])
				i--;
			else
				j--;
		}
	System.out.println(s.reverse());
		}
	public static void main(String[] args) {
		String X = "AGGTAB";
		String Y = "GXTXAYB";
		int m = X.length();
		int n = Y.length();
		lcs(X, Y, m, n);
	}
}
