package searching;

import java.util.ArrayList;

public class SearchMidian_in_matitr {
	public int findMedian(ArrayList<ArrayList<Integer>> A) {
		int low = 0;
		int high = 0;
		int row = A.size();
		int col = (A.get(0).size()) - 1;
		for (int i = 0; i < A.size(); i++) {
			low = Math.min(low, A.get(i).get(0));
			high = Math.min(high, A.get(i).get(col));
		}
		int mid = 0;
		return 0;
	}

	public static int squareRoot(int A) {
		if (A == 0 || A == 1)
			return A;
		double temp;
		double mid = A / 2;
		do {
			temp = mid;
			mid = (temp + (A / temp)) / 2;
		} while ((temp - mid) != 0);
		return (int) mid;
	}

	public static void main(String[] args) {
		System.out.println(squareRoot(11));
	}
}
