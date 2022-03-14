package stack__queue;

import java.util.Arrays;

public class arr {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		int [] arr2 =arr;//refere
		int [] arr3 = arr.clone();// copcy same in new meenory
		change(arr);
		Arrays.stream(arr3).forEach(e->System.out.println(e));
	}
	public static void change(int[] arr) {
		arr[0]=0;
	}
}
