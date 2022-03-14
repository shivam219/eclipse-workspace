package hashing;

import java.util.ArrayList;
import java.util.Collections;

public class Four_sum {
	public static void main(String[] args) {

	}

	public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		Collections.sort(A);
		for (int i = 0; i < A.size() - 1; i++) {
			for (int j = i + 1; j < A.size() - 1; j++) {
				int l = j + 1;
				int r = A.size() - 1;
				while (l < r) {
					int sum = A.get(i) + A.get(j) + A.get(l) + A.get(r);
					ArrayList<Integer> te = new ArrayList<Integer>();
					if (sum == B) {
						te.add(A.get(i));
						te.add(A.get(j));
						te.add(A.get(l));
						te.add(A.get(r));
						al.add(te);
						while (l < r && te.get(2).equals(A.get(l)))
							l++;
						while (l < r && te.get(3).equals(A.get(r)))
							r--;
					} else if (sum < B) {
						l++;

					} else {
						r--;
					}
				}
				while (j < A.size() - 1 && A.get(j).equals(A.get(j + 1)))
					j++;
			}
			while (i < A.size() - 1 && A.get(i).equals(A.get(i + 1)))
				i++;
		}
		return al;
	}
}
