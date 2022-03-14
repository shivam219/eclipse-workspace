package Array;

import java.util.Arrays;

public class Arraycycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };
		Arrays.stream(arr).forEach(e -> System.out.print(e + "  "));System.out.println();
		int val = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];

		arr[0] = val;

		Arrays.stream(arr).forEach(e -> System.out.print(e + "  "));
	}

}
