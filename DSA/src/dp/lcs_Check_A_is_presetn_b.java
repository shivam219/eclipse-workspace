package dp;

public class lcs_Check_A_is_presetn_b {
	static int lcs(String X, String Y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
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
	public static void main(String[] args) {
		String x = "agc";
		String y = "agbcba";
		int n = x.length();
		int m = y.length();
		int nn =(lcs(x,y,n,m));
		System.out.println(nn);
		System.out.println(nn==n? "yes":"no");
		
		
		
		
	}
}
