package array;

import java.util.Arrays;

public class Merger_two_array__with_space {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 11, 12, 13, 14, 15 };
		
		int merge[] = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, merge, 0, arr1.length);
		System.arraycopy(arr2, 0, merge, arr1.length, arr2.length); //  5 --> 6 adding here
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(merge));
	}

}
