package array;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int arr[] = {8,1,2,10,4,5,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp  = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
	System.out.println(	Arrays.toString(arr));
	}
}
