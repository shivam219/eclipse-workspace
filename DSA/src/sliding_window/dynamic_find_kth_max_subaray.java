package sliding_window;

import java.util.Arrays;

public class dynamic_find_kth_max_subaray {
	public static void main(String[] args) {//
		// this only capable with positive values
		// find subarray that sum equal k = 5
		int arr[] = {  2, 3,  2, 1 , 1 , 3};
		
		int j = 0, k = 5, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
			if(sum>k) {
				sum  = sum -arr[j];
				j++;
			}
			if (sum == k) {
				int arr2[] = Arrays.copyOfRange(arr, j, i+1);
				System.out.println();
				for(int b : arr2)System.out.print(b);
				sum = sum - arr[j];
				j++;
			}
		
		}
//		for (int i = 0; i < arr.length; i++) { // depend on sum == k 
//			sum = sum + arr[i];
//			if (sum == k) {
//				max = sum;
//				sum = sum - arr[j];
//				j++;
//			}
//			else if(sum>k) {
//				sum = sum-arr[j];
//				j++;
//			}
//		}
	}
}
