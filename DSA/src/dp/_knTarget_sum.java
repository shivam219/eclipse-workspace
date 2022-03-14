package dp;
public class _knTarget_sum {
	static int findTargetSumWays(int arr[], int S) {
		int cnt = 0, sum = 0;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (arr[i] == 0)
				cnt = cnt + 1;
		}
		if (S > sum)
			return 0;
		if ((S + sum) % 2 != 0)
			return 0;
		int s = (S + sum) / 2;
		int dp[][] = new int[n + 1][s + 1];
		for (int i = 0; i < n + 1; i++)
			dp[i][0] = 1;
		for (int j = 1; j < s + 1; j++)
			dp[0][j] = 0;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < s + 1; j++) {
				if (arr[i - 1] == 0)
					dp[i][j] = dp[i - 1][j];
				else if (j < arr[i - 1])
					dp[i][j] = dp[i - 1][j];
				else
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
			}
		}

		return (int) (Math.pow(2, cnt) * dp[n][s]);
	}
	public static void main(String[] args) {
		System.out.println(findTargetSumWays(new int[] {1,2,1,3},1));	
	}
}
