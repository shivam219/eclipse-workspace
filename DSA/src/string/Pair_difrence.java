package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pair_difrence {
	private void coner() {
		 String[] array = {"a", "b", "c", "d", "e"};

	      //Method 1
	      List<String> list = Arrays.asList(array);          
	      System.out.println(list);

	      //Method 2
	      List<String> list1 = new ArrayList<String>();
	      Collections.addAll(list1, array);
	      System.out.println(list1);

	      //Method 3
	      List<String> list2 = new ArrayList<String>();
	      for(String text:array) {
	         list2.add(text);
	      }
	      System.out.println(list2);
	}
	public static void main(String[] args) {
		int in[]  = {10,10};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10); arr.add(20);
		System.out.println(solve(arr,20));
	}
	public static int solve(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		int l = 0, r = A.size();

		
		
		return  0;
	}
}
