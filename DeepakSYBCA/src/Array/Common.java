package Array;

import java.util.HashSet;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<Integer>();
		int [] arr1= {4,5,8,6,9,2};
		int [] arr2= {5,8,7,6,3,9};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					hs.add(arr1[i]);
					break;
				}
			}
		}
		
		for(int no:hs) {
			System.out.print(arr1[no]+",");
		}
	}

}
