//Reverse the array
//Find the maximum and minimum element in an array
//Find the "Kth" max and min element of an array 
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
//Move all the negative elements to one side of the array 
//Find the Union and Intersection of the two sorted arrays.
//Write a program to cyclically rotate an array by one. 
//find Largest sum contiguous SubArray [V. IMP]
//Minimise the maximum difference between heights [V.IMP]
//Minimum no. of Jumps to reach end of an array - - i done by  proper but some imporvement needed and indexing also be checked
//find duplicate in an array of N+1 Integers -- what i have writing math logic will no t 
//Merge 2 sorted arrays without using Extra space.
//kadane's algo C [V.V.V.V.V IMP]
//Merge Intervals 
//Next Permutation  -no mood need to see tree and jump here
//Count Inversion - ---------------
//Best time to buy and Sell stock--not - done
//find all pairs on integer array whose sum is equal to given number-- use vis array then check second for if vis[true] continue
//find common elements In 3 sorted arrays
//Rearrange the array in alternating positive and negative items with O(1) extra space
//---not done above one ----
//---today--------------
//Find if there is any subarray with sum equal to 0
//Find factorial of a large number
//find maximum product subarray 
//Find longest coinsecutive subsequence
//Given an array of size n and a number k, find all elements that appear more than " n/k " times.
//Maximum profit by buying and selling a share atmost twice --yes
//Find whether an array is a subset of another array--done
//Find the triplet that sum to a given value --not under stand
//Trapping Rain water problem----------------interesting
//Chocolate Distribution problem-------------interesting
//Smallest Subarray with sum greater than a given value
//Three way partitioning of an array around a given value
//Minimum swaps required bring elements less equal K together
//Minimum no. of operations required to make an array palindrome
//Median of 2 sorted arrays of equal size
//Median of 2 sorted arrays of different size

//return Arrays.stream(arr).forEach(e->System.out.println());
package array;

import java.util.Arrays;
import java.util.Iterator;

public class Reverse_Array {
	
	static int[] reverseArray(int[] arr , int l, int r){
		if(l==r ){
			return arr;
		}
		if(l>r) return arr; 
		else if(l!=r) {
			int temp = arr[r];
			arr[r] = arr[l];
			arr[l] = temp;
			reverseArray(arr, l+1, r-1);
			System.out.println(l + " " + r );
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
							 //0 1 2 3 4
	
		System.out.println(reverseArray(arr, 0, 4));
		
		
		
		
		
		
		
		
		
//		int arr2[] = reverseArray(arr, 0, arr.length-1);
//		for(int i : arr2)
//			System.out.println(i);
//		Arrays.stream(reverseArray(arr, 0, arr.length-1)).forEach(e->System.out.println(e));
//		int mark[] = new int[6];
//		mark[0] = 1;
//		System.out.println(mark);
//		System.out.println(mark.length);
//		-----
//		int arr[] = { 10, 20, 30, 40, 50 };
//		int arr2[] = new int[arr.length];
//		int n = arr.length;
//		for (int i = 0;  i < arr.length && n>0; i++ ,n--) {
//			System.out.print(" " + arr[i] );
//			arr[i] = arr[n];
//		}
//		System.out.println("\nAfter resverse");
//		for(int i :arr)
//		System.out.println(i);
//		reverseArray(arr, 0, n-1);
//		------
//		// reverse array
//		int i = arr.length;
//		while (i-- != 0) {
//			System.out.print(" " + arr[i]);
//		}

	}
}
