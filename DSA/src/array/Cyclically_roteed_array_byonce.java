package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclically_roteed_array_byonce {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = new int[arr.length];
		arr2[0] = arr[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			arr2[i + 1] = arr[i];
		}
		Arrays.stream(arr).forEach(e -> System.out.print("  " + e));
		System.out.println();
		Arrays.stream(arr2).forEach(e -> System.out.print("  " + e));

	}
}
