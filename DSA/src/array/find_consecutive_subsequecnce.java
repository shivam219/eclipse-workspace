package array;

import java.util.HashSet;
import java.util.Set;

public class find_consecutive_subsequecnce {
	static int findLongestCon(int arr[] , int n) {
		Set<Integer> set = new HashSet<>();
		for(int i :arr)
			set.add(i);
		int ans =0;
		for(int i =0;i<n;i++) 
			if(!set.contains(arr[i] -1)) {
				System.out.println("" + arr[i]+ " " + 1 + " " + arr[i]+1 );
				int j = arr[i]+1;
				while(set.contains(j))
				j++;
				ans  = Math.max(ans, j-arr[i]);
				
			}
		return ans;
	
	}	
	
	public static void main(String[] args) {
		  System.out.println( findLongestCon(new int[] {1,2,3,4,7,8},6));

	}
}
