package interview;

import java.util.Arrays;

public class Array_equal {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 3, 5, 6 };
		int arr2[] = { 1, 2, 3, 4, 5, 6, 3, 5, 6 };

		boolean b = Arrays.equals(arr1, arr2);
		System.out.println(b);

		boolean status = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i] != arr2[i])
					status =false;
			}
		} else
			System.out.println("Not Equal");
		System.out.println(status ? " Equal":"Not equal");
	}
}
