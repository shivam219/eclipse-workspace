package dp;

public class Lcs_MInimum_no_of_insert_and_Deletion_to_make_palindrom {
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
	static int palindrom(String x) {
		StringBuffer s = new StringBuffer(x);
		int i = lcs(x,s.reverse().toString(),s.length(),s.length());
		return i;
	}
	public static void main(String[] args) {
		String x = "abefbe";int  n = x.length();
		int nn =palindrom(x);
		System.out.println(n-nn);
		System.out.println("minimum no of deletion " +(n- nn));
		System.out.println("minimum no of insertion" + (n-nn));
			
		
		
	}

}
