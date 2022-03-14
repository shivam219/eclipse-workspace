package array;

import java.util.Arrays;

public class move_negative_elememt_at_first {

	static void rearrange(int arr[], int n) {
		int j = 0, temp;
		for (int i = 0; i < n; i++)
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
	}
	static void rearrange(int arr[]) { int last =0; int temp =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				temp = arr[last];
				arr[last] = arr[i];
				arr[i]=temp;
				last ++;
			}
		}
		Arrays.stream(arr).forEach(e->System.out.println(e));
	}
	public static void main(String args[]) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, -9 };
		int n = arr.length;
		rearrange(arr);
		System.out.println(Arrays.toString(arr));
	}
}
