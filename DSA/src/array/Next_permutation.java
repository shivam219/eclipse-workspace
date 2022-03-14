package array;

import java.util.Arrays;
import java.util.Collections;

public class Next_permutation {

	static void nextper(int[] a) {
		int idx = -1;
		int n = a.length;
		for (int i = n - 1; i > 0; i--) {
			if (a[i] > a[i - 1]) {
				idx = i;
				break;
			}

		}
		if (idx == -1) {
			Collections.reverse(Arrays.asList(a));
		} else {
			int pre = idx;// 5     9
			for (int i = idx + 1; i < n; i++) {
				if (a[i] > a[idx - 1] && a[i] <= a[pre]) {
					pre = i;
				}
			}
			int temp = a[idx - 1];
			a[idx - 1] = a[pre];
			a[pre] = temp;
			Collections.reverse(Arrays.asList(a));

		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 5, 8, 4, 7, 6, 5 ,3,1};
		Next_permutation.nextper(arr);
		System.out.println(Arrays.toString(arr));
//		Brute force
//		--time complexity--O(N!)
//		--space complexity-O(N)
//		Single pass approach
//		--time complexity--O(N)
//		--space complexity-O(1)

	}

}
