package array;

import java.util.Arrays;
import java.util.Scanner;

public class Cyclically_while_n_minus {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("g");
//		int n = sc.nextInt();
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		whhile (n-- != 0) 
//		int n = arr.length;
//		while (n-- > 0) {
//			System.out.println("n" + " :" + n + " " + arr[n]);
//		}

		Scanner sc = new Scanner(System.in);

//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int arr[] = { 130, 4, 46, 235, 6 };
		int n = arr.length;// 5 --value 6
		int temp = arr[n - 1]; // 4
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		System.out.println("Contents of the cycled array: " + Arrays.toString(arr));
		
		System.out.println(arr[n-1]);
		System.out.println(arr[0]);

	}

}
