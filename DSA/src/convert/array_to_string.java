package convert;

import java.util.ArrayList;
import java.util.Arrays;

public class array_to_string {

	public static void main(String[] args) {
		int ar[] = {1,2,3};
		String s= Arrays.toString(ar);
		System.out.println(s);
		int arr[] = String.valueOf("").chars().map(c -> c - '0').toArray();
//		-- arrray to arraylist
		int ar1[] = {1,2,3};
//		Integer ar2 [] = Arrays.stream(arr).toArray();
		ArrayList<Integer> al1  = new ArrayList<Integer>();
		al1.addAll(al1);		
	}
}
