package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum_of_subarray {
	public static void main(String[] args) {
	int arr[] = { 1, 4, -1, 1, 6, -1 };
		sum(arr , 6);
//	String str = String
	}
	public static void sum(int[] arr ,int k) {
		int count = 0; 
		ArrayList<String> al = new ArrayList<String>();
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==k){
				count++;
			}
			int sum = arr[i];
			for(int j = i+1; j<arr.length;j++) {
				sum = sum + arr[j];
				if(arr[j]==0) {
					break;
				}
				if(sum==k) {
					System.out.println("Strat idx : " + i+  " + End " + j+" ");
					count++;
				}
			}
		}
		System.out.println(al);
		System.out.println(count);
	}
}
