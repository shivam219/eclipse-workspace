package searching;

import java.util.ArrayList;

public class Searching_Element_in_sort_matrix {
	public static  int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
		for(int i = 0; i<A.size();i++) {
			Integer[] arr = new Integer[A.get(i).size()];
			arr=A.get(i).toArray(arr);
			if(binarySearch(arr, 0, arr.length-1, B)!=-1){return 1;}
		}		
		return 0;
	}
	
	static int binarySearch(Integer[] arr, int l, int r, int x) {
		if(arr.length==1){if(arr[0]==x) {return 1;}else{return -1;}}
		while (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x) 
				r = mid-1;
			else
			l = mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
//		a1.add(1);a1.add(3);a1.add(5);a1.add(8);a1.add(11);
//		ArrayList<Integer> a2 = new ArrayList<Integer>();
//		a2.add(15);a1.add(17);a1.add(20);a1.add(22);a1.add(25);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(3);
		A.add(a3);
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(29);
		A.add(a4);
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.add(26);
		A.add(a5);
		ArrayList<Integer> a6 = new ArrayList<Integer>();
		a6.add(63);
		A.add(a6);
		ArrayList<Integer> a7 = new ArrayList<Integer>();
		a7.add(67);
		A.add(a7);

//		[3] [29] [36] [63] [67] [72] [74] [78] [85]
		System.out.println(searchMatrix(A, 43));
	}

}
