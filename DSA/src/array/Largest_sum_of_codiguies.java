package array;

import java.util.Arrays;

public class Largest_sum_of_codiguies {
	public static void main(String[] args) {
//		int arr[] = { -10, -8, -3, -7, -2, -7, -3, -9 };	
//		int max = 0; int l =0; int f =0;
//		int cur = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			cur = cur + arr[i];
//			if (cur > max) l = i;
//				max = cur;
//			if (0>cur) {
//				cur = 0;  }
//		}this code is not work for all 
//		System.out.println(Arrays.toString(arr)  + "\nfirst :  " + f  +" last  " + l +"\n max : "+max);
//
//		System.out.println(max);
		// kadane's algo
		// above code not work well when all values are in minus
		System.out.println("working with kadane's algo");
		int arr[] = { -10, -8, -3, -7, -2,10, -7, 50,-3, -9 };
		int max = arr[0];
		int cur = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i], max + arr[i]);
			cur = Math.max(cur, max);
		} 
		System.out.println(cur);
		
		
		
//		public int kandaneForMaxSubArray(int[] arr) {
//			  int maxEndHere = 0;
//			  int maxSoFar = 0;
//			  for (int i = 0; i < arr.length; i++) {
//			   maxEndHere += arr[i];
//			   if (maxEndHere < 0) {
//			    maxEndHere = 0;
//			   }
//			   if (maxSoFar < maxEndHere) {
//			    maxSoFar = maxEndHere;
//			   }
//			  }
//			  return maxSoFar;
//			 }
//			 
	}
}
