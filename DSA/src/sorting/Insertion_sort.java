package sorting;

import java.util.Arrays;

public class Insertion_sort {
	public static void main(String [] args) {
//		int arr[] = new int[] { 3, 2, 1, 5, 4, 6 };
		int arr[] = new int[] { 5,1,5,9,2};
		insertionSort(arr);

	}

	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++ ) {
			int temp  = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= temp;
		}
		Arrays.stream(arr).forEach(e->System.out.println(e));
	}
	

}
