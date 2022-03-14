package searching;

public class Maximum_sum_of_2_adjanc {
		
	static int solve(int arr[] , int i , int n, int dp[] , boolean v[]) {
		if (i>=n)return 0;
		if(v[i])
			return dp[i];
		v[i] =true;
		dp[i] = Math.max(solve( arr,i+1,n,dp,v)
				,arr[i]+solve(arr,i+2,n,dp,v));
		return dp[i];
	}
	public static void main(String[] args) {
		int []arr = new int[] {5,3,2,1};
		int dp[] = new int[7];
		boolean v[] = new boolean[7];
		System.out.println(solve(arr ,0,arr.length,dp,v));
		}
}
