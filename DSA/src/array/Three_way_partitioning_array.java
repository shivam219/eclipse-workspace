package array;

import java.util.Arrays;

public class Three_way_partitioning_array {
	// Partitions arr[0..n-1] around [lowVal..highVal]
	public static void threeWayPartition(int[] arr, int low, int high) {
		int n = arr.length;
		// Initialize ext available positions for
		// smaller (than range) and greater lements
		int st = 0, end = n - 1;
		// Traverse elements from left
		for (int i = 0; i <= end;) {
			// If current element is smaller than
			// range, put it on next available smaller
			// position.
			if (arr[i] < low) {

				int temp = arr[st];
				arr[st] = arr[i];
				arr[i] = temp;
				st++;
				i++;}
			// If current element is greater than
			// range, put it on next available greater
			// position.
			else if (arr[i] > high) {
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
			}
			else i++;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 9, 5,  20, 84, 3};

		threeWayPartition(arr, 10, 20);

		System.out.println("Modified array ");
		Arrays.stream(arr).forEach(e->System.out.println(e));
	}
}
