package array;

import java.util.Arrays;

public class Chocalate_distributation {
	static int findMinDiff(int arr[], int n, int m) {
		if(n==0|| m==0) 
			return 0;
		Arrays.sort(arr);
		int max_diff = Integer.MIN_VALUE;
		int min_diff = Integer.MAX_VALUE;
		for(int i =0;i+m-1<n;i++) {
			int diff = arr[i+m-1] - arr[i];
			if(diff<min_diff)
				min_diff = diff;
			if(max_diff<diff) {
				max_diff = diff; 
			}
		}
		
		return min_diff;
	}

	public static void main(String[] args) {

		int arr[] = {1,3,4,9,9,7,12,56 };

		int m = 7;
		int n = arr.length;
		System.out.println("Minimum difference is");
		System.out.println(findMinDiff(arr, n, m));
		int max = Integer.MAX_VALUE;
		System.out.println(max);
	}

}
