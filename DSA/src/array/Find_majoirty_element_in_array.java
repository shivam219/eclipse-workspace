package array;

import java.util.Arrays;

public class Find_majoirty_element_in_array {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,1,3,1,4,1};
		System.out.println(majorityElement(arr));
		
	}

	private static String majorityElement(int[] A) {
		int count  =1, ans =0;
		for(int  i =0;i<A.length;i++) {
			if(A[i]== A[ans])count++;
			else count--;
			if(count==0) {
				count=1;
				ans=i;
			}
		}
		int fre=0;
		for(int i =0; i<A.length;i++) {
			if(A[i]!= A[ans])continue;
			fre++;
		}
//		2 which occurs 2 times which is greater 
//		System.out.println(A[ans]+  " which occurs "+ fre+ " times which is greater");
		return A[ans]+  " which occurs "+ fre+ " times which is greater".toString();
		
		
	}

}
