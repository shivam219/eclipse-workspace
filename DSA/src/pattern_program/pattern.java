package pattern_program;

import java.util.Arrays;

public class pattern {
	public static void main(String[] args) {
		/*
		 *  1
		 *  2 3 
		 *  4 5 6 
		 *  7 8 9 10
		 */
//		patternPrint(10);
//		public static void patternPrint(int n) {
		int count = 0;
		for (int i = 1; i <= 10; ) {
			for (int j = 0; j < count; j++) {
				System.out.print(i + "  ");
				i++;
			}
			System.out.println();
			count++;

		}
//		bubble sort
		int arr[] = {10,2,7,6,3};
		System.out.println(Arrays.toString(arr));
	 
	    for(int i=0; i < arr.length-1; i++){  
	    	for(int j=i+1; j <arr.length; j++){  
	             if(arr[i] > arr[j]){  
	             int temp = arr[j];  
	             arr[j] = arr[i];  
	             arr[i] = temp;  
	             }  
	    	} 
	    }
	    System.out.println(Arrays.toString(arr));
	                          
}}
