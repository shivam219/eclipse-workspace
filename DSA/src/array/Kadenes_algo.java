package array;

public class Kadenes_algo {
	public static void main(String[] args) {
		// kadenes' has develop to algo
		// let's see first

		int[] arr = new int[] { -1, -2, -2, -4, -3, -2 };
		int arr2[] = new int[] { 1, 2, 3, 4, 5, 3, 3, 12, 1, 2, 1 };
		int arr3[] = { 1, 2, 3, 34, 5, 5, 31, 34 };

		int max_sum = 0;
		int cur_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			cur_sum = cur_sum + arr[i];
			if (cur_sum > max_sum) {
				max_sum = cur_sum;
			}
			if (cur_sum < 0) {
				cur_sum = 0;
			}

		}
		System.out.println("Highest value : " + max_sum);

//		int maxEndHere = 0;
//		int maxSoFar = 0;
//		for (int i = 0; i < arr.length; i++) {
//			maxEndHere += arr[i];
//			if (maxEndHere < 0) {
//				maxEndHere = 0;
//			}
//			if (maxSoFar < maxEndHere) {
//				maxSoFar = maxEndHere;
//			}
//		}
//
//		System.out.println("Highest value : " + max_sum);
//		int max = arr[0];
//		int cur = arr[0];
//		for(int i=1;i<arr.length;i++) {
////			1, 2, -2, -4, -3, -2 };
//			max = Math.max(arr[i], max+arr[i]);
//			cur= Math.max(cur, max_sum);
//			
//		}
//		System.out.println("max" + cur);
	}

	public int kandes_negative(int[] arr) {
		int max_sum = arr[0];
		int cur_max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max_sum = Math.max(arr[i], max_sum + arr[i]);
			cur_max = Math.max(cur_max, max_sum);
		}
		return cur_max;
	}
}
