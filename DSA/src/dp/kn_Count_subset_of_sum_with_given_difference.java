package dp;

import java.util.Arrays;

public class kn_Count_subset_of_sum_with_given_difference {
	// the difference of the two sets.
	static int findMin(int arr[], int n, int sum) {
		
		boolean dp[][] = new boolean[n + 1][sum + 1];
		for (int i = 0; i <= n; i++)
			dp[i][0] = true;
		for (int i = 1; i <= sum; i++)
			dp[0][i] = false;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				dp[i][j] = dp[i - 1][j];
				if (arr[i - 1] <= j)
					dp[i][j] |= dp[i - 1][j - arr[i - 1]];
			}
		}
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < sum + 1; j++) {
				System.out.print( dp[i][j]==true?"  1":"  0");
			}
			System.out.println();
		}
		int diff = Integer.MAX_VALUE;
		for (int j = sum / 2; j >= 0; j--) {
			if (dp[n][j] == true) {
				diff = sum - 2 * j;
				break;
			}}
		return diff;}
	public static void main(String[] args) {
		int arr[] = { 2,3,4 };
		int n = arr.length;
		int sum =Arrays.stream(arr).sum();
		System.out.println("The minimum difference between 2 sets is " + findMin(arr, n,sum));
	}
}
