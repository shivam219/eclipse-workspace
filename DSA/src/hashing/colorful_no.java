package hashing;
import java.util.HashSet;

public class colorful_no {
	 public int colorful(int a) {
	        String A = Integer.toString(a);
	        HashSet<Integer> set = new HashSet<Integer>();
	        int prod = 0;
	        for(int i = 0; i < A.length(); i++) {
	            prod = 1;
	            for(int j = i; j < A.length(); j++ ){
	                prod *= A.charAt(j)-'0';   
	                if(set.contains(prod))
	                    return 0;
	                else set.add(prod);    
	            }
	        }
	        return 1; 
	    }
	public static void main(String[] args) {
		colorful_no ob = new colorful_no();
	 System.out.println(ob.colorful(12));
	}
}
