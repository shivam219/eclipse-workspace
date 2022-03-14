package sorting;

import java.util.Arrays;

public class Selection_sort {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 2, 23, 4, 7 };
		selectionSort(arr);
//		selectionSort(arr, 3);
	}
	public static void selectionSort(int[] arr) {
		int val = Integer.MAX_VALUE;
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < val) {
					val = arr[j];
					idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = val;
			arr[idx] = temp;
			val = Integer.MAX_VALUE;
		}
		Arrays.stream(arr).forEach(e -> System.out.println(e));	
	}
	
	public void buble(int arr[]) {
		for(int i = 0; i<arr.length-1;i++) {
			for(int j= i+1 ; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j] =temp;
				}
			}
			Arrays.stream(arr).forEach(e -> System.out.println(e));	
		}
		
	}
	private void selection(int arr[]) {
		int val = Integer.MAX_VALUE;int idx = 0;
		for(int i= 0; i<arr.length-1;i++) {
			for(int j= i; i<arr.length;i++) {
				if(arr[j]<val) {
					val= arr[j];
					idx=j;
				}
			}
			int temp = arr[i];
			arr[i] =val;
			arr[idx] = temp;
		}
		Arrays.stream(arr).forEach(e -> System.out.println(e));	
	}
	private void insert(int arr[]) {
		for(int i = 1 ; i<arr.length;i++) {
			int temp =arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =temp;
		}
		Arrays.stream(arr).forEach(e -> System.out.println(e));	
	}
}