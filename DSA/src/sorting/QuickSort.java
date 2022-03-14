package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 2 , 3 , 1 , 5 , 4 , 6 , 8 };
		quickSort(arr, 0, arr.length - 1);
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

	}

	public static void quickSort(int[] arr, int l, int r) {
		int pi = partition(arr, l, r);
		if (l < pi - 1) {
			quickSort(arr, l, pi - 1);
		}
		if (r > pi) {
			quickSort(arr, pi, r);
		}
	}
	public static int partition(int arr[], int l, int r) {
		int mid = arr[(l + r) / 2];
		while (l <= r) {
			while (arr[l] < mid) {
				l++;
			}
			while (arr[r] > mid) {
				r--;
			}
			if (l <= r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		return l;
	}
}
