package array;

public class BInary_search {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 6, 8, 10 };
		int key = 4;
		System.out.println(binarySearch(arr, key));

	}

	public static int binarySearch2(int arr[], int key, int low, int high) {

		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == key)
			return mid;
		if (key > arr[mid]) {
			return binarySearch2(arr, key, mid + 1, high);

		}
		return binarySearch2(arr, key, low, mid - 1);

	}

	public static int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2; // 3
			if (arr[mid] == key) {
				return mid;

			} // 2 3
			else if (key > arr[mid]) {
				low = mid + 1;
			} else
				high = mid + 1;

		}
		return -1;
	}
}
