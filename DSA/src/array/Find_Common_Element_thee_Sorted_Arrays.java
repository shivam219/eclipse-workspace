package array;

public class Find_Common_Element_thee_Sorted_Arrays {

	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 4, 7, 11, 13, 15 };
		int arr2[] = new int[] { 1, 4, 6, 7, 9, 11, 15 };
		int arr3[] = new int[] { 1, 4, 5, 6, 7, 11, 15 };
//		System.out.println("hh");
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				if (arr1[i] == arr2[j]) {
//					for (int k = 0; k < arr3.length; k++) {
//						if (arr1[i] == arr3[k]) {
//							System.out.println("Common value " + arr1[i]);
//						}
//
//					}
//				}
//			}
//		}
//		
		findCommon(arr1, arr2, arr3);
	}	

	static void findCommon(int ar1[], int ar2[], int ar3[]) {
		// Initialize starting indexes for ar1[], ar2[] and ar3[]
		int i = 0, j = 0, k = 0;

		// Iterate through three arrays while all arrays have elements
		while (i < ar1.length && j < ar2.length && k < ar3.length) {
			// If x = y and y = z, print any of them and move ahead
			// in all arrays
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.print(ar1[i] + " ");
				i++;
				j++;
				k++;
			}

			// x < y
			else if (ar1[i] < ar2[j])
				i++;

			// y < z
			else if (ar2[j] < ar3[k])
				j++;

			// We reach here when x > y and z < y, i.e., z is smallest
			else
				k++;
		}
	}
}
