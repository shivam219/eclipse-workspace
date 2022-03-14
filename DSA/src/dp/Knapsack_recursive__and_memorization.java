package dp;

import static java.lang.Math.*;

import java.util.Arrays;

public class Knapsack_recursive__and_memorization {
	static int kn(int wt[], int val[], int w, int n, int[][] dp) {

		if (n == 0 || w == 0)
			return 0;
		if (dp[n][w] != -1)
			return dp[n][w];
		if (wt[n - 1] <= w)
			return dp[n][w] = max(val[n - 1] + kn(wt, val, w - wt[n - 1], n - 1, dp), kn(wt, val, w, n - 1, dp));
		else 
		return dp[n][w] = kn(wt, val, w, n - 1, dp);
	

	}

	static int knre(int wt[], int val[], int w, int n) { // n = 5
		if (n == 0 || w == 0)
			return 0;
		else if (wt[n - 1] <= w) {
			return max(val[n - 1] + knre(wt, val, w - wt[n - 1], n - 1), knre(wt, val, w, n - 1));
		} else
			return knre(wt, val, w, n - 1);

	}

	public static void main(String[] args) {
		int val[] = { 5, 4 }; // 5
		int wt[] = { 2, 2 };
		int n = wt.length;

		System.out.println(Arrays.toString(wt) + "\n" + Arrays.toString(val) + " \n");
		int wait = 3;
//------------Recursion
		System.out.println(knre(wt, val, wait, val.length));
//------------Memorization
		int dp[][] = new int[val.length + 1][wait + 1];
		for (int i = 0; i < val.length + 1; i++) {
			for (int j = 0; j < wait + 1; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(kn(wt,val,wait,n,dp));
//		System.out.println(kn(wt, val, wait, val.length, dp));
//		for(int i =0; i<=n;i++) 
//			for(int j =0;j<=wait;j++)
//				if(dp[i][j]==0) dp
	}

}
