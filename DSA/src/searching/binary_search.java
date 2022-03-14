package searching;
public class binary_search {
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
	static int binarySearchWhileAsc(int arr[], int l, int r, int x) {
		while (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				r = mid - 1;
			else
				l = mid + 1;
		}
		return -1;
	}
	static int binarySearchWhileDes(int arr[], int l, int r, int x) {
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] < x)
				r = mid - 1;
			else
				l = mid + 1;
		}
		return -1;
	}
	public static void main(String args[]) {
//		int arr[] = { 10, 15, 25, 30, 35, 40 };
		int arr[] = { 45, 30, 20, 19, 15, 13, 10, 9, 8, 5, 3, 1 };
		int n = arr.length;
		int x = 20;
		int result = binarySearchWhileDes(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}