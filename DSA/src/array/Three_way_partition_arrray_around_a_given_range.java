package array;

import java.util.Arrays;

public class Three_way_partition_arrray_around_a_given_range {

	public static void main(String[] args) {
		int arr[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		partition(arr, 14, 50);
	}

	public static void partition(int[] arr, int a, int b) {

		int n = arr.length;
		int left = 0, right = n - 1;
		for (int i = 0; i <= right;) {
			if (arr[i] < a) {
				int temp = arr[left];
				arr[left] = arr[i];
				arr[i] = temp;
				left++;
				i++;
			}

			else if (arr[i] > b) {
				int temp = arr[right];
				arr[right] = arr[i];
				arr[i] = temp;
				right--;
			} else
				i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
