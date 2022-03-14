package interview;

import java.util.Arrays;

public class matrix_in_java {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 4, 5, 6 } };
		for (int[] ar : arr) {
			Arrays.stream(ar).forEach(e -> System.out.print(e + " "));
			System.out.println();
		}
		System.out.println(arr[0][1]);
	
		digonal(arr);
	}

	public static void digonal(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum += arr[j][i];
				}
			}
		}
		System.out.println(sum);
	}
}