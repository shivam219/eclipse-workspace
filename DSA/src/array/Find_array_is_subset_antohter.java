package array;

import java.util.Arrays;

public class Find_array_is_subset_antohter {
	static boolean subset(int arr1[], int arr2[],int n, int m) {
		if(n> m)return false;
		Arrays.sort(arr1);// 1,4 , 5
		Arrays.sort(arr2); // 2,3,4,,6,
		for(int i =  0; i<n; i++)
			for(int j = 0; j<m ; j++) {
				if(arr1[i]== arr2[j])  break;
				if( arr1[i] <arr2[j]) return false;
			}
		
		
	return true;
	}
	public static void main(String[] args) {
		int arr1[] =  new int[] {1,4,5};
		int arr2[] =  new int[] {1,3,6,4};
		int n = arr1.length;
		int m = arr2.length;
		System.out.println(subset(arr1, arr2, n,m));;
	}
}
