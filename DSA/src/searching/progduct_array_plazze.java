package searching;

import java.util.Arrays;

public class progduct_array_plazze {
	static int[] solve(int arr[]) {
		int cross =1;
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			cross *= arr[i];
		for (int i = 0; i < arr.length; i++) {

			arr2[i] = cross / arr[i];
		}
return arr2;
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] { 3, 2, 4, 5, 2 };
		Arrays.stream(solve(arr)).forEach(e->System.out.println(e));;
	}
}
