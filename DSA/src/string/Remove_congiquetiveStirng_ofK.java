package string;

public class Remove_congiquetiveStirng_ofK {

	  public static String solve(String A, int B) {
	        
	        int abc[] = new int[26];
	        for(int i = 0; i<A.length();i++){
	            abc[A.charAt(i)-'a']++; 
	        }
	        String str = "";
	        for(int i = 0; i<A.length();i++){
	        	int n =A.charAt(i)-97;
	            if(abc[n]==B){
	                str = str +"";
	                i= i +B;i--;
	            }
	            else{
	                str +=  A.charAt(i);
	            }
	           
	        }
	        return str;
	    }
	  public static void main(String[] args) {
		  System.out.println(solve("abcddcbsa",2));
	}
}
