package dp;

public class kn_subset_of_given_sum_recursive_and_memorization {
	// simple recursion + memorizaion + with some stack
	static boolean t[][] = new boolean[100][100];
	static boolean isSubsetSum(int arr[], int n, int sum, boolean[][] t) {
		if (sum == 0)
			return true;
		if (n == 0)
			return false;
		if (arr[n - 1] < sum)
			return t[n][sum] = isSubsetSum(arr, n - 1, sum, t) || isSubsetSum(arr, n - 1, sum - arr[n - 1], t);
		return t[n][sum] = isSubsetSum(arr, n - 1, sum, t);
	}

// --- recursion + top down - saving decrease th espace complexity
	static boolean isSubsetSum(int arr[], int n, int sum) {
		boolean dp[][] = new boolean[n + 1][sum + 1];
		for (int i = 0; i < n + 1; i++)
			for (int j = 0; j < sum + 1; j++) {
				if (i == 0)
					dp[i][j] = false;
				if (j == 0)
					dp[i][j] = true;
				if (i != 0 && j != 0) {
					if (arr[i - 1] <= j)
						dp[i][j] = dp[i][j - arr[i - 1]] || dp[i - 1][j];
					else
						dp[i][j] = dp[i - 1][j];
				}
			}
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < sum + 1; j++) {
				System.out.print(dp[i][j] + "   ");
			}
			System.out.println();
		}

		return dp[n][sum];

	}

	public static void main(String[] args) {
		// Input: a set of items and a sum
		int[] A = { 3, 1, 3, 5, 6, 8 };
		int sum = 7;
		int n = A.length;
		boolean dp[][] = new boolean[n + 1][sum + 1];
		for (int i = 0; i < A.length + 1; i++)
			for (int j = 0; j < sum + 1; j++) {
				if (i == 0)
					dp[i][j] = false;
				if (j == 0)
					dp[i][j] = true;
			}
		
		if (isSubsetSum(A, n, sum)) {
			System.out.print("Subsequence with the given sum exists");
		} else {
			System.out.print("Subsequence with the given sum does not exist");
			
		}
		if (isSubsetSum(A, n, sum,t)) {
			System.out.print("Subsequence with the given sum exists");
		} else {
			System.out.print("Subsequence with the given sum does not exist");
			
		}
	}

}
