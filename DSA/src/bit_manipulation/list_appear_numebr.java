package bit_manipulation;

import java.util.Arrays;
import java.util.List;

public class list_appear_numebr {
	public static void main(String[] args) {
		
		System.out.println(singleNumber2(Arrays.asList(0,0,0,1,1,2,1)));
	}
//only work with 0 to 9
	public  static int singleNumber(final List<Integer> A) {
		int arr[] = new int[10];
		Arrays.fill(arr, -1);
		int prev = 0;
		for (int i = 0; i < A.size(); i++) {
			arr[A.get(i)]++;
		}
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==0) { prev = i;}
		}
		return prev;
	}/*Suitable only for two repeating value  and one no repeating values*/
	public static int singleNumber2(final List<Integer> a) {
	    long xor = 0;
	    for(int te : a){
	        xor = xor ^ te;
	    }
	    
	    return (int)xor;
	}
}
