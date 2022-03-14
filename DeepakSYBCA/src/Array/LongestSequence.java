package Array;

import java.util.HashSet;

public class LongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {6,8,7,10,12,11,13,21,23};
		HashSet<Integer> sh=new HashSet<Integer>();//converting into hashset
		for(int i=1;i<a.length;i++) {
			sh.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			if(!sh.contains(a[i]-1)) {
				
			}
		}
		
	}

}
