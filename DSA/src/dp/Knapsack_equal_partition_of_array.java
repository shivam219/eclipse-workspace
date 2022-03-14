package dp;

public class Knapsack_equal_partition_of_array {
	static boolean isSubsetSum(int arr[], int n, int sum) {
		boolean dp[][] = new boolean[n+1][sum+1];
		for(int i =0;i<n+1;i++)
			for(int j=0;j<sum+1;j++) {
				if(i==0) dp[i][j]=false;
				if(j==0) dp[i][j]=true;
				if(i!=0 && j!=0) {
				if(arr[i-1]<=j)
					dp[i][j] = dp[i][j-arr[i-1]]|| dp[i-1][j];
				else 
					dp[i][j]= dp[i-1][j];
				}
			}
	
		return dp[n][sum];
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 5, 11 };
		boolean re = false;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
		}
		if (count % 2 == 0) {
			sum = count / 2;
			System.out.println(sum);
			re = isSubsetSum(arr, arr.length, sum);
		} else
			System.out.println("not");
		System.out.println(re);
	}
	
}
