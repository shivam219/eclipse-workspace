package linkedlistoo_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Interview_bit_list {
	public static void main(String[] args) {
		ListNode l = createLink();
//		ListNode l2 = rotateRight(l, 1);
//		System.out.println(solve(l,1));
		ListNode l2 =	reorderList(l);
		printList(l2);
	 
	}

	  public static ListNode reorderList(ListNode A) {
	        if(A==null|| A.next == null || A.next.next == null ) {}
	        ListNode idx = A;
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        ArrayList<Integer> ar = new ArrayList<Integer>();
	        while(idx!=null){
	            arr.add(idx.val);idx = idx.next;
	        }
	        int mid = arr.size()/2; int r = arr.size() - 1;
	        for(int i = 0; i<=mid; ){
	            if(i==r){
	                ar.add(arr.get(i));
	                break; 
	            }
	            ar.add(arr.get(i));
	            ar.add(arr.get(r));
	            ++i;
	            --r;
	        }
	      return  createArrayListToNode(ar, 0 ,arr.size()-1);
	    }
	public static ListNode createArrayListToNode(ArrayList<Integer> arr , int l ,int r ) {
		ListNode ll = null;
		if(l<=r) {
			ll = new ListNode(arr.get(l)); l = l+1;
			ll.next = createArrayListToNode(arr, l, r);
		}
		return ll;
	}
	public static void printList(ListNode l2) {
		while (l2 != null) {
			System.out.print(l2.val+ "   ");
			l2 = l2.next;
		}
	}

	public static ListNode rotateRight(ListNode A, int B) {
		int count = 0;
		ListNode idx = A;
		while (count != B) {
			count = count + 1;
			idx = idx.next;
		}
		ListNode rev = A;
		boolean flag = true;
		count = 1;
		while (flag) {
			if (count == B) {
				rev.next = null;
				flag = false;
				break;
			} else {
				rev = rev.next;
			}
			++count;
		}
		ListNode last = idx;
		while (last.next != null) {
			last = last.next;
		}
		last.next = A;
		return idx;
	}

	public static int solve(ListNode A, int B) {
		ListNode idx = A;
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (idx != null) {
			count = count + 1; arr.add(idx.val);
			idx = idx.next;
		}
		int n = arr.size();
		int mid = (n / 2);
		int i = (mid - B);
		if (i < 0) {
			return -1;
		}

		int r = arr.get(i);
		return r;

	}

	static Scanner sc = new Scanner(System.in);

	static ListNode createLink() {
		int t;
		ListNode root = null;
		System.out.println("Enter data ");
		t = sc.nextInt();
		if (t == -1)
			return null;
		root = new ListNode(t);
		System.out.println("Enter right");
		root.next = createLink();
		return root;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}