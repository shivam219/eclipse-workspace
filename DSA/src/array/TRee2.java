package array;

public class TRee2 {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 55, 4, 23, 4, 23, 4 };
		partition(arr, 5, 10);

	}

	private static void partition(int[] arr, int a, int b) {
		int left = 0, right = arr.length - 1;
		for (int i = 0; i < right;) {
			if (arr[i] < a) {
				int temp = arr[left]; // 0 = 1 temp = 1
				arr[left] = arr[i]; // 1 
				arr[i] = temp; // 1
				left++;
				i++;
			}
			else if(arr[i]>b) {
				
			}
		}
	}
}
