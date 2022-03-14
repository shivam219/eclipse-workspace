package array;

public class FInd_Sum_all_pair_in_arr {
	// this is repeated element sum
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 2, 1, 4, 3, 2, 3 };
//		int sum = 9, last = 0, total = 0;
//		for (int i = 0; i < arr.length; i++) {
//			total = arr[i] + total;
//			if (sum == total) {
//				System.out.println();
//				for (int j = last; j < i; j++)
//					System.out.print(" " + arr[j]);
//				last = i;
//				total = 0;
//			}
//			if (sum < total) {
//				last = i;
//				total = 0;
//			}
//		}

		getPairsCount(arr, 6);
	}


	public static void getPairsCount(int[] arr, int sum) {

		int count = 0; // Initialize result

		// Consider all possible pairs and check their sums
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] + arr[j]) == sum)
					System.out.println(arr[i] + "  " + arr[j]);
		count++;

		System.out.printf("Count of pairs is %d", count);
	}
}
