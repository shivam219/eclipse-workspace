package interview;

import java.util.Iterator;

public class reverse_string {
	public static void main(String[] args) {

		String s = "abcd";
		String rev = "";
		int len = s.length();
		for(int i =len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		// using array
		char a[] = s.toCharArray();
		String rev2 ="";
		for(int i = a.length-1;i>=0;i--) {
			rev2=rev2+a[i];
		}
		System.out.println(rev2);
		
		StringBuffer sf = new StringBuffer(s);
		
	}
}
