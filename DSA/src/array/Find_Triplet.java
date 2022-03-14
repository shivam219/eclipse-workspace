package array;

public class Find_Triplet {
	public static void main(String[] args) {
		int arr[] = new int[] { 12, 3, 4, 5, 2, 1, 5 };
		int sum = 10;
		System.out.println(triplet(arr, arr.length, 10));
		System.out.println(triplet(arr, arr.length, 10) ? "True" : "False");
	}

	static boolean triplet(int arr[], int n, int sum) {
		int l, r;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						System.out.println("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
						return true;
					}
				}
			}
		}

		return false;
	}
}
