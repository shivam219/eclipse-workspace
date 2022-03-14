package Fuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list_To_arraylist {

	public static void main(String[] args) {
//		Integer[] arr1 = new Integer[] { 1, 2, 34, 3 };
//		int[] arr2 = new int[] { 1, 2, 34, 3 };
//		String str[] = {};
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		Collections.addAll(a, arr1);
//		String strArray[] = { "Java", "C++", "C", "Perl", "Python" };
//		System.out.println("Array: " + Arrays.toString(strArray));
//		List<String> myList = new ArrayList<>();
//		// Add array to list using Collections addAll method
//		Collections.addAll(myList, strArray);
		
		Integer x1[] = { -50, -41, -40, -19, 5, 21, 28 };
		Integer x2[] =  { -50, -21, -10 };
		List<Integer> xx1= new ArrayList<>();
		Collections.addAll(xx1, x1);	
		List<Integer> xx2= new ArrayList<>();
		Collections.addAll(xx2, x2);	
		System.out.println(findMedianSortedArrays(xx1,xx2));

	}

	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		ArrayList<Integer> ab = new ArrayList<Integer>();
		ab.addAll(a);
		ab.addAll(b);
		ab.stream().sorted((e1, e2) -> e1.compareTo(e2));
		int f = ab.get(0); int l = ab.get(ab.size()-1);
		int n = ab.size();
		if(n%2==0) {n=n-1;}
		return (ab.get(n/2));
	}
}
