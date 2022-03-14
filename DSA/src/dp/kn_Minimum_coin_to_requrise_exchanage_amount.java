package dp;

import java.util.Arrays;

public class kn_Minimum_coin_to_requrise_exchanage_amount {
	public static void main(String[] args) {
		int n = 18;
		int a[] = {7, 5, 1};
		
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		int ans = minCoins(n, a, dp);
		System.out.println(ans);
		
		for(int x: dp) {
			System.out.print(x+" ");
		}
	}
	// faster then all because memorization + top down
	static int minCoins(int n, int a[], int dp[]) {
		if(n == 0) return 0;
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i<a.length; i++) {
			if(n-a[i] >= 0) {
				int subAns = 0;
				if(dp[n-a[i]] != -1) {
					subAns = dp[n-a[i]];
				} else {
					subAns = minCoins(n-a[i], a, dp);
				}
				if(subAns != Integer.MAX_VALUE && 
						subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return dp[n] = ans;
	}
	

	static int minCoins(int n, int arr[]) {
		if (n == 0)
			return 0;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (n - arr[i] >= 0) {
				int subAns = minCoins(n - arr[i], arr);

				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return ans;
	}
}















