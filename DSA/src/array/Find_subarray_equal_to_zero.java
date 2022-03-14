package array;

import java.util.HashMap;
import java.util.Map;

public class Find_subarray_equal_to_zero {
	public static void printAllSubarrays(int[] A) {
		// consider all subarrays starting from `i`
		for (int i = 0; i < A.length; i++) {
			int sum = 0;

			// consider all subarrays ending at `j`
			for (int j = i; j < A.length; j++) {
				// sum of elements so far
				sum += A[j];

				// if the sum is seen before, we have found a subarray with zero-sum
				if (sum == 0) {
					System.out.println("Subarray [" + i + "…" + j + "]");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

		printAllSubarrays(A);
	System.out.println(	isSum(new int[] {4,2,-3,1,6}));
	
	}

	// find_is_there are subarray equal to zero
	static boolean isSum(int[] arr) {
		int n = arr.length;  int sum = 0;
		Map<Integer,Integer> map = new HashMap<>();
 		for (int i = 0; i < n; i++) {
 			sum = sum + arr[i];
			
 			if(sum==0 || map.containsKey(sum )|| arr[i] ==0 )
 				return true;
 			else {
 				map.put(sum, null) ;
 			}

		}
		return false;
	}
}
