package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_two_sorted_array {
//	public static void main(String[] args) {
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		arr1.add(1);
//		arr1.add(3);
//		arr1.add(5);
//		arr1.add(7);
//		arr1.add(10);
//		arr1.add(11);
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		arr2.add(4);
//		arr2.add(6);
//		arr2.add(8);
//		mergeTwoSortedArray(arr2, arr1);
//	}

	public static void mergeTwoSortedArray(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> all = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int tempLen = 0;
		int i = 0, j = 0, k = 0;
		int n = a.size();
		int m = b.size();
		int al[] = new int[n + m];
		if (m > n) {
			temp = a;
			tempLen = n;
			a = b;
			n = m;
			b = temp;
			m = tempLen;
		}
		while (i < n) {
			if (j >= m) {
				al[k] = a.get(i);
				i++;
				k++;
			} else if (a.get(i) <= b.get(j)) {
				al[k] = a.get(i);
				i++;
				k++;
			} else {
				al[k] = b.get(j);
				j++;
				k++;
			}
		}
		if (j < m) {
			al[k] = b.get(j);
			j++;
			k++;
		} else if (i < n) {
			al[k] = a.get(i);
			i++;
			k++;
		}
		for (int l : al) {
			all.add(l);
		}
//		return all;
	}

	public static void main(String[] args) {
	System.out.println(intersect(Arrays.asList( 12, 30, 41, 51, 56, 58, 63, 67, 82, 90, 93),Arrays.asList( 7, 9, 17, 17, 19, 21, 26, 34, 65, 65, 67, 68, 71, 75, 92)));
	}
	public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 0, j = 0;
		int n = A.size(); int val1 = 0; int val2;
		int m = B.size();
		if (m > n) {
			while (j < m) {
				if (i >= n) {
					return al;
				}
				val1 = A.get(i); val2= B.get(j);
				if (val1==val2) {
					al.add(A.get(i));
					i++;
					j++;
				} else if (val1>val2) {
					j++;
				} else {
					i++;
				}
			}
		}
		else {
			while (i < n) {
				if (j >= m) {
					return al;
				}	
				val1 = A.get(i); val2= B.get(j);
				if (val1==val2) {
					al.add(A.get(i));
					i++;
					j++;
				}  else if (val1>val2) {
					j++;
				}else {
					i++;
				}
			}
		}
		return al;
	}
}
