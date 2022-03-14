package array;

import java.util.Arrays;
import java.util.Stack;

public class Find_subarray_with_given_sum {

//	public static void subarray_sum(int a[], int sum) {
//		int cursum = 0;
//		int start = 0;
//		int end = 0;
////		HashMap<K,V>
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < a.length; i++) { // 1 4 -1
//			cursum += a[i];
//			if (cursum - sum == 0) {
//				start = 0;
//				end = i;
//				break;
//
//			}
//			if (map.containsKey(cursum - sum)) {
//				start = 0;
//				end = i;
//				break;
//			}
//			map.put(cursum, i);
//
//		}
//		if (end == -1) {
//			System.out.println("not founded ");
//		} else {
//			System.out.println(start + " " + end);
//		}
//	}
	public static int[] subarray_sum(int arr[], int sum) {
		int cursum = 0;
		int last = 0;
//		int arr[] = new int[] { 1, 4, -1, 1, 6, -1 };
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			cursum += arr[i];
			last = 0;
			if (cursum == sum) {
				for (int j = last; j <= i; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
			if (cursum < 0 || cursum > sum) {
				last = i + 1;
			}

		}return arr;

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, -1, 1, 6, -1 };
		System.out.println(Arrays.toString(subarray_sum(arr, 6)));
	}
}
