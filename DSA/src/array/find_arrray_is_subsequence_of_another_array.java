package array;

public class find_arrray_is_subsequence_of_another_array {
	public static void main(String[] args) {
		int arr2[] = new int[] { 2, 1 }; // array
		int arr1[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 9 };// main
		int inc = 0;
		boolean b = false;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[inc]) {
				inc++;
				if (inc == arr2.length - 1) {
					b = true;
					break;
				}

			}
		}
		if (b)
			System.out.println(b ? "Yes" : "No");
		if (inc > 0) {
			for (int i = 0; i <= inc; i++)
				System.out.print(arr2[i]+"  " );
		}
		System.out.println();
	}
}
