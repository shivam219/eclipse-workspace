package array;

public class Binary_sort_unsort {
	static int binary_unsort(int arr[], int key) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[low] < arr[mid]) {
				if (key >= arr[low] && key < arr[mid])
					high = mid;
				else
					low = mid + 1;

			} else {
				if (key > arr[mid] && key <= arr[high])
					low = mid + 1;

				else
					high = mid - 1;

			}

		}
		return high;

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 120, 130, 40, 50, 90, 100, 110 };
	}

}
