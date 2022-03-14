package linkedlistoo;

import java.util.HashSet;

public class Remove_duplicate_in_sorted_and_unsort {
	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
		link l = ob.createLink();
		removeDuplicateUnSortedAndSortedt(l);
		
		System.out.println(ob.printLink(l));
	}

	private static void removeDuplicateUnSortedAndSortedt(link l) {
		link idx = l;
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(l.data);
		idx = l.right;
		while(l.right!=null) {
		if(hs.contains(idx.data) ) {
			l.right = idx .right;
			idx=  idx.right;
			continue;
		}
		hs.add(idx.data);
		l = l.right;idx = idx.right;
		
	}}
}
