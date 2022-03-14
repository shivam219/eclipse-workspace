package searching;

public class Find_repeating_and_missing {
	static void printTwoElements(int arr[], int size) {
		int i;
		System.out.print("The repeating element is ");
		for (i = 0; i < size; i++) {
			int abs = Math.abs(arr[i]);
			if (arr[abs - 1] > 0)
				arr[abs - 1] = -arr[abs - 1];
			else
				System.out.println(abs);
		}
		System.out.print("And the missing element is ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0)
				System.out.println(i + 1);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
		int n = arr.length;
		printTwoElements(arr, n);
	}
}
