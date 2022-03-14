package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 9, 6, 7, 10, 6, 5 };
		MergeSort ob = new MergeSort();
		ob.sort(arr);
		Arrays.stream(arr).forEach(e->System.out.println(e));
		Arrays.stream(ob.arr).forEach(e->System.out.println(e));
		
	}

	int[] arr;
	int[] temp;
	int len;

	public void sort(int[] arr) {
		this.len = arr.length;
		this.arr = arr;
		this.temp = new int[len];
		divide(0, len - 1);// a - first b - last
	}

	public void divide(int low, int high) {
		if(low<high) {
		int mid = low + (high - low) / 2;
		divide(low, mid);// left side

		divide(mid + 1, high);// right side
		merge(low, mid, high);
	}}

	public void merge(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = arr[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				temp[k] = temp[j];
				j++;
			}
			k++;

		}
		while (i <= mid) {
			arr[k] = temp[i];
			k++;
			i++;
		}
	}
}
