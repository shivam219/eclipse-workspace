package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InterviewBIt {

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> AA = new ArrayList<Integer>();
		ArrayList<Integer> AB = new ArrayList<Integer>();

		for (int i = 0; i < A.size(); i++) {
			AA.add(Math.abs(A.get(i)));
		}
		AA.stream().sorted();/* not work */
		AA.sort((e1, e2) -> e1.compareTo(e2));
		// Collections.sort(AA);
//		AA.stream().mapToInt(e->e*e);
		for (int i = 0; i < AA.size(); i++) {
			AB.add((AA.get(i) * AA.get(i)));
		}
		return AB;

	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(17);
		a.add(17);
		a.add(15);
		a.add(12);
		System.out.println(solve(a));

	}

//[3, 30, 34, 5, 9], the largest formed number is 9534330.
	public String largestNumber(final List<Integer> AA) {
		int A[] = new int[AA.size()];
		for (int i = 0; i < AA.size(); i++) {
			A[i] = AA.get(i);
		}
		String[] arr = new String[A.length];
		for (int i = 0; i < A.length; i++) {
			arr[i] = String.valueOf(A[i]);
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}
		while (sb.charAt(0) == '0' && sb.length() > 1)
			sb.deleteCharAt(0);

		return sb.toString();
	}

	public int[] plusOne(int[] A) {
		int carry = 1, p = 0;
		for (int i = A.length - 1; i >= p; i--) {
			int sum = A[i] + carry;
			A[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry > 0) {
			int b[] = new int[A.length + 1];
			b[0] = carry;
			for (int i = 1; i < A.length + 1; i++)
				b[i] = A[i - 1];
			return b;
		} else {
			int pp = 0;
			while (A[pp] == 0)
				pp++;
			int b[] = new int[A.length - pp];
			for (int i = pp; i < A.length; i++)
				b[i - pp] = A[i];
			return b;
		}
	}

	public void rotate(ArrayList<ArrayList<Integer>> a) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int l = 0, r = a.size();
		boolean flag = true;
		while (flag) {
			if(l==r) {flag= true; return ;}
			else if (l>r) {flag= true; return ;}
			else {
				temp = a.get(l);
				a.get(l).add(r);
				a.remove(l+1);
				a.get(l).addAll(temp);
				
			}
		}
	}
}