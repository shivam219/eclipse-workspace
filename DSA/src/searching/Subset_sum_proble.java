package searching;

public class Subset_sum_proble {
	static boolean isSubsetSum(int arr[], int n, int sum,boolean dp[][]) {
		if (sum == 0)
			return true;
		if (n == 0)
			return false;
		if (arr[n - 1] > sum)
			return isSubsetSum(arr, n - 1, sum,dp);
		return isSubsetSum(arr, n - 1, sum,dp) || isSubsetSum(arr, n - 1, sum - arr[n - 1],dp);
	}
	public static void main(String[] args) {
		int arr[] = new int[] { 3, 1, 3, 5, 6, 8 };
		int sum = 7;
		int n = arr.length;
		boolean dp[][] = new boolean[n + 1][sum + 1];
		System.out.println(isSubsetSum(arr, n, sum,dp));

	}
}
