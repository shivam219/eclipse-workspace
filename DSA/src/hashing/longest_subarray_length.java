package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longest_subarray_length {
	public static int solve(ArrayList<Integer> A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] a = new int[A.size()];
		for (int i = 0; i <= A.size() - 1; i++) {
			if (A.get(i) == 1)
				a[i] = 1;
			else
				a[i] = -1;
		}
		int sum = 0;
		int max = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum += a[i];
			if (!map.containsKey(sum))
				map.put(sum, i);
			if (sum == 1) {
				max = i + 1;
			}
			if (map.containsKey(sum - 1)) {
				max = Math.max(max, i - map.get(sum - 1));
			}
		}
		return max;
	}
	public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){return 0;}
        int i = 0; int j = 0; int max=  0;
        Set<Character> set = new HashSet<Character>();
        while(i<s.length()){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(j));
                ++j;
            }
            set.add(c);
            max= Math.max(max, i - j +1);
            ++i;
        }
        return max;
    }
	public static void main(String[] args) {
		int arr[] = {0,1,1,0,1};
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for(int n : arr){ al.add(n); }
		System.out.println(solve(al));
	}
}
