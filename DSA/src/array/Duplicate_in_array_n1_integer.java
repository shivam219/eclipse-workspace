package array;

import java.util.Arrays;

public class Duplicate_in_array_n1_integer {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 2, 4, 6, 7, 3 };
		int match = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					match = arr[i];
			}
		}
		System.out.println("douplicate number : " + match);
		int match2 = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i+1]) {
				match = arr[i];
			}
		}
		System.out.println( match2);
		
	}
}
