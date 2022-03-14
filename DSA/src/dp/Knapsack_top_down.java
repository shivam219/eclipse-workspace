package dp;

public class Knapsack_top_down {
	static int knapSack(int w, int wt[], int val[], int n) {
		
		int dp[][] = new int[n + 1][w + 1];
		for (int i = 0; i <= n; i++) {
			for ( int  j = 0; j <= w; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (wt[i - 1] <= j)
					dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]],
							dp[i - 1][j]);
				else
					dp[i][j] = dp[i - 1][j];
			}
		}
		for(int i = 0;i<n+1;i++ ) {
			for(int j =0;j<w+1;j++) {
				System.out.print("  "+ dp[i][j]);
				
			}
			System.out.println();
		}

		return dp[n][w];
	}
	public static void main(String[] args) {
		int val[] = new int[] { 4, 5 };
		int wt[] = new int[] { 2, 2  };
		int W = 3;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}

}
