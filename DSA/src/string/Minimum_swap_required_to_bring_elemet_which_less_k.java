package string;

import java.util.Arrays;

public class Minimum_swap_required_to_bring_elemet_which_less_k {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 3, 5, 1, 4, 6, 7 };
		System.out.println(Arrays.toString(arr));
		int p = minSwap(arr, 7, 5);
		System.out.println(p);
	}

	public static int minSwap(int[] arr, int n, int k) {
		int count = 0, bad = 0, ans = 0;
		for (int i = 0; i < n; i++) {/// less element k
			if (arr[i] <= k) {
				count++;
				System.out.print(" " + 1 + ",");
			} else
				System.out.print(" " + 0 + ",");

		}
		System.out.println();
		for (int i = 0; i < count; i++) {
			if (arr[i] > k) { /// element greater then 		
				bad++;
		System.out.print(" " + 1 + ",");
	} else
		System.out.print(" " + 0 + ",");}

		ans = bad;
		for (int i = 0, j = count; j < n; j++, i++) {
			if (arr[i] > k)
				bad--;
			if (arr[j] > k)
				bad++;
			ans = Math.min(ans, bad);
		}
		System.out.println();
		return ans;
	}

}
