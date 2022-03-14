package searching;

import java.util.Arrays;
import java.util.HashMap;

public class insertion_sort {
	// pair concept in java use for returning two argumaent
//	public static Pair<Integer, Integer[]> sort(){}

	static int[] insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {5,3,2,1};
		Arrays.stream(insertionSort(arr)).forEach(e -> System.out.print(e + "->"));

		System.out.println(minSwaps(arr));
	}

	public static int minSwaps(int[] nums)
	{
		int len = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<len;i++)
			map.put(nums[i], i);
			char[] s = "shivam".toCharArray(); 
		Arrays.sort(nums);
		
		// To keep track of visited elements. Initialize
		// all elements as not visited or false.
		boolean[] visited = new boolean[len];
		Arrays.fill(visited, false);
		
		// Initialize result
		int ans = 0;
		for(int i=0;i<len;i++) {
		
			// already swapped and corrected or
			// already present at correct pos
			if(visited[i] || map.get(nums[i]) == i)
				continue;
				
			int j = i, cycle_size = 0;
			while(!visited[j]) {
				visited[j] = true;
				
				// move to next node
				j = map.get(nums[j]);
				cycle_size++;
			}
			
			// Update answer by adding current cycle.
			if(cycle_size > 0) {
				ans += (cycle_size - 1);
			}
		}
		return ans;
	}
}
