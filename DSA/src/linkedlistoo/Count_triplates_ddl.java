package linkedlistoo;

import java.util.HashMap;

public class Count_triplates_ddl {
	public static void main(String[] args) {
		dol_sort_int ob  = new  dol_sort_int();
		link head = null;
		link root= ob.createLink(head);
		System.out.println(countTriplets(root, 17));
		
	}
	static int countTriplets(link head, int x)
	{
	    link ptr, ptr1, ptr2;
	    int count = 0;
	    HashMap<Integer,link> um = new HashMap<Integer,link>();
	    for (ptr = head; ptr != null; ptr = ptr.right)
	        um.put(ptr.data, ptr);
	    // generate all possible pairs
	    for (ptr1 = head; ptr1 != null; ptr1 = ptr1.right)
	        for (ptr2 = ptr1.right; ptr2 != null; ptr2 = ptr2.right) {
	  
	            // p_sum - sum of elements in the current pair
	            int p_sum = ptr1.data + ptr2.data;
	  
	            // if 'x-p_sum' is present in 'um' and either of the two links
	            // are not equal to the 'um[x-p_sum]' link
	            if (um.containsKey(x - p_sum) && um.get(x - p_sum) != ptr1
	                && um.get(x - p_sum) != ptr2)
	  
	                // increment count
	                count++;
	        }
	  
	    // required count of triplets
	    // division by 3 as each triplet is counted 3 times
	    return (count / 3);
	}
}
