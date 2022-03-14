package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class check_undirection_grap {
	public static void main(String[] args) {
//		
		
		ArrayList<ArrayList<Integer>> arl1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar[] = new ArrayList[4];
		int n = ar.length;
		for(int i = 0; i<n;i++) {
			ar[i] = new ArrayList<Integer>();
		}
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar2.add(110);
		ar1.add(120);
		arl1.add(ar1);
		arl1.add(ar2);
		
		System.out.println(arl1.get(1).get(0));
		ArrayList<LinkedList<Integer>> arl2  = new ArrayList<>();
		for(int i =0;i<arl2.size();i++) {

		}
		
	}
}