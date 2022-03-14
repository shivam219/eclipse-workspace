package dp;

import java.util.Arrays;

public class kn_Count_subset_sum_with_given_sum {
	static int subsetSum(int a[], int n, int sum) {
		int dp[][] = new int[n + 1][sum + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= sum; i++)
			dp[0][i] = 0; // row 0
		for (int i = 1; i <= n; i++)
			dp[i][0] = 1;// to colonm
		for (int i =  1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (a[i - 1] <= j)
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - a[i - 1]];

				else 
					dp[i][j] = dp[i - 1][j];
			}
		}

		return dp[n][sum];
	}

	public static void main(String[] args) {
		int a[] = { 2, 2, 4 };
		int n = a.length;
		int sum = 4;
		System.out.println(subsetSum(a, n, sum));
	}
}