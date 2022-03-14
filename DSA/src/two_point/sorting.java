package two_point;

import java.util.ArrayList;

public class sorting {

//	Bubble sort
	public static void BubbleSort(ArrayList<Integer> A) {
		for (int i = 0; i < A.size() - 1; i++) {
			for (int j = i + 1; j < A.size(); j++) {
				if (A.get(i) > A.get(j)) {
					int temp = A.get(i);
					A.set(i, A.get(j));
					A.set(j, temp);
				}
			}
		}
	}

//	selection sort 
	public static void SelectionSort(ArrayList<Integer> A) {
		int idx = 0; int val = Integer.MAX_VALUE;
		for(int i =0; i<A.size()-1; i++) {
			for(int j = i; j<A.size(); j++) {
				if(A.get(j)<val) {
					val = A.get(j);
					idx = j;
				}
			}
			int temp = A.get(i);
			A.set(i, A.get(idx));
			A.set(idx, temp);
		}
		System.out.println(A.toString());
	}
//	insertion sort
	public static void InsertionSort(ArrayList<Integer> A) {
		for(int i =1; i<A.size();i++) {
			int temp = A.get(i); 
			int j =  i - 1;
			while(j>=0 && A.get(j)>temp) {
				A.set(j+1, A.get(j));
				j--;
			}
			A.set(j+1, temp);
		}
		System.out.println(A.toString());
	}

	
//	QuickSort 
	public static void QuickSort(ArrayList<Integer> A , int l , int r) {
		int pi = Partition(A, l, r); 
		if(l<pi-1) {
			QuickSort(A,l,pi-1);
		}
		if(r>pi) {
			QuickSort(A,pi,r);
		}
	}
	public static int Partition(ArrayList<Integer> A, int l , int r){
		int mid = A.get(((l+r)/2));
		while(l<=r) {
			
			while(A.get(l)<mid) {
				l++;
			}
			while(mid<A.get(r)) {
				r--;
			}
			if(l<=r) {
				int temp = A.get(l);
				A.set(l, A.get(r));
				A.set(r, temp); 
				l++; r--;
			}
		}
		return l ;
	}
//	MergeSort 
	public static void MergeSort(ArrayList<Integer> arr) {
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr=  new ArrayList<Integer>();
		arr.add(2);arr.add(6);arr.add(3);arr.add(4);arr.add(7); arr.add(-1);
		InsertionSort(arr);
//		QuickSort(arr, 0,4);
//		System.out.println(arr.toString());
	}
}

