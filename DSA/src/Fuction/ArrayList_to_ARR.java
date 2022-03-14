package Fuction;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_to_ARR {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(15);
		a.add(10);
		a.add(12);
		a.add(14);
		a.add(13);
//		Integer[] objects = (Integer[]) a.toArray();
		Integer[] arr = new Integer[a.size()];
		a.toArray(arr);
		Arrays.stream(arr).toString();
//        int[] arr = al.stream().mapToInt(i -> i).toArray();
		a.add(1, 20);
		a.sort((e1, e2) -> e1.compareTo(e2));
		System.out.println(a);
		System.out.println(0 >= 0);
		Integer ar[] = new Integer[a.size()];
//		Arrays.stream(a.toArray(arr)).forEach(e -> System.out.print(e + "  "));
		Arrays.stream(ar).mapToInt(e -> e +10);
		System.out.println(Arrays.toString(ar));
	}
}