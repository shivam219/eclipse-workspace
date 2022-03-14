package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_unio_and_intersecciton {
	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[] { 5, 2, 3, 8, 6 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		// Intersection 
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					al.add(arr2[j]);
					break;
				}
			}
		}
		System.out.println(al);
		// both line print union
		Arrays.stream(arr1).filter(e->  !al.contains(e)).forEach(e->System.out.print(e+" "));
		Arrays.stream(arr2).forEach(e->System.out.print(e+" "));
	}
}
