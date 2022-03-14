package pattern_program;

import searching.binary_search;

public class star {
	public static void main(String[] args) {
		System.out.println("Start print programm");
//		for (int i = 0 , j = 0; i < 10 || i > 10; i++,j++) {}
//		for (int i = 1; i <= 5; i++) {
//			for (int k = 5 - i; k >= 1; k--) {
//				System.out.print("  ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		pattern2();
//		binarySearch();
	}
	public static void pattern2() {
		int n =5;
		for(int i = 5; i>=1;i--) {
			for(int k = 5-i; k>=1;k--) {
				System.out.print("  ");
			}
			for(int j = i; j>=1;j-- ) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	// binary searching
	public static void binarySearch() {
		int arr[] = {1,2,3,4,5,6};
		int  l =0 , r = arr.length;
		int x = 3;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(arr[mid]==x) {
				System.out.println("index is "+ mid);
				return ;
			}
			if(arr[mid]>x) {
				r = mid -1;
			}
			else {l=mid+1;}
		}

	}

}
