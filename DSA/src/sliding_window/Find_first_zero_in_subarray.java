package sliding_window;

import java.util.ArrayList;
import java.util.List;

public class Find_first_zero_in_subarray {
	public static void main(String[] args) {
		int arr[] = { -4, 2, 3, 2, -1, -1, 3 };
		int i = 0, j = 0, sum = 0, max = 0, k = 3;
		List<Integer> list = new ArrayList<>();
		while (j < arr.length) {
			if (arr[j] < 0)
				list.add(arr[j]);
			if (j - i + 1 < k)
				j++;
			else if (j - i + 1 == k) {
				if (list.size() == 0)
					System.out.println("0");
				else {
					System.out.println(list.remove(0));
				}
				i++;
				j++;
			}
		}
//		List<Integer> list1 = new Arraylist<>();
//		list1.add(10);
//		list1.add(120);
//		list1.add(13);
//		list1.add(1);
//		System.out.println(list1.remove(0));
//		System.out.println(list1.remove(0));
//		System.out.println(list1.remove(0));
//		System.out.println(list1.remove(0));
////		System.out.println();

	}
}
