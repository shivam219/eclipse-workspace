package array;

public class Move_all_value_one_side {
	public static void main(String[] args) {
		int arr[] = { 10, 30, 45, 6, -2, -3, -6, -9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr)
			System.out.print(" " + i);
	}
}
