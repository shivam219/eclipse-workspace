package dp;

import searching.main;

public class Lcs_Minimum_numebr_of_insert_delete_to_make_a_to_b {
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

	static void insert(String x, String y) {
		int n = x.length();
		int m = y.length(); 
		int l = lcs(x,y,x.length(),y.length());
		int in = m-l; int de = n-l;
		System.out.println("minimum no of delettion "+de);
		System.out.println("minimum no of insert  "+ in);
	}

	public static void main(String[] args) {
		String x = "aabc";
		String y = "ebc";
		insert(x, y);
	}
}
