package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Union_Intersection {
	public static void main(String[] args) {
		int arr1[] = { 12, 34, 13, 12, 44, 51 };
		int arr2[] = { 12, 30, 23, 34, 44, 52, 85, 45 };
		System.out.println("Intersection : ");
		int[] uni = new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(" " + arr1[i]);
				}
			}
		}
System.out.println();
	ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0 ; i<arr1.length;i++) {
				if(!al.contains(arr1[i])) {
					al.add(arr1[i]);
			}
		}
		for(int i =0 ; i<arr2.length;i++) {
			if(!al.contains(arr2[i])) {
				al.add(arr2[i]);
			}
		}
		System.out.println(al);
//		System.out.println("\nUnion");
		
//		int f = arr1.length;
//		int l = arr2.length;
//		
//		int merge[] = new int[f+l];
//		System.arraycopy(arr1, 0, merge, 0, l);
//		System.arraycopy(arr2, 0, merge, f, l);
//		System.arraycopy(arr2,  0,	 merge, f, l);
//		
//		int[] firstArray = {23,45,12,78,4,90,1};        //source array  
//		int[] secondArray = {77,11,45,88,32,56,3};  //destination array  
//		int fal = firstArray.length;        //determines length of firstArray  
//		int sal = secondArray.length;   //determines length of secondArray  
//		int[] result = new int[fal + sal];  //resultant array of size first array and second array  
//		System.arraycopy(firstArray, 0, result, 0, fal);  
//		System.arraycopy(secondArray, 0, result, fal, sal);  
//		System.out.println(Arrays.toString(result));    //p
	}
}// all show be done by 
//f Java Sets
//set1.addAll(set2); // Union
//set1.retainAll(set2); // Intersection
