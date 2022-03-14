package string;

import java.util.Arrays;

public class Minimam_swap_requried_to_bring_k_less {
	// required to club all elements less than
	// or equals to k together
	static int minSwap(int arr[], int n, int k) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= k) {
				count++;
				System.out.print(" " + 1 + ",");
			} else
				System.out.print(" " + 0 + ",");
		}
		System.out.println();
		int bad = 0;
		for (int i = 0; i < count; i++) {
			if (arr[i] > k) {
				bad++;
				System.out.print(" " + 1 + ",");
			} else
				System.out.print(" " + 0 + ",");
		}
		int ans = bad;
		for (int i = 0, j = count; j < n; i++, j++) {

			// Decrement count of previous window
			if (arr[i] > k)
				--bad;
			// Increment count of current window
			if (arr[j] > k)
				++bad;

			// Update ans if count of 'bad'
			// is less in current window
			ans = Math.min(ans, bad);
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr1[] = {  2, 3, 5, 1, 6, 4,  7 };
		System.out.println(Arrays.toString(arr1));
		int n = arr1.length;
		int k = 6;
		System.out.print(minSwap(arr1, n, k));
	}
}
