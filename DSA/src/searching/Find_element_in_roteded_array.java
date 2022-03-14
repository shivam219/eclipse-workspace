package searching;

public class Find_element_in_roteded_array {
	public static int BinarySearch(int arr[], int key) {
//		100 , 120 , 40 , 50 ,60 , 5 , 10
		int low = 0, high = arr.length;
		while (low <= high) {
			int mid = (low + high) / 2;// 5
			if (arr[mid] == key)
				return mid;
			if (arr[0] < arr[mid]) {
				if (key >= arr[low] && key < arr[mid]) {
					high = mid - 1; // mean is left side
				} else
					low = mid + 1;
			} else {
				if (key > arr[mid] && key < arr[high]) {
					low = mid + 1;// right side
				} else {
					high = mid - 1;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		/*
		 * we have see first mid and then check mid with first index and last index to
		 * find which is sorted like 100 , 120 , 40 , 50 ,60 , 5 , 10 mid --- Ascending
		 */
		System.out.println(BinarySearch(new int[] {1,2,5,6,4,3,0},0));

	}

}
