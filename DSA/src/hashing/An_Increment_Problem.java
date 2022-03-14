package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class An_Increment_Problem {

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
	        HashMap<Integer ,Integer> map = new HashMap<Integer,Integer>();
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        ArrayList<Integer> al1 = new ArrayList<Integer>();
	        int n = A.size()-1;
	        for(int i = n ; i>=0; i--){
	        	
	        	if(map.containsKey(A.get(i))) {
	        		map.put(A.get(i), map.get(A.get(i))+1);
	        	
	        		al.add(map.get(A.get(i)));
	        	}else {
	        	map.put(A.get(i), A.get(i));
	        	al.add(map.get(A.get(i)));
	        	}
	        }
	        for(int i = n; i>=0; i--) {
	        	al1.add(al.get(i));
	        }
	      
	        return al1;
	    }
	public static void main(String[] args) {
		int []arr = {  1, 2, 3, 2, 3, 1 };
        ArrayList<Integer> al = new ArrayList<Integer>(); 		
        for(int n : arr) {al.add(n);} 
	 System.out.println(solve(al));
	}
}
