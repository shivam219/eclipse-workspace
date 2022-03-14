package array;

import java.util.Arrays;

public class Max_Min_array {
	public static void main(String[] args) {
		int arr[] = { 5, 100, 1, 2, 450, 320, 5 };

		int n = arr.length;
		int temp = 0;
		for (int i = 0;  i<arr.length; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				
				}

			}
		}
		int last = arr.length - 1;
		System.out.println(Arrays.toString(arr));
		System.out.println("Max :" + arr[last]);
		System.out.println("Min :"+ arr[0]);
		
		
	}

}