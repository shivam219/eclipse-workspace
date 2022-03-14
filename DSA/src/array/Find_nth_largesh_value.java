package array;

import java.util.Scanner;

public class Find_nth_largesh_value {

	public static void main(String[] args) {

		int arr[] = { 12, 45, 31, 4, 51, 34, 14, 12 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int a : arr) {
			System.out.print("  " + a);
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value");
		int n = sc.nextInt();
		if ((arr.length - 1) >= n &&  n>0) {
			System.out.println(arr[n - 1]);
		}

	}

}
