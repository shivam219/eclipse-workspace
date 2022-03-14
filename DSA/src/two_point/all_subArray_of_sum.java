package two_point;

import java.util.ArrayList;

public class all_subArray_of_sum {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int arr1[] = {  5, 5 ,3 ,5 ,1, 3 };
		for (int n : arr1) {
			arr.add(n);
		}
		System.out.println(solve(arr, 3));
	}

	public static int solve(ArrayList<Integer> A, int B) {
		int sum = 0, count = 0; 
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i)<= B) {
				count++;
				sum = A.get(i);
			}
			if (A.get(i) >= B) {
				continue;
			}
			for (int j = i + 1; j < A.size(); j++) {
				sum = sum + A.get(j);
				if (B >= sum) {
					count++;
				}
				if (B < sum) {
					sum = 0;
					break;
				}
			}
		}
		return count;
	}
}
