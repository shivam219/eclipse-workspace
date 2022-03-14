package linkedlistoo;

public class check_palindrom_linkedList {
	public static void main(String[] args) {
		dol_sort_int ob=  new dol_sort_int();
		link head=null;
		link li = ob.createLink(head); // support dobly left and right
		int r = ob.lenlist(li);
		System.out.println(r);
		link rev = linkRev(li);
		System.out.println("s");
		boolean flag = false;
		System.out.println(isPalinLink(li,rev,0,r-1,flag)?"Yes Palindrome":"Not palindrome");
		
	}
		public static boolean isPalinLink(link li, link rev,int l,int r,boolean flag) {
			if(l>=r)return true;
			if(li.data!=rev.data) 
				return false;
		
			return 	isPalinLink(li.right,rev.left,l+1,r-1,flag);
		
	
	}public static link linkRev(link idx) {
			if(idx.right==null) 
				return idx;
		return linkRev(idx.right);
		}
}
