package array;

import java.util.Arrays;

public class Next_permutation_2 {
	public static void main(String[] args) {
		int arr[] = new int[] {3,2,1};
		System.out.println(Arrays.toString(arr));
		int arr2[] =nextPermutation(arr,arr.length);
		System.out.println(Arrays.toString(arr2));
	}
	 static int[] nextPermutation(int[] arr, int length) {
		 int i = 0; int n =length ;int j =n-1;int temp; boolean flag = false;
		 while(i<n) {
		 if(arr[i]<arr[i+1]){ // Descending order check last value
			 while(i<j) {
				 if(arr[i]<arr[j]) { 
					 temp = arr[i];
					 arr[i]= arr[j];
					 arr[j] = temp; flag = true; break;
				 }
				 j--;
			 }
		 }
		 else if(arr[i+1]== arr[j]) {
			 System.out.println("No it is last greates permutation");
			 Arrays.sort(arr); flag = true;
		 }
		 if (flag)break;
		 i++;
		 }
		Arrays.sort(arr,i+1,arr.length);
		return arr;
		
		 
		 
	}
}
