package string;

import java.util.ArrayList;
import java.util.Collections;

public class triplet_sum_equla_tozeror {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
//		-1 0 1 2 -1 -4
		System.out.println("sdfds");
		arr.add( 2147483647);arr.add(-2147483648);arr.add(-2147483648);arr.add(0);arr.add(1);
		ArrayList<ArrayList<Integer>> al = threeSum(arr);
		for(ArrayList<Integer> a: al) {
			for(int n  : a) {
				System.out.print(n+ " ");
			}System.out.println();
		}
	}
	  public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
	        Collections.sort(A);
	        ArrayList<ArrayList<Integer>>  arr = new ArrayList<ArrayList<Integer>>();
	        for(int i = 0 ; i<A.size()-2; i++){
	            int l  = i + 1, r = A.size()-1;
	            while(r>l){
	                int sum = A.get(i) + A.get(l) + A.get(r);
	                if(sum==0){
	                    ArrayList<Integer> ar1 = new ArrayList<Integer>();
	                    ar1.add(A.get(i));ar1.add(A.get(l));ar1.add(A.get(r)); 
	                    arr.add(ar1);
	                    l++; r--; sum= -1;
	                }
	                else if(sum>0){
	                    r--;
	                }
	              else 
	                {l++;}
	            }   
	        }
	        return arr;
	    }
}
