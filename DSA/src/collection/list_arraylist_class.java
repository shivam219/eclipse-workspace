package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class list_arraylist_class {
	static int i =0;
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		System.out.println(arr);
		int ar[] = new int[arr.size()];
//		int i = 0;
		arr.stream().forEach(e->{ar[i]= e ; i++; });
		Arrays.stream(ar).forEach(e->System.out.println(e));
	}
}
