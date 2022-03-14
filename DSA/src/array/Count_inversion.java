package array;

public class Count_inversion {
	static int arr[] = new int[] { 1, 9,3,2 };

	static int getInvCount(int n) {
		int inv_count = 0;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] > arr[j])
					inv_count++;

		return inv_count;
	}
	public static void main(String[] args) {
		System.out.println("Number of inversions are " + getInvCount(arr.length));
	}
}
