package string;

import java.util.ArrayList;

public class Permutation_next {

	static int count = 0;
	int k = 3;

	private void permute(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);

		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String str = "abc";
		int n = str.length();
		Permutation_next ob = new Permutation_next();
		ob.permute(str, 0, n - 1);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ob.per2(a, 0, 2);
		System.out.println(Permutation_next.a);

	}

	static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
	public  void  per2(ArrayList<Integer> arr , int l, int r) {
			if(l==r) {a.add(arr);}
			else {
				for(int i = l ; i<=r ; i++) {
					swap(arr, l , i);
					per2(arr, l+1, r);
					swap(arr, l, i);
				}
			}
	}
	public void swap(ArrayList<Integer> arr  , int i ,int j) {
			int temp = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
	}
}
