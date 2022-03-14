package array;

import java.util.Arrays;

public class Given_array_0_1_2_sort_without_sorting_algo {
	public static void main(String[] args) {
		int arr[] = new int[] { 0, 2, 1 };
		int i = 0;
		if (arr[i] < arr[i + 1]) {
			if (arr[i] < arr[i + 2]) {
			} else {
				int temp = arr[i + 2];
				arr[i + 2] = arr[i + 1];
				arr[i + 1] = temp;
			} Arrays.stream(arr).forEach(e -> System.out.println(e));
		}
		/// arrr[ 2 1 0}
		else if(arr[i]>arr[i+1]) {
			
			if(arr[i]> arr[i+2]) {
				
			}
		}
	}
}
