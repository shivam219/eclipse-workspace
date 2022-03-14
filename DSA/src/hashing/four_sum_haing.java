package hashing;

import java.util.ArrayList;
import java.util.HashMap;

// a +b == c +b;
public class four_sum_haing {
	public static void main(String[] args) {
		int arr[] = {1, 3, 3, 3, 3, 2, 2};
		ArrayList<Integer> al  = new ArrayList<Integer>();
		for (int n : arr) {
			al.add(n);
		}
		 al  = solve(al);
		 System.out.println(al);
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> al = new ArrayList<Integer>(); boolean flag = false;
		for (int i = 0; i < A.size() - 3; i++) {
			for (int j = i+1; j < A.size() - 2; j++) {
				int sum = A.get(i) + A.get(j);
				if (findPair(A, j + 1, sum)) {
					al.add(i);
					al.add(j);
					al.add(has.get(0));
					al.add(has.get(1));flag = true; break;
				}
			}
			if(flag) {break;}
		}
		return al;
	}
	static ArrayList<Integer> has = new ArrayList<Integer>();
	public static boolean findPair(ArrayList<Integer> a, int l, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean flag= false;
		for (int i = l; i < a.size(); i++) {
			if(map.containsKey(sum-a.get(i))) {
				has.add(map.get(sum-a.get(i))); has.add(i);
				flag= true;
				break;
			}
			else {map.put(a.get(i), i);}
		}
		return flag;
	}

	}


