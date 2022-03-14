package sliding_window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class fing_max_element_in_subaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, -3, 2, 5, -2, 1, 2, -1 };
//		List<Integer> list = Arrays.asList(20, 10, 100, 140, 250);
		List<Integer> list = new ArrayList<>();

		Integer max = 0;
		int i = 0, j = 0, k = 3;
		while (j < arr.length) {
			list.add(arr[j]);
			if (j - i + 1 < k)
				j++;
			else if (j - i + 1 == k) {
				max = Collections.max(list);
				System.out.println(max);
				list.remove(0);
				i++;
				j++;
			}

		}

		// reverse order
//		Queue<Integer> que1 = new PriorityQueue<>(Comparator.reverseOrder());
//		que1.add(15);
//		que1.add(12);
//		que1.add(13);
//		que1.add(14);
//		System.out.println(que1.remove());
//	
//		que1.clear();

	}

}
