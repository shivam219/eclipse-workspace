package linkedlistoo;

public class Is_linkde_isCirular {
	public static void main(String[] args) {
		dol_sort_int ob = new dol_sort_int();
		link li= ob.createLink();
		System.out.println(isCicular(li)?"yes":"not");
	}

	public static boolean isCicular(link li) {
		link idx = li.right;
		while(idx!=null||idx==null) {
				
			if(idx==li) {
				return true;
			}
			if(idx.right== null) {
				return false;
			}
			idx = idx.right;}
		return false;
	}
	  boolean isCircular(Node head)
	    {
	         Node idx = head.next;
			while(idx!=null||idx==null) {
					
				if(idx==head) {
					return true;
				}
				if(idx.next== null) {
					return false;
				}
				idx = idx.next;}
			return false;
	    }
	  class Node{
			int data;
			Node next;
			Node(int d)
			{
				data = d;
				next = null;
			}
		}

}
