package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Bubble_short_Array {
	public static void main(String[] args) {
		Integer a[] = { 4, 2, 1, 5, 6, 7 };
//		System.out.println("Array before sorting :" +a);// a print address of memory
//		System.out.println("Array before sorting" + Arrays.toString(a));
//		for (int i = 0; i < a.length-1; i++) {
//			for (int j = 0; i <a.length-1; j++) {
//				if (a[j] > a[j + 1]) {
//					int tem = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = tem;
//				}
//			}
//		}
		
		//approach 2 build-in methods
		System.out.println("Array before sorting :"+Arrays.toString(a));
//		 IntStream b=Arrays.stream(a).filter(e -> e % 2 == 0);
		Arrays.parallelSort(a);
		//approach 3 
		Arrays.sort(a);
		System.out.println("Array after sorting"+ Arrays.toString(a));
	
		// reverse
		System.out.println("Array before sorting :"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder()); // not for primitives
		System.out.println(Arrays.toString(a));
	}
}
