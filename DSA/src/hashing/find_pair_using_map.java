package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class find_pair_using_map {

	public static boolean findPair(ArrayList<Integer> a, int l, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean flag= false;
		for (int i = l; i < a.size(); i++) {
			if(map.containsKey(sum-a.get(i))) {
				System.out.println(map.get(sum-a.get(i))  + " " +i);
				flag= true;
				break;
			}
			else {map.put(a.get(i), i);}
		}
		return flag;
	}
	public static void solve(ArrayList<Integer> al, int b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int cur : al) {
			if(set.contains(b-cur)) {
				System.out.println(b-cur + " " + cur);
			}
			set.add(cur);
		}
	}
	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 1, 2, 9, 8 };
		ArrayList<Integer> al  = new ArrayList<Integer>();
		for (int n : arr) {
			al.add(n);
		}
	findPair(al,0, 7);
	solve(al, 7);
	
	}
}